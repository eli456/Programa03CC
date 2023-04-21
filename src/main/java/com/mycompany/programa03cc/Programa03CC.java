/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa03cc;

/**
 *
 * @author Elizabeth PG
 */
public class Programa03CC {

    public static void main(String[] args) {
        
        MensajeAbstracto ma = null;
        IMensaje maI = null;
        
        ma = new MensajeSaludo();
        ma.msg();
        
        ma = new MensajeDespedida();
        ma.msg();
        
        //Realizar instancia anonima 
        
        ma = new MensajeAbstracto() {
            @Override
            public void msg() {
                System.out.println("Instanciar una clase anonima");      
            }
        };
        ma.msg();
        
        maI = new MensajeSaludoI();
        maI.msg();
        
        maI = new MensajeDespedidaI();
        maI.msg();
        
        maI = new IMensaje() {
            @Override
            public void msg() {
                System.out.println("Instanciar Anonimamente la interface");            }
        };
        maI.msg();
    }
}
