public class TesteControlBonificaciones {
    public static void main(String[] args) {
        Funcionario funcionarioIliany = new Funcionario();
        funcionarioIliany.ingresarNombre("Iliany");
        funcionarioIliany.ingresarSalario(2000.00);
        //Se crea objeto de control de bonificaciones
        ControlBonificaciones controlBonificaciones = new ControlBonificaciones();
        controlBonificaciones.registrarSalario(funcionarioIliany);
        //System.out.println("Bonificación funcionario " + funcionarioIliany.obtenerNombre() + ": " + controlBonificaciones.registrarSalario(funcionarioIliany));
       //Ahora viene un ejemplo de polimorfismo
        Gerente gerenteMeme = new Gerente();
        gerenteMeme.ingresarNombre("Meme");
        gerenteMeme.ingresarSalario(10000.00);
        controlBonificaciones.registrarSalario(gerenteMeme);
        //System.out.println("Bonificación gerente " + gerenteMeme.obtenerNombre() + ": " + controlBonificaciones.registrarSalario(gerenteMeme));
        //Se crea un objeto contador
        Contador contadorWilliam = new Contador();
        contadorWilliam.ingresarNombre("William");
        contadorWilliam.ingresarSalario(5000.00);
        controlBonificaciones.registrarSalario(contadorWilliam);
        //System.out.println("Bonificación contador " + contadorWilliam.obtenerNombre() + ": " + controlBonificaciones.registrarSalario(contadorWilliam));
    }
}
