package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

		private int fila;
		private char columna;
		

		public Posicion(int fila, char columna) {
		if ( fila < 1 || fila > 8) { 
			throw new IllegalArgumentException ("ERROR: Fila no válida.");
		}
		if ( columna < 'a' || columna > 'h') { 
			throw new IllegalArgumentException ("ERROR: Columna no válida.");
		}
			setFila(fila);
			setColumna(columna);
		}

		public Posicion(Posicion posicion) {
			if (posicion == null) {
				throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
			}
			setFila(posicion.getFila());
			setColumna(posicion.getColumna());
		}

		public int getFila() {
			return fila;
		}

		public void setFila(int fila) {
			if (fila < 1) {
				throw new IllegalArgumentException("El valor de la fila es menor que el mínimo permitido.");
			} else if (fila > 8) {
				throw new IllegalArgumentException("El valor de la fila es mayor que el maximo permitido.");
			}
			this.fila = fila;
		}

		public char getColumna() {
			return columna;
		}

		public void setColumna(char columna) {
			if (columna < 'a') {
				throw new IllegalArgumentException("El valor de la columna es menor que el mínimo permitido.");
			} else if (columna > 'h') {
				throw new IllegalArgumentException("El valor de la columna es mayor que el maximo permitido.");
			}
			this.columna = columna;
		}

		public int hashCode() {
			return Objects.hash(fila, columna);
		}

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Posicion other = (Posicion) obj;
			return fila == other.fila && columna == other.columna;
		}


		public String toString() {
			return String.format("fila=%s, columna=%s", fila, columna);
		}


}
