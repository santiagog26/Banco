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

    public double retirarDinero(double cantidad){
        if(cantidad <= this.tipoCuenta.saldo){
            this.tipoCuenta.saldo = this.tipoCuenta.saldo - cantidad;
            System.out.println("Transacción exitosa\n");
            System.out.println("Su nuevo saldo es de $" + this.tipoCuenta.saldo);
            return this.tipoCuenta.saldo;
        }else{
            System.err.println("Error en la transacción\n");
            System.out.println("Saldo insuficiente, su saldo actual de $" + this.tipoCuenta.saldo + " inalcanzable para retirar $" + cantidad);
            return this.tipoCuenta.saldo;
        }
    }

    public double consultarSaldoCuenta(){
        System.out.println("Saldo actual de $" + this.tipoCuenta.saldo);
        return this.tipoCuenta.saldo;
    }

}
