package Matrices;

public class Matriz{

    public static void main(String[] args) {

        int [][] Matriz = {{2,4,4},{6,6,9},{8,10,12}};
        int x;
        int y;

        // for hace el recorrido por el número de filas 
        for (x=0; x < Matriz.length; x++)
        {
            System.out.println("Fila "+ x);
        }


        /* x recorrido por la posicion de las filas
           y recorrido por la posición de las columnas*/
        
           for (x = 0; x < Matriz.length; x++)
        {
            for (y = 0; y < Matriz[x].length;y++ )
            System.out.println(Matriz[x][y]);
        }
     

    }

}
