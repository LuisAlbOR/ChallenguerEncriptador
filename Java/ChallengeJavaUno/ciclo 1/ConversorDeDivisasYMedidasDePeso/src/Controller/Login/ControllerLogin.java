package Controller.Login;

import javax.swing.JFrame;

public class ControllerLogin  implements Model.Views{

    private View.Login.Login objetoLogin;
    
    public ControllerLogin(View.Login.Login objetoLogin){
        this.objetoLogin = objetoLogin;
    }
    
    public ControllerLogin(){
        
    }
    
    @Override
    public void executeView() {
        objetoLogin.setVisible(true);
        objetoLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objetoLogin.setBounds(0, 0, 600,600);
        objetoLogin.setLocationRelativeTo(null);
        objetoLogin.setResizable(false);  
        System.out.println("Entre");
    }
    
    @Override
    public void closeView(){
        System.out.println("Entre");
        objetoLogin.setVisible(false);
    }
}
