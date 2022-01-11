
package clases;

import java.util.StringTokenizer;


public class Respuestas {
    //respuestas correctas
    
    String[] respuestas = {
        "Judaismo","Ballena azul","206","Yen","Isaac Newton","Ciudad del Vaticano","Rusia",
        "Pacífico","Rumanía","Amazonas","1991","Thriller de Michael Jackson","12","The Beatles",
        "Ludwig van Beethoven","1989","1939","Sumeria","116","1969","Vengadores Endgame",
        "Francis Ford Coppola","Blancanieves y los siete enanitos", "8","Harrison Ford"
    };
    
    //respuestas  
    String[] radioR = {
        "Islam,Hinduismo,Judaismo,Cristianismo",
        "Orca,Ballena azul,Anaconda,Elefante",
        "206,189,201,194",
        "Euro,Franco,Dólar,Yen",
        "Marie Curie,Isaac Newton,Niels Bohr,Albert Einstein",
        "Mónaco,San Marino,Ciudad del Vaticano,Chipre",
        "Brasil,Canadá,Rusia,China",
        "Índico,Atlántico,Pacífico,Ártico",
        "Rumanía,Alemania,Francia,Irlandia",
        "Támesis,Nilo,Mississippi,Amazonas",
        "1991,1995,1999,1981",
        "The Dark Side of the Moon de Pink Floyd,Back in Black de AC/DC,Thriller de Michael Jackson,Falling into You de Celine Dion",
        "13,12,10,9",
        "The Beatles,Nirvana,Metallica,Led Zeppelin",
        "Johannes Brahms,Chaikovski,Ludwig van Beethoven,Bach",
        "1980,1989,1996,1985",
        "1914,1939,1945,1928",
        "Babilónica,Acadia,Sumeria,Harappa",
        "116,100,101,99",
        "1930,1985,1969,1954",
        "Titanic,Avatar,Vengadores Endgame,Vengadores Infinity War",
        "Francis Ford Coppola,Martin Scorsese,Alfred Hitchcock,Steven Spielberg",
        "Ratatouille,La Bella y la Bestia,Blancanieves y los siete enanitos,101 Dalmatas",
        "9,5,8,7",
        "Harrison Ford,Sean Connery,Leonardo DiCaprio,Tom Cruise",
    };
// metodo para obtener la posición de la respuesta
public String getRespuesta(int posicion)  {
    return respuestas[posicion];
} 
//metodo para serparar los arreglos
public String[] separar(String cadena, String separador){
    StringTokenizer token = new StringTokenizer(cadena, separador);
    
    String[] a= new String[4];
    int i = 0;
    
    while(token.hasMoreTokens()){
        a[i] = token.nextToken(); // se obtiene el token 
        i++;
    }
      return a; 
}
// metodo para asignar respuestas al jframe
public String[] setRespuestas(int posicion){
    String s1 = radioR[posicion];
    String[] s2 = separar(s1, ",");
    return s2; 
}
}
