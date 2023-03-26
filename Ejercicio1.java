package Clase7;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Ejercicio1 {
  public static void main(String[] args) {
	  int linea=0;
    try {
    	File myObj = new File("G:\\Workspace Java\\Projectoclase1\\src\\Clase7\\Resultados.csv"); //no se como funcionaria en otra pc, hay que cambiar la ruta si o si a donde este descargado
      Scanner myReader = new Scanner(myObj); //The Scanner class is used to get user input, and it is found in the java.util package. en este caso es lo que "procesa" el archivo
      while (myReader.hasNextLine()) { //lee mientras el archivo tenga linea de texto
        String data = myReader.nextLine();
        //System.out.println(data);
        linea++;
        //System.out.println(linea);
        if(linea>=2) { //omito la linea 1 por que es el encabezado del excel
        	String[] dataList = data.split(";"); //divide el array (utilizando el simbolo que le indiques) y lo numera segun la cantidad de divisiones que tenga
        	int result1=Integer.parseInt(dataList [1]); //lee el resultado del equipo 1 y cambia la variable a int
        	int result2=Integer.parseInt(dataList [2]); //lee el resultado del equipo 2 y cambia la variable a int
        	//System.out.println(result1);
        	//System.out.println(result2);
        	if(result1>result2) {  //este if y los siguientes son para determinar el resultado del partido
        		System.out.println("El ganador es: "+dataList [0]);
        	}
        	else if (result2!=result1){
        		System.out.println("El ganador es: "+dataList [3]);
        	}
        	else {
        		System.out.println("El resultado fue empate");
        	}
        		
        }
      }
      myReader.close(); //Cierra el lector del archivo, creo que previene perdida de datos tambien
    } catch (FileNotFoundException e) { //es como una funcion para los errores, no estoy muy seguro de como funciona
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}