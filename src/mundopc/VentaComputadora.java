package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadora {
    public static void main(String[] args) {
    // Crear objetos

        Raton ratonLenovo =  new Raton("bluetooth", "lenovo");
//        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado( "bluetooth", "Lenovo" );
//        System.out.println(tecladoLenovo);

        Monitor monitorLenovo =  new Monitor("Lenovo", 25);
//        System.out.println(monitorLenovo);

        //Creamos un objeto de tipo computadora
        Computadora computadoraLenovo = new Computadora(
                "Computadora lenovo",
                monitorLenovo,
                tecladoLenovo,
                ratonLenovo);

//        System.out.println(computadoraLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor("DELL", 15);
        Teclado tecladoDell = new Teclado("usb", "DELL");
        Raton ratonDell = new Raton("usb", "DELL");
        Computadora computadoraDell = new Computadora("Computadora DELL", monitorDell, tecladoDell, ratonDell);

        // Creamos una orden

        Orden orden1 =  new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOden();

        // Computadora MAC
        Monitor monitorMac = new Monitor("Mac", 30);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac =  new Computadora("MAC", monitorMac, tecladoMac, ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOden();
    }
}