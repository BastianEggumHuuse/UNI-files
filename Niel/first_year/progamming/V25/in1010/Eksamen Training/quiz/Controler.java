import java.awt.Color;
import java.util.Timer;

import javax.swing.JButton;

public class Controler {
    private static Timer timer = new Timer();

    private GUI gui;
    private Model model;

    public Controler() {
        gui = new GUI(this);
        model = new Model();
    }

    public void start() {
        gui.setup();

        askNewQuestion();
        
        gui.show();
    }

    public void optionChosen(String question, String option, JButton btn) {
        btn.setEnabled(false);
        if (model.isCorrect(question, option)) {
            btn.setBackground( new Color(100, 255, 175) );
            timer.schedule( new AskNewQuestionSoon(this), 1000);
        } else {
            btn.setBackground( new Color(255, 100, 100) );
        }
    }

    public void askNewQuestion() {
        String question = model.getRandomQuestion();
        String[] options = model.getOptions(question);
        gui.ask(question, options);
    }
}