//Viviana Yineth Sierra Guzmán
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Notas_Array {

    public static void main (String[] args)  {

        // Ingreso de datos por consola
        Scanner Entrada = new Scanner( System.in);

        // Declaración de variables para cálculos
        float Sum_Notas = 0;
        float Prom_Notas = 0;
    
        // Declaración del arreglo de 6 posiciones (6 Notas)
        float [] Notas = new float [6];
    
        /*Ingreso de notas hasta que i sea menor de la longitud del arreglo 
          i++ aumento de i en 1 cada vez que se ejecute el for */
        for (int i = 0; i < Notas.length ; i++)
        {
            System.out.println("Ingrese la nota ");
            //Ingreso de datos al arreglo
            Notas[i] = Entrada.nextFloat();

            
        }
        Entrada.close();

        //Sumatoria de notas de acuerdo al valor alojado en cada posicion de i
        for (int i = 0; i < Notas.length ; i++)
        {
            Sum_Notas = Sum_Notas + Notas[i];
        }

        for (int i = 0; i < Notas.length ; i++)
        {
            /* Promedio de notas es igual a la sumatoria de notas entre la longitud del arreglo
               es decir cantidad de posiciones o cantidad de notas */
            Prom_Notas = Sum_Notas / Notas.length;
             
        }

        System.out.println("*************************" );
        System.out.println("Promedio:" + Prom_Notas);   

        System.out.println("*************************" );
        System.out.println("Notas orden descendente"); 


        /*Organización de arreglos 
          Uso de método sort */
          
        Arrays.sort(Notas);
        for ( int i = Notas.length - 1 ; i >= 0; i--)
        {
            System.out.println( Notas[i]);
        }
        
        System.out.println("*************************" );
        System.out.println("Notas orden ascendente"); 

        Arrays.sort(Notas);
        for ( int i = 0; i < Notas.length ; i++)
        {
            System.out.println( Notas[i]);
        }
    }
}
