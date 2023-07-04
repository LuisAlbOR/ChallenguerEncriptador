package View;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Menu extends JFrame implements ActionListener{

    private JLabel welcomeMessage, imageApp;
    private JButton btnStar;
    public Menu() {
        //Se inicializan los componentes de forma personalizada
        setLayout(null);
        setTitle("Menu");
        getContentPane().setBackground(new Color(42, 193, 246));
//      setIconImage(new ImageIcon(getClass().getResource("Resource/logoApp.png")).getImage());

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("Resource/logoApp.png"));
        imageApp = new JLabel(imageIcon);
        imageApp.setBounds(150,50,300,300);
        add(imageApp);

        welcomeMessage = new JLabel("EXCHANGE");
        welcomeMessage.setBounds(235,305,150,20);
        welcomeMessage.setFont(new Font("Verdana",Font.BOLD,20));
        welcomeMessage.setForeground(new Color(255,255,255));
        add(welcomeMessage);

        btnStar = new JButton("Press to enter");
        btnStar.setBounds(200,355,200,30);
        btnStar.setBackground(new Color(110, 67, 192));
        btnStar.setFont(new Font("Verdana",Font.BOLD,16));
        btnStar.setForeground(new Color(255,255,255));
        btnStar.addActionListener(this);
        add(btnStar);
    }

    @Override
    public void actionPerformed(ActionEvent evt){

    }

    public static void main(String[] args) {
        Menu output = new Menu();
        output.setBounds(0,0,600,600);
        output.setVisible(true);
        output.setResizable(false);
        output.setLocationRelativeTo(null);
        output.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
