package Estructuras_Selectivas;

public class Continue_2 {

    public static void main(String[] args) {

        System.out.println("Tabla de multiplicar del 3: ");

        for (int i = 0; i <= 10; i++)
        {
            if (i <= 2)
            {
                System.out.println("Condición Continue Cumplida");
                continue; // Continue devuelve el control al for 
            }
    
            System.out.println(3 + " * " + i + " = " + 3 * i);
        }
        
    
    }



    
}
