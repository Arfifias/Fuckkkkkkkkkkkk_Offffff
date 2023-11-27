import javax.swing.*;
import java.awt.*;

public class Page1 extends JFrame {
    Page1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,800,500);
        this.setLocationRelativeTo(this);
        this.setTitle("My-Shop");
        this.getContentPane().setBackground(new Color(20,70,90));
        this.setVisible(true);
    }

}
