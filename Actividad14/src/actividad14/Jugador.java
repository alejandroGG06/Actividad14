package actividad14;

public class Jugador {

	private int dorsal; // atributo de instancia

	private int numeroTarjetasAmarillas; // atributo de instancia

	private int numeroTarjetasRojas; // atributo de instancia

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

	/**
	 * El metodo pondra el dorsal que se introduzca como valor de entrada. Se
	 * verificará si el dorsal es mayor o igual que 1 y si es menor o igual que 30.
	 * Si se cumplen las dos, se cambiara el dorsal al dorsal introducido. Si no
	 * esta entre 1 y 30, el dorsal sera igual a -1
	 * 
	 * @param numero del dorsal que se establecerá
	 */

	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * Metodo estaExpulsado cambiará el valor de expulsado a false. Despues
	 * verificará si numeroTarjetasAmarillas es igual que 2, el valor de expulsado
	 * cambiará a true. Tambien verificará si numeroTarjetasRojas es igual que 1, el
	 * valor de expulsado cambiará a true. El metodo retornará expulsado
	 */

	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}