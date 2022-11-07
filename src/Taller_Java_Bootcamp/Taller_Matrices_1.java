//Viviana Yineth Sierra Guzmán
package Taller_Java_Bootcamp;

public class Taller_Matrices_1 {

    public static void main(String[] args) {

        //Declaración del arreglo de 4 Columnas(Idiomas) y tres filas(Niveles) 
        int [][] Alumnos = {{6,12,18,2},{5,10,15,3},{1,14,20,8}} ;
        int x; 
        int y;

        System.out.println("Inglés  Francés  Alemán     Ruso" );
        //For inicial de recorrido por las posiciones de las filas
        for(x = 0;x < Alumnos.length; x++)
        {
            //For anidado de recorrido por las colunmas
            for(y = 0; y <  Alumnos[x].length; y++)

            //Impresion de valores de filas y columnas 
            System.out.print(Alumnos[x][y] + "        ");
            System.out.println("");
        }
    }
}
