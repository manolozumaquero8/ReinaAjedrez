package org.iesalandalus.programacion.reinaajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	   
	  public static void MostrarMenu() {
	    System.out.println("Programa para mover una reina en el tablero de ajedrez");
	    System.out.println("1.- Crear una reina por defecto.");
	    System.out.println("2.- Crear una reina por defecto eligiendo el color.");;
	    System.out.println("3.- Mover reina.");
	    System.out.println("4.- Salir.");

	  }
	  
	  public static int elegirOpcionMenu() {
	      int opcion = 0;
	      System.out.print("Elige una opcion (0-4): ");
	      opcion = Entrada.entero();
	      while (opcion != 4) {
	      System.out.print("Elige una opcion (0-4): ");
	      opcion = Entrada.entero();
	      }
	    
	      return opcion;
	  
	    } 
	  public static Color elegirOpcion() {
		  int coloropcion = 0;
		  System.out.println("1-Elegir color blanco");
		  System.out.println("2-Elegir color negro");	
		  coloropcion = Entrada.entero();
		  while (coloropcion != 1 || coloropcion !=2) {
			  System.out.println("1- Elegir color blanco ");
			  System.out.println("2- Elegir color negro");
		  }
		  Color color = null;
		switch (coloropcion) { 
		  case 1: 
			  color=Color.BLANCO;
			  break;
		  case 2:
			  color=Color.NEGRO;
			  break;
		  }
		return color;
	  }
	  
	  public static void mostrarMenuDirecciones() {
	    System.out.println("1.- NOROESTE");
	    System.out.println("2.- NORESTE");
	    System.out.println("3.- NORESTE");
	    System.out.println("4.- SURESTE");
	    System.out.println("5.- SURESTE");
	    System.out.println("6.- SUROESTE");
	    System.out.println("7.- NOROESTE");
	    System.out.println("8.- SUROESTE");

	  }
	  
	  public static Direccion elegirDireccion() {
	    int opciondireccion = 0;
	    System.out.println("1- Elegir color blanco ");
		System.out.println("2- Elegir color negro");
		opciondireccion= Entrada.entero();
	    while (opciondireccion > 8 || opciondireccion < 1) {
			  System.out.println("1- Elegir color blanco ");
			  System.out.println("2- Elegir color negro");
			  opciondireccion= Entrada.entero();
	    }
			  
	    Direccion direccion = null;
	    
	    switch (opciondireccion) {
	      case 1:
	        direccion = Direccion.NORESTE;
	        break;
	      case 2:
	        direccion = Direccion.NOROESTE;
	        break;
	      case 3:
	        direccion = Direccion.NORESTE;
	        break;
	      case 4:
	        direccion = Direccion.SUROESTE;
	        break;
	      case 5:
	        direccion = Direccion.SURESTE;
	        break;
	      case 6:
	        direccion = Direccion.SUROESTE;
	        break;
	      case 7:
	        direccion = Direccion.NOROESTE;
	        break;
	      case 8:
	        direccion = Direccion.SUROESTE;
	        break;
	   
	    } 
		  
	  return direccion;
	  }
	  
	  public static int elegirPasos() {
	  int pasos = 0;
	  while (pasos < 1 || pasos > 8) {
		  System.out.println("Escribe numero de pasos:");
		  pasos=Entrada.entero();
	  }
	  return pasos;	  

}
	  public static void Despedirse() {
		  System.out.println("Hasta luego");
	  }
	 
}