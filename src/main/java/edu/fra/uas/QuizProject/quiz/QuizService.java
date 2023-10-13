package edu.fra.uas.QuizProject.quiz;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuizService {


    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private Quiz quiz;
    public void save(Quiz quiz) {

        quizRepository.save(quiz);
    }

    public Quiz getQuiz(Integer id) {
        Quiz quiz = quizRepository.findById(id).get();
        return quiz;
    }

    public void createQuestion() {

        ArrayList<Quiz> frage = new ArrayList<>();

        // LEVEL 1
        Quiz frage1 = new Quiz(1, "Wie viele Bundeslänger hat Deutschland", "16", "6", "24", "12");
        Quiz frage2 = new Quiz(2, "Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage3 = new Quiz(3, "Wie nennt man ein männliches Schwein?", "Eber", "Erpel", "Bock", "Hengst");
        Quiz frage4 = new Quiz(4, "Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");

        Quiz frage5 = new Quiz(5, "Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");
        Quiz frage6 = new Quiz(6, "Thats level 2", "16", "6", "24", "12");
        Quiz frage7 = new Quiz(7, "Thats level 2Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage8 = new Quiz(8, "Thats level 2Was versteht man unter einem String?", "Zeichenkette", "Zahlenkette", "Datenkette", "Wahrheitswert");
        Quiz frage9 = new Quiz(9, "Thats level 2Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");
        Quiz frage10 = new Quiz(10, "Thats level 2Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");

        Quiz frage11 = new Quiz(11, "Thats level 3 Welcher der Inseln gehört nicht zu den Balearischen Inseln?", "Malta", "Cabrera", "Formentera", "Mallorca");
        Quiz frage12 = new Quiz(12, "Thats level 3Was ist der höchste Berg?", "Mount Everest", "Zugspitze", "Mont Blanc", "Dolomiten");
        Quiz frage13 = new Quiz(13, "Thats level 3Wie nennt man ein männliches Schwein?", "Eber", "Erpel", "Bock", "Hengst");
        Quiz frage14 = new Quiz(14, "Thats level 3Wofür stehen die olympischen Ringe?", "Kontinente", "Disziplinen", "Jahreszeiten", "Frieden");
        Quiz frage15 = new Quiz(15, "Thats level 3Welcher Planet ist der Sonne am nähsten?", "Merkur", "Jupiter", "Mars", "Uranus");

        frage.add(frage1);
        frage.add(frage2);
        frage.add(frage3);
        frage.add(frage4);
        frage.add(frage5);

        frage.add(frage6);
        frage.add(frage7);
        frage.add(frage8);
        frage.add(frage9);
        frage.add(frage10);
        // LEVEL 3
        frage.add(frage11);
        frage.add(frage12);
        frage.add(frage13);
        frage.add(frage14);
        frage.add(frage15);

        quizRepository.save(frage1);
        quizRepository.save(frage2);
        quizRepository.save(frage3);
        quizRepository.save(frage4);
        quizRepository.save(frage5);

        quizRepository.save(frage6);
        quizRepository.save(frage7);
        quizRepository.save(frage8);
        quizRepository.save(frage9);
        quizRepository.save(frage10);

        quizRepository.save(frage11);
        quizRepository.save(frage12);
        quizRepository.save(frage13);
        quizRepository.save(frage14);
        quizRepository.save(frage15);
    }
}

