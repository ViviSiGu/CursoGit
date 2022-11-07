package Curso_Basico;

public class Main {

//Metodo main - estatico que no devuelve ningun resultado(Void)
    public static void  main (String args[])
    {
        // Instanciar la clase
        // Nombre de la clase: Perro
        // Variable de tipo Perro llamada P

        //Perro P = new Perro();
        //P.Nombre = "Firulais";
        //P.Altura = "50";
        

        // System.out.println(P.Comer("Carne"));
        Gato G = new Gato();
        G.SetNombre("Tom");
        G.Raza = "Criollo";
        G.Altura = "30";
        

        Loro L = new Loro();
        L.SetNombre("Poli");
     
        System.out.println(G.GetNombre());
        System.out.println(L.GetNombre());


        Ruido (G);
        Ruido (L);
    }


    public static void Ruido(Animal A)
    {
        System.out.println(A.GetNombre()+ " hace "+ A.HacerRuido());

    }

    
}
