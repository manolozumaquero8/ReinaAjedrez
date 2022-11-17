package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class MainApp {

	private static Reina reina;

	public static void main(String[] args) throws OperationNotSupportedException {
		Consola.MostrarMenu();
		int opcion = Consola.elegirOpcionMenu();
		ejecutarOpcion(opcion);

		while (opcion < 4) {
			Consola.MostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);
		}
		Consola.Despedirse();
	}

	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
		switch (opcion) {
		case 1:
			crearReinaDefecto();
			mostrarReina();
			break;
		case 2:
			Color color = Consola.elegirOpcion();
			crearReinaColor(color);
			mostrarReina();
			break;
		case 3:
			mover();
			mostrarReina();
			break;
		case 4:
			Consola.Despedirse();
			break;
		}

	}

	private static void crearReinaDefecto() {
		reina = new Reina();

	}

	private static void crearReinaColor(Color color) {
		reina = new Reina(color);
	}

	private static void mover() throws OperationNotSupportedException {
		Consola.mostrarMenuDirecciones();
		Direccion direccion = Consola.elegirDireccion();
		int pasos = Consola.elegirPasos();
		reina.mover(direccion, pasos);

	}

	public static void mostrarReina() {
	System.out.println(reina.toString()); 
	}
}
