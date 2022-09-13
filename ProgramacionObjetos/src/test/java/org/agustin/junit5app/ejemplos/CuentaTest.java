package org.agustin.junit5app.ejemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CuentaTest {

    @Test
    void testNombreCuenta() {

        Cuenta cuenta = new Cuenta("Agustin");
        String personaEsperada = "Agustin";

        Assertions.assertEquals(personaEsperada,cuenta.getPersona());
    }

    @Test
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Agustin",30000);
        int saldoEsperado = Integer.parseInt("30000");

        Assertions.assertEquals(saldoEsperado,cuenta.getSaldo());
    }

    @Test
    void testDepositarSaldo() {

        Cuenta cuenta = new Cuenta("Agustin",0);
        Assertions.assertEquals(0,cuenta.getSaldo());

        cuenta.depositarSaldo(20000);

        Assertions.assertEquals(20000,cuenta.getSaldo());
    }

    @Test
    void testRetirarSaldoCuandoHayDisponible() {

        Cuenta cuenta = new Cuenta("Agustin",2000);

        cuenta.retirarSaldo(2000);

        Assertions.assertEquals(0,cuenta.getSaldo());

    }

    @Test
    void testRetirarSaldoCuandoNoHayDisponible() {

        Cuenta cuenta = new Cuenta("Agustin",0);

        cuenta.retirarSaldo(2);

        Assertions.assertEquals(0,cuenta.getSaldo());
    }
}