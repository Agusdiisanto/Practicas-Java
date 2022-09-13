package org.agustin.junit5app.ejemplos;

import javax.swing.*;

public class Cuenta {

    private final String persona; // los colaboradores siempre tienen que ser privados (solo puede acceder la clase)
    private int saldo;


    public Cuenta(String persona) {
        this.persona = persona;
    }

    public Cuenta(String persona, int saldo) {   //Optimizando el constructor
        this(persona);
        this.saldo = saldo;
    }

    public String getPersona() {  // metodo y/o mensaje
        return persona;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositarSaldo(int saldoADepositar){
        this.saldo = saldo + saldoADepositar;
    }

    public void retirarSaldo(int saldoARetirar){  // void no retorna nada solo modifica

        if (getSaldo() >= saldoARetirar){
            this.saldo = saldo - saldoARetirar;
        }
        else{
            this.saldo = 0;
            JOptionPane.showMessageDialog(null, "No hay suficiente saldo para retirar");
        }
    }
}
