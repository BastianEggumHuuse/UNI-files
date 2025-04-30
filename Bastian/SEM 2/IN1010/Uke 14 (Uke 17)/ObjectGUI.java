// Neccesary GUI imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ObjectGUI
{
    public static void main(String[] args)
    {
        // GUI!!!!!
        try
        {
            // Setting universal Look and Feel
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        }
        catch(Exception e)
        {
            System.out.println("Can't do that boss. [LookAndFeel]");
            System.exit(1);
        }

        JFrame frame = new JFrame("Object_GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        // Getting user name
        String Name = System.getProperty("user.name");
        // Creating a text label
        JLabel Hello = new JLabel("Hello " + Name);
        panel.add(Hello);

        // Creating exit button
        JButton Exit = new JButton("Exit");
        // We're doing events now!!!
        // We require an ActionListener to listen for events. 
        // An object of this class is connected to the JButton's pressed event.
        class ExitListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("Window terminated.");
                System.exit(0);
            }
        }
        Exit.addActionListener(new ExitListener());
        panel.add(Exit);

        // Standard stuff
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }   
}