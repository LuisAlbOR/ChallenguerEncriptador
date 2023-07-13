package Main;

import Controller.Login.ControllerLogin;

public class Main {
    
    public static void main(String[] args) {
        View.Login.Login login = new View.Login.Login();
        Controller.Login.ControllerLogin controllerLogin = new ControllerLogin(login);
        controllerLogin.executeView();
    }

}
