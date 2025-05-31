import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    private final int QUESTION_CONT_WIDTH = 500;

    private Controler controler;

    private JFrame mainFrame;
    private JPanel mainPanel;

    private JPanel header;
    
    private JPanel body;
    private JTextPane question;
    private JPanel options;

    private JButton[] optionButons;

    public GUI(Controler controler) {
        this.controler = controler;
    }

    public void setup() {
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch(Exception e) { }
        
        //* SETUP
        mainFrame = new JFrame("Quiz");
        mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        mainPanel = new JPanel();
        mainPanel.setLayout( new GridBagLayout() );
        mainFrame.add(mainPanel);
        
        //* HEADER
        // I don't use the header right now. Maybe in the future?
        header = new JPanel();
        
        // Positiion and layout of header
        GridBagConstraints headerLayout = new GridBagConstraints();
        headerLayout.fill = GridBagConstraints.HORIZONTAL;
        headerLayout.gridwidth = 3; // Take up 3 columns
        headerLayout.gridx = 0; // Start left ...
        headerLayout.gridy = 0; // ... and top, then take up 3 columns making span from left to right
        mainPanel.add(header, headerLayout);
        
        //* BODY
        body = new JPanel();
        body.setLayout( new BorderLayout() );

        // Position and layout of body
        GridBagConstraints bodyLayout = new GridBagConstraints();
        bodyLayout.fill = GridBagConstraints.HORIZONTAL;
        bodyLayout.gridx = 1; // Center x
        bodyLayout.gridy = 1; // Center y
        bodyLayout.insets = new Insets(75, 75, 75, 75);
        mainPanel.add(body, bodyLayout);
        
        // Add the questions label and options container
        question = new JTextPane();
        question.setPreferredSize(new Dimension(QUESTION_CONT_WIDTH, 200));
        question.setContentType("text/html"); // Allow the use of HTML, this makes sure long sentences break into new lines
        question.setText("<html>Spørsmål kommer her!</html>");
        // question.setFont( new Font("Calibri", Font.PLAIN, question.getFont().getSize()) );
        question.setEditable(false);
        body.add(question, BorderLayout.NORTH);
        
        options = new JPanel();
        body.add(options, BorderLayout.CENTER);
    }

    public void ask(String question, String[] options) {
        // Use <br> as linebreak in question
        if (question == null || options == null || question.isBlank() || options.length == 0) throw new IllegalArgumentException();

        this.question.setText("<html><span style=\"font-size:15px;\">"+question+"</span></html>");

        // Remove all existing buttons from the variable and GUI
        optionButons = new JButton[options.length];
        for (Component c : this.options.getComponents()) {
            this.options.remove(c);
        }

        this.options.setLayout( new GridLayout((int) Math.ceil(((double) options.length) / 2), 2) );

        for (int i = 0; i < options.length; i++) {
            JButton btn = new JButton("<html>"+options[i]+"</html>");
            btn.setPreferredSize( new Dimension(QUESTION_CONT_WIDTH/2, 75) );
            btn.setBackground( new Color(250, 250, 250) );

            class OptionChosen implements ActionListener {
                String q, o;
                JButton b;
                OptionChosen(String q, String o, JButton b) { this.q = q; this.o = o; this.b = b; }

                @Override
                public void actionPerformed(ActionEvent e) {
                    controler.optionChosen(q, o, b);
                }
            }
            btn.addActionListener( new OptionChosen(question, options[i], btn) );
            
            optionButons[i] = btn;
            this.options.add(btn);
        }

        // Pack again to show everything correctly
        mainFrame.pack();
    }

    public void show() {
        if (mainFrame == null) throw new NullPointerException("The main frame must be set in setup() before being shown.");

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
