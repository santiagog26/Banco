import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void retirarDinero(){
        Cliente cliente = new Cliente("Carlos",1006850580,new Cuenta(127856,20000),"Cedula");
        double r = cliente.retirarDinero(12000);
        double r2 = cliente.retirarDinero(250);
        assertEquals(8000,r,0.01);
        assertEquals(7750,r2,0.01);
    }

    @Test
    public void consultarSaldoCuenta(){
        Cliente cliente = new Cliente("Carlos",1006850580,new Cuenta(127856,20000),"Cedula");
        double c = cliente.consultarSaldoCuenta();
        assertEquals(20000,c,0.01);
    }
}