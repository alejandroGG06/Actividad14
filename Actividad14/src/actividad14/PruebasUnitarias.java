package actividad14;

public class PruebasUnitarias {

	public static void main(String[] args) {

		// Método puedeDisparar()

		// Prueba 1
		// numeroBalas = 1
		// resultado esperado true

		// Prueba 2
		// poder = -20
		// resultado esperado = 0

		// Ejecutamos la prueba 1
		Soldado b1 = new Soldado();
		int numeroBalas = 100;
		int resultadoEsperado = 100;
		b1.setNumeroBalas(numeroBalas);
		int resultadoObtenido = b1.getNumeroBalas();
		if (resultadoEsperado == resultadoObtenido) {
			System.out.println("setPoder() Prueba1 -> OK");
		} else {
			System.out.println("setPoder() Prueba1 -> KO");
		}
	}
}
