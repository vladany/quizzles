package edu.fra.uas.config;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import edu.fra.uas.security.model.Role;
import edu.fra.uas.security.model.User;
import edu.fra.uas.security.repository.UserRepository;
import jakarta.annotation.PostConstruct;

@Component
public class InitializeDB {

    private static final Logger log = LoggerFactory.getLogger(InitializeDB.class);

   
    
    @Autowired
    UserRepository userRepository;
    
    @PostConstruct
    public void init()  {
    	log.debug(" >>> init database");
            
        User user = new User();
        user.setNickname("admin");
        user.setEmail("admin@example.com");
        user.setPassword("admin");
        user.setRole(Role.ADMIN);
        userRepository.save(user);

        user = new User();
        user.setNickname("armin");
        user.setEmail("arminlehmann@frauas.com");
        user.setPassword("armin1234");
        user.setRole(Role.USER);
        userRepository.save(user);
        
        user = new User();
        user.setNickname("enes");
        user.setEmail("enes@example.com");
        user.setPassword("enes1234");
        user.setRole(Role.USER);
        userRepository.save(user);

        user = new User();
        user.setNickname("yalcin");
        user.setEmail("yalcin@aol.com");
        user.setPassword("yalcin1234");
        user.setRole(Role.USER);
        
        user = new User();
        user.setNickname("vlada");
        user.setEmail("vlada@hotmail.com");
        user.setPassword("vlada1234");
        user.setRole(Role.USER);
        
        user = new User();
        user.setNickname("antonia");
        user.setEmail("antonia@hotmail.com");
        user.setPassword("antonia1234");
        user.setRole(Role.USER);
        
        
    }
}