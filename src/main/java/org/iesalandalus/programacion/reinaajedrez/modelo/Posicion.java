package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

		private static final int FILAMIN_X = 1;
		private static final int FILAMAX_X = 8;
		private static final char COLUMNAMIN_Y = A;
		private static final char COLUMNAMAX_Y = B,C,D,E,F,G,H;

		private int x;
		private int y;

		public Posicion() {
			x = FILAMIN_X;
			y = COLUMNAMIN_Y;
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
			if (x < FILAMIN_X) {
				throw new IllegalArgumentException("El valor de la x es menor que el mínimo permitido.");
			} else if (x > FILAMAX_X) {
				throw new IllegalArgumentException("El valor de la x es mayor que el máximo permitido.");
			}
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			if (y < COLUMNAMIN_Y) {
				throw new IllegalArgumentException("El valor de la y es menor que el mínimo permitido.");
			} else if (y > COLUMNAMAX_Y) {
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
