import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Model {
    private static Random rand = new Random();

    private final int NO_REPEAT_GARANTEE = 20;

    private HashMap<String, HashMap<String, String[]>> questionMap;
    private ArrayList<String> questions;
    private ArrayList<String> questionsLog;

    public Model() {
        try {
            questionMap = fileToHashMap("questions.html");
        } catch (Exception e) {
            System.out.println("Error: Failed to get questions. File \"./questions.html\" not found.");
            System.exit(1);
        }
        questions = new ArrayList<>(questionMap.keySet());
        questionsLog = new ArrayList<>();
    }

    private HashMap<String, HashMap<String, String[]>> fileToHashMap(String filename) throws FileNotFoundException {
        HashMap<String, HashMap<String, String[]>> map = new HashMap<>();

        Scanner reader = new Scanner( new File(filename) );
        while (reader.hasNextLine()) {
            HashMap<String, String[]> qMap = new HashMap<>();

            String l = reader.nextLine();
            String[] line = l.split(" \\$ ");
            if (line.length < 4) continue; // A question needs at least the question, the answer and 2 options

            String question = line[0];
            String[] answer = {line[1]};

            String[] options = new String[line.length-2];
            for (int i = 2; i < line.length; i++) {
                options[i-2] = line[i];
            }
            qMap.put("options", options);
            qMap.put("answer", answer);

            map.put(question, qMap);
        }
        reader.close();

        return map;
    }

    public String getRandomQuestion() {
        String question;
        int maxIterates = 100;
        do {
            int r = rand.nextInt(questions.size());
            question = questions.get(r);
            maxIterates--;
        } while(questionsLog.contains(question) && maxIterates > 0);
        questionsLog.add(question);

        if (questionsLog.size() > NO_REPEAT_GARANTEE) questionsLog.removeFirst();

        return question;
    }

    public String[] getOptions(String question) {
        return questionMap.get(question).get("options");
    }

    public boolean isCorrect(String question, String answer) {
        int correctAnswer = Integer.parseInt( questionMap.get(question).get("answer")[0] );
        return getOptions(question)[correctAnswer].equals(answer);
    }
}
