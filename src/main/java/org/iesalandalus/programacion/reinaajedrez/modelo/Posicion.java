package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private static final int FILA_X = 1 ;
	private static final int COLUMNA_Y = A++ ;

	private int x;
	private int y;

	public Posicion() {
		x = FILA_X;
		y = COLUMNA_Y;
	}

	public Posicion(int x, int y) {
		setX(x);
		setY(y);
	}

	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("No puedo copiar una posición nula.");
		}
		setX(posicion.getX());
		setY(posicion.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < FILA_X) {
			throw new IllegalArgumentException("El valor de la x es menor que el mínimo permitido.");
		} else if (x > FILA_X) {
			throw new IllegalArgumentException("El valor de la x es mayor que el máximo permitido.");
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y < COLUMNA_Y) {
			throw new IllegalArgumentException("El valor de la y es menor que el mínimo permitido.");
		} else if (y > COLUMNA_Y) {
			throw new IllegalArgumentException("El valor de la y es mayor que el máximo permitido.");
		}
		this.y = y;
	}

	public int hashCode() {
		return Objects.hash(x, y);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return x == other.x && y == other.y;
	}

	public String toString() {
		return String.format("x=%s, y=%s", x, y);
	}

}
