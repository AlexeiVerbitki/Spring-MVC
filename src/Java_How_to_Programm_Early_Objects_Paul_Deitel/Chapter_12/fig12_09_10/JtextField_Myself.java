package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_12.fig12_09_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class JtextField_Myself extends JFrame {

    private static JTextField text1;
    private static JTextField text2;
    private static JTextField text3;
    private static JTextField text4;
    private static JPasswordField password;

    public JtextField_Myself() {

        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        text1 = new JTextField(10);
        add(text1);
        text2 = new JTextField("text field 2");
        add(text2);
        text3 = new JTextField("text field 3", 15);
        add(text3);
        text4 = new JTextField("text field 4", 15);
        add(text4);
        password = new JPasswordField("enter your password", 20);
        add(password);

        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener(handler);
        text2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JOptionPane.showMessageDialog(null, "anonymous inner class worked: " + e.getActionCommand());
                                    }
                                }

        );
        text3.addActionListener(text3 -> {
            if (text3.getActionCommand().equals("Your text here"))
                JOptionPane.showMessageDialog(null, "text field 3: " + text3.getActionCommand());
        });
        text4.addActionListener(e -> JOptionPane.showMessageDialog(null, e.getActionCommand() + ": was entered for text4"));

        password.addActionListener(
                new ActionListener() {  //anonymous inner class with added showMessageDialog method
                    String string = "";
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        if (event.getSource() == text1 || event.getSource() == text2 || event.getSource() == text3 || event.getSource() == password)
                            JOptionPane.showMessageDialog(null, event.getActionCommand());
                        string=event.getActionCommand();
                        showMessageDialog();
                    }
                    public void showMessageDialog() {
                        JOptionPane.showMessageDialog(null, string + " again");
                    }
                }

        ); // end anonymus inner class
    }// end constructor

    private class TextFieldHandler implements ActionListener {
        String string = "";

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == text1 || event.getSource() == text2 || event.getSource() == text3 || event.getSource() == password)
                JOptionPane.showMessageDialog(null, event.getActionCommand());
            string = event.getActionCommand();
            showMessageDialog();
        }

        public void showMessageDialog() {
            JOptionPane.showMessageDialog(null, string + "again");
        }
    }

}// end class
