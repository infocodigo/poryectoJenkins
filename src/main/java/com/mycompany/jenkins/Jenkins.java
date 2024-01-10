/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jenkins;

/**
 *
 * @author k10

public class Jenkins {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}*/

public class Jenkins {

    public static boolean dia_laboral(String dia) {
        switch (dia) {
          case "Lunes":
            return true;
          case "Martes":
            return true;
          case "Miercoles":
          case "miercoles":
          case "miércoles":    
            return true;
          case "Jueves":
            return true;
          case "Viernes":
            return true;
          case "Sabado":
            return false;
          case "Domingo":
            return false;
          default:
            return false;
        }
    }

public static void main(String[] args){

    //string dia;
    
    if(dia_laboral("Lunes") == true){
        System.out.println("Esto es un día laboral porque devuelve TRUE");  
    }else 
        System.out.println("Esto es un día festivo porque devuelve FALSE");
    }
}
