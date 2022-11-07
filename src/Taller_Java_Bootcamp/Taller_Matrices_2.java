//Viviana Yineth Sierra Guzmán
package Taller_Java_Bootcamp;

import java.util.Scanner;


public class Taller_Matrices_2 {

    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);

        String [][] Paises = new String [4][4];
        int x;
        int y;
        String Matriz_Pais = "";

        //Ingreso de datos hasta que se llegue al limite de 4
        System.out.println("Datos de paises y ciudades");
        System.out.println("------------------------------");

        // For de almacenamiento de datos de los paises
        for(x = 0; x < Paises.length; x++)
        {
            System.out.println("Nombre del país #"+ (x+1) + ":");
            Paises[x][0] = Entrada.nextLine();
            
        }

        
       for(y = 0; y < Paises.length; y++)
        {
            System.out.println("--------------------------------------");
            for (x = 1; x < Paises.length; x++)// Inicio de columnas desde la posición #1 de la matriz
            {
                System.out.println("Nombre de la ciudad del pais #"+ (y+1)+ " :");
                Paises[y][x] = Entrada.nextLine(); // Ingreso de los datos en las demas columnas y filas

            }
        } 

        //Lectura de todos los datos contenidos en la matriz de los paises
        for(x = 0; x <Paises.length; x++)
        {
            for(y = 0; y < Paises.length; y++)
            {
                Matriz_Pais += Paises[x][y] + "              ";
                
            }
            Matriz_Pais += "\n";
        }
        System.out.println(Matriz_Pais);// Impresión de los datos de la matriz

        Entrada.close();
    }
    
}
