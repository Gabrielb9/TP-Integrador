package Clase7;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Ejercicio1 {
  public static void main(String[] args) {
	  int linea=0;
    try {
    	File myObj = new File("G:\\Workspace Java\\Projectoclase1\\src\\Clase7\\Resultados.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        //System.out.println(data);
        linea++;
        //System.out.println(linea);
        if(linea>=2) {
        	String[] dataList = data.split(";");
        	int result1=Integer.parseInt(dataList [1]);
        	int result2=Integer.parseInt(dataList [2]);
        	//System.out.println(result1);
        	//System.out.println(result2);
        	if(result1>result2) {
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
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}