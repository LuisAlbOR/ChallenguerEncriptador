package Main;

import javax.swing.JFrame;


public class Main{
    
    public static void main(String[] args) {
        View.Login.Login login = new View.Login.Login();
        
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setSize(600,600);
    }


}
