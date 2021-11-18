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
public class Main {
    public static void main(String[] args) {
        System.out.println("##########Arreglos############");
        
        try{
            String mensajes[] = {"Mensaje uno", "Mensaje dos", "Mensaje tres"};
            for(int i=0; i<=10; i++){
                System.out.println(mensajes[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de rango en el arreglo");
            System.out.println(e);
        }finally{
            System.out.println("A pesar de todo se ejecuta el bloque finally");
        }
        
        System.out.println("############Aritmética###########");
        
        try{
            Integer denominador = null;
            float equis = 5/denominador;
            System.out.println(equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Error general: " + e.getMessage());
        }
        
        System.out.println("################Propagacióm#################");
        try{
            int division = division(10,0);
            System.out.println(division);

        }catch(ArithmeticException e){
            System.out.println("Ocurrió un error: "+ e.getMessage());
        }
        
        System.out.println("###############Propagación 2####################");
        
        int div2 = division2(4,0);
        System.out.println(div2);
        
        System.out.println("##############throw-trhows##############");
        try{
            int div3 = division3(6,0);
            System.out.println(div3);
        }catch(ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
        
        System.out.println("###############Crear nuevas excepciones#################");
        
        Cuenta miCuenta = new Cuenta();
        try{
            miCuenta.depositar(2000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1500);
            miCuenta.consultaSaldo();
            miCuenta.retirar(650);
            miCuenta.consultaSaldo();
        }catch(SaldoInsuficienteException e){
            System.out.println("Error " + e.getMessage());
        }
        
        Cuenta miCuenta2 = new Cuenta(); 
        try{
            miCuenta2.depositar(30000);
            miCuenta2.consultaSaldo();
            miCuenta2.retirar(25000);
        }catch(DineroMax e){
            System.out.println("error: " + e.getMessage());
        }
        try{
            miCuenta2.retirar(400);
            miCuenta2.retirar(500);
            miCuenta2.retirar(1000);
            miCuenta2.retirar(200);
        }catch(RetirosMax e){
            System.out.println("error: " + e.getMessage());
        }
        
    }
    
    private static int division2(int a, int b) {
        int c = 0;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("error "+ e);
        }
        return c;
    }

    private static int division(int a, int b) {
        int c = a/b;
        return c;
    }
    
    private static int division3(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("División entre cero, no lo vuelvas a hacer");
        }
        int c = a/b;
        return c;
    }
}
