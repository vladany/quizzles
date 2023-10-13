package edu.fra.uas.QuizProject.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class QuizController {

    int minLevel1 = 1;
    int maxLevel1 = 4;

    int minLevel2 = 5;
    int maxLevel2 = 10;

    int minLevel3 = 11;
    int maxLevel3 = 15;
    int level1 = (int)Math.floor(Math.random() * (maxLevel1 - minLevel1 + 1) + minLevel1);
    int level2 = (int)Math.floor(Math.random() * (maxLevel2 - minLevel2 + 1) + minLevel2);
    int level3 = (int)Math.floor(Math.random() * (maxLevel3 - minLevel3 + 1) + minLevel3);



    @Autowired
    QuizService quizService;

    @PostConstruct
    private void postInit() {
        System.out.println("Initialized");
        quizService.createQuestion();
    }


    @GetMapping("quiz")
    @ResponseBody
    public Quiz quiz(@RequestParam(value = "quiz", required = false, defaultValue = "") Object term) {
        Quiz quiz = quizService.getQuiz(level1);
        return quiz;
    }

    @GetMapping("quiz2")
    @ResponseBody
    public Quiz quiz2(@RequestParam(value = "quiz2", required = false, defaultValue = "") Object term) {
        Quiz quiz2 = quizService.getQuiz(level2);
        return quiz2;
    }



    @GetMapping("quiz3")
    @ResponseBody
    public Quiz quiz3(@RequestParam(value = "quiz3", required = false, defaultValue = "") Object term) {
        Quiz quiz3 = quizService.getQuiz(level3);
        return quiz3;
    }


    @GetMapping("/check")
    @ResponseBody
    public String check(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(level1);
        String nameCheck = quizService.getQuiz(level1).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }


    @GetMapping("/check2")
    @ResponseBody
    public String check2(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(level2);
        String nameCheck = quizService.getQuiz(level2).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }

    @GetMapping("/check3")
    @ResponseBody
    public String check3(@RequestParam String name) {

        // hier muss random passieren

        quizService.getQuiz(level3);
        String nameCheck = quizService.getQuiz(level3).getOptionRight();
        System.out.println("Got the request");
        if (name.equalsIgnoreCase(nameCheck)){
            return "Korrekt";
        }
        return "Falsch";
    }

}