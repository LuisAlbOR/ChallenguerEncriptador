public class TestReferencias {
    public static void main(String[] args) {
        Gerente gerenteUno = new Gerente();
        gerenteUno.ingresarNombre("Marco");
        gerenteUno.ingresarSalario(5000.00);

        EditorDeVideo editorDeVideoUno = new EditorDeVideo();
        editorDeVideoUno.ingresarNombre("Ezequiel");
        editorDeVideoUno.ingresarSalario(2500.00);

        Disennador disennadorUno = new Disennador();
        disennadorUno.ingresarNombre("Jared");
        disennadorUno.ingresarSalario(2000.00);

        ControlBonificaciones controlBonificaciones = new ControlBonificaciones();
        controlBonificaciones.registrarSalario(gerenteUno);
        controlBonificaciones.registrarSalario(disennadorUno);
        controlBonificaciones.registrarSalario(editorDeVideoUno);

        System.out.println(controlBonificaciones.obtenerSuma());
    }
}
