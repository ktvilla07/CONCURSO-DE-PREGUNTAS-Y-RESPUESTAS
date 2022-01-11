
package clases;

public class Niveles {
    String[] niveles = {
        "Nivel 1:Cultura general", "Nivel 2:Geografía", 
        "Nivel 3:Música ","Nivel 4: Historia", "Nivel 5: Películas"};

  public String getNiveles(int posicion){
      int nivel;
      if (posicion<5){
          nivel= 0;
      } else if (posicion <10){
                  nivel =1;
                  } else if(posicion < 15){
                      nivel = 2;
                  } else if(posicion < 20){
                      nivel = 3;
                  }else{
                      nivel = 4;
                  }
      
        return niveles[nivel];
    }

}