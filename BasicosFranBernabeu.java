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
    }  // TODO code application logic here

  
    public static void cadenas() {
        
        
   
        char cadenas = 'F';
        char cadenas1 = 'r';
        char cadenas2 = 'a';
        char cadenas3 = 'n';
        String cadenas4 = "Fran Bernabeu Agullo";
        
        System.out.println("Nombre:");
        System.out.println(cadenas);
        System.out.println(cadenas1);
        System.out.println(cadenas2);
        System.out.println(cadenas3);
        System.out.println("Nombre completo");
        System.out.println(cadenas4);
    }
    private static void logicos() {
        boolean blanco;
        boolean negro;
        
        blanco = true;
        negro = false;
   
   
        System.out.println("Color Blanco");
        System.out.println(blanco);
        System.out.println("Color Negro");
        System.out.println(negro);
        System.out.println("Color Gris");
        System.out.println(blanco && negro);
        System.out.println("Blanco o negro");
        System.out.println(blanco || negro);
   
   
    }
public static void main(String[] args) {
        numericos();
        cadenas();
        logicos();
       }
}
   



