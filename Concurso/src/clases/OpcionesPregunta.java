
package clases;

public class OpcionesPregunta {
    //preguntas nivel 1 ? nivel 2 etc 
    String[] preguntasNivel1 = {
        "¿Qué religión tiene la Torá como su libro sagrado?", "¿Cuál es el animal más grande de la Tierra?", 
        "¿Cuántos huesos tiene el cuerpo humano?","¿Con qué moneda pagas si vas a Japón?",
        "Quién postuló las leyes del movimiento","¿Cuál es el país más pequeño?", 
        "¿Cuál es el país más grande?", "¿Cuál es el océano más grande del mundo?",
        "¿Dónde está Transilvania?", "¿Cuál es el río más largo del mundo?", 
        "¿Cuándo murió Freddie Mercury?", "¿Cuál es el álbum musical más vendido de la historia?", 
        "¿Cuántas notas musicales existen?","¿De qué grupo formaba parte Paul McCartney?", 
        "¿Qué célebre compositor clásico era sordo?", "¿¿En qué año cayó el muro de Berlín?", 
        "¿En qué año empezó la segunda guerra mundial?", "¿Cuál fue la primera civilización humana?",
        "¿Cuántos años duró La Guerra de los Cien Años?", "¿Qué año llegó el ser humano a la Luna?", 
        "¿Cuál es la película más taquillera de la historia?", "¿Quién dirigió la trilogía de El Padrino?",
        "¿Cuál fue la primera película de Disney?","¿Cuántas películas de Harry Potter se han hecho?",
        "¿Quién ha protagonizado la saga de Indiana Jones?",
    };
    
    
    //Buscar como se puede obtener posicion ramdon 
    public String getOpciones(int posicion){
        return preguntasNivel1[posicion];
    }
}