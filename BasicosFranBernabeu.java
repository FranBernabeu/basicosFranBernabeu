/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosfranbernabeu;

/**
 *
 * @author Virginia
 */
public class BasicosFranBernabeu {

   
         
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        elMasPeque = 1;
        chiquitin = 125;
        duplicaEntero = 523698710;
        grande = 500;
        
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
        System.out.println("Menor unidad");
        System.out.println(elMasPeque);
        System.out.println("Valor de cien");
        System.out.println(chiquitin);
        System.out.println("Valor muy grande");
        System.out.println(duplicaEntero);
        System.out.println("Valor redondo");
        System.out.println(grande);
    }
         public static void main(String[] args) {
        numericos();
}   // TODO code application logic here
}


