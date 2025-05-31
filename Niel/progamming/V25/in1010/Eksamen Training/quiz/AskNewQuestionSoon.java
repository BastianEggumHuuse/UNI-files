import java.util.TimerTask;

public class AskNewQuestionSoon extends TimerTask {
    private Controler controler;

    public AskNewQuestionSoon(Controler controler) {
        this.controler = controler;
    }

    @Override
    public void run() {
        controler.askNewQuestion();
    }
}
