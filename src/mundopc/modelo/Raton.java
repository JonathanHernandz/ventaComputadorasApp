package mundopc.modelo;

public class Raton extends DispositivoEntrada{
    private  final  int idRaton; // Lo inicializamos en un constructor
    private  static int contadorRatones;

    // Constructor
    public Raton( String tipoDeEntrada, String marca ){

        super(tipoDeEntrada, marca); // Inicializamos el constructor del padre
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "}" + super.toString();
    }
}
