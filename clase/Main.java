package Org.umg.clase;

import Org.umg.clase.Persona;

public class Main {
    public static void main(String[] args) {
         TablaPronostico tabla= new TablaPronostico();
         tabla.calculos();
    }


}
        
           // Persona[] persona = new Persona[3];
        //asignar el objeto persona
       // persona [0] = new Persona("Juan",20);
       // persona [1] = new Persona( "Maria",26);
        //persona [2] = new Persona( "Carlos",29);
        
      //  for (Persona persona: personas){
          //  System.out.println(persona);
      //  }
        //ahora con matrix 
     /*   Persona[][] matrix = new Persona[2][2];
        matrix [0][0] = new Persona("Juan",20);
        matrix [0][1] = new Persona( "Maria",26);
        matrix [1][0] = new Persona( "Pedro",29);
        matrix [1][1] = new Persona("Juan",21);

        for (Persona[] fila: matrix){
            for (Persona persona : fila ){
            System.out.println(persona);
        }

    }
    }
