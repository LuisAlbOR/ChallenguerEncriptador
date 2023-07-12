package Controller.Menu;

import javax.swing.JFrame;


public class ControllerMenu implements Model.Views{

    private View.Menu.Menu objetoMenu;
    
    public ControllerMenu(View.Menu.Menu objetoMenu){
        this.objetoMenu = objetoMenu;
    }
    
    public ControllerMenu(){
        
    }
    @Override
    public void executeView() {
        objetoMenu.setVisible(true);
        objetoMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objetoMenu.setBounds(0, 0, 600,600);
        objetoMenu.setLocationRelativeTo(null);
        objetoMenu.setResizable(false);     
    }

    @Override
    public void closeView() {
        
    }
    
    
}
