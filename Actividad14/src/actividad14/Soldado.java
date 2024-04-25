package actividad14;

public class Soldado {

	private boolean estaMuerto; // atributo de instancia

	private int numeroBalas; // atributo de instancia

	// Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las
	// pruebas y la documentación. Aquí no se han creado porque no aportan nada

	/**
	 * Este metodo verifica que el soldado tenga balas. Si este tiene balas, le
	 * permitira disparar, retornando true. Si no tiene balas, no le permitirá
	 * disparar, retornando false.
	 */

	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	/**
	 * 
	 * Este metodo necesita un parametro de entrada sol. Cuando dispare, se restara
	 * una bala al numero total de balas. El Soldado nativo, disparará al Soldado
	 * sol, y este cambiara, de estar vivo a estar muerto.
	 * 
	 * @param soldado al que se disparará
	 */

	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	

}
