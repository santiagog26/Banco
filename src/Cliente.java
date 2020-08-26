public class Cliente {
    String nombre;
    String tipoDocumento;
    int numeroIdentificaion;
    Cuenta tipoCuenta;


    public Cliente(String nombre, int numeroIdentificaion, Cuenta tipoCuenta, String tipoDocumento) {
        this.nombre = nombre;
        this.numeroIdentificaion = numeroIdentificaion;
        this.tipoCuenta = tipoCuenta;
        this.tipoDocumento = tipoDocumento;
    }

}
