import javax.swing.*;
import java.awt.*;

public class Apic {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    Apic(){

        label.setText("Fuck OFF!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setForeground(new Color(0,0,0));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(20,89,100));
        frame.setBounds(0,0,700,700);
        frame.setLocation(650,200);
        frame.setTitle("Hello There How Are You");
        frame.add(label);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
