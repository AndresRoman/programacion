package ejercicio2.pkg12042017;
import java.util.Scanner;
/**
 * Autor: AndrÃ©s RomÃ¡n Bustos
 * Fecha: 12/04/17
 **/
public class Ejercicio212042017 {
    /**
     * Taller  
     * Ejercicio 1
     * Programa que imprima las horas en min, seg y dias
     **/  
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        // Creacion de variables
        int horas=0, min=0, seg=0;
        double dias=0;
        
        // Solicitud de variabes al usuario
        System.out.print("Introduzca el numero de horas a convertir: \n");
        horas=datos.nextInt();
        
        // Operaciones
        min=horas*60;
        seg=horas*3600;
        dias=horas/24;
        
        // Salida en pantalla
        System.out.print(+horas+" horas son: "+min+" minutos \n");
        System.out.print(+horas+" horas son: "+seg+" segundos \n");
        System.out.print(+horas+" horas son: "+dias+" dias \n");
        
    }
    
}
