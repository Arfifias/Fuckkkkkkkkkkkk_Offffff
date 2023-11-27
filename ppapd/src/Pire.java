import javax.swing.*;
import java.awt.*;


public class Pire {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton button = new JButton();

    Pire(){

        label.setText("What are you up to?");
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setForeground(new Color(0,0,0));

        button.setText("Click Me");
        button.setBackground(new Color(20,80,20));
        button.setFont(new Font("Arial",Font.BOLD,20));
        button.addActionListener(e -> new Apic());
        button.addActionListener(e -> frame.dispose());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(20,89,100));
        frame.setBounds(0,0,700,700);
        frame.setLocation(650,200);
        frame.setTitle("Hello There How Are You");
        frame.add(button);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
