/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop10;

/**
 *
 * @author lenovo
 */
public class Cuenta {
    private double saldo;
    private int numRetiros;

    public Cuenta() {
    }
    
    public Cuenta(double saldo) {
        saldo = 0;
    }
    
    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, RetirosMax, DineroMax{
        numRetiros ++;
        if(numRetiros > 3)
            throw new RetirosMax();
        else{
            System.out.println("Retirando " + monto);
            if(saldo <= monto)
                throw new SaldoInsuficienteException();
            if(monto > 20000)
                throw new DineroMax();
            saldo -= monto;
        }
    }
    
    public void consultaSaldo(){
        System.out.println(saldo);
    }
    
}
