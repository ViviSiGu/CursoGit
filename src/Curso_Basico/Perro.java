package Curso_Basico;

//Implements más el nombre de las acciones trae los metodos que se encuentran en la interfaz
public class Perro implements Acciones {

    // Atributos
    public String Nombre;
    public String Raza;
    public String Altura;


    //Metodo comer
    //Public: Modificador del metodo 
    //String: Tipo que va a devolver el método
    //Comer: Nombre del metodo
    //(String Alimento): Posibles parametros del método

    public String Comer(String Alimento)
    {
        return Nombre + " , mide " + Altura + " cm y come "+ Alimento;
    } 

    public String Dormir()
    {
        return "";
    }

    // Metodos provenientes de la interfaz Acciones
    @Override
    public String Correr() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String Nadar() {
        // TODO Auto-generated method stub
        return null;
    }
        
  
}
