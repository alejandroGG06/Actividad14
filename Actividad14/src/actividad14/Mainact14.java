package actividad14;

public class Mainact14 {
	/**
	 * La clase soldado se crea con la intencion de crear un objeto soldado que pueda disparar
	 * y matar a otro soldado
	 * @version 1.0
	 * @author Juanda
	 */
	public class Soldado {

        private boolean estaMuerto; //Atributo boolean indica si el soldado esta muerto o no

        private int numeroBalas; //Atributo int indica cuantas balas dispone el soldado

       

        //Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

       
        /**
         * Metodo puedeDisparar se usa para saber si el soldado puede disparar o no,
         * este metodo valida si numeroBalas es mayor a 0 o no,
         * si es mayor devuleve true, si no devolvera  false
         * @return devuelve un booleano que determina si puede disparar o no (true o false)
         */
        public boolean puedeDisparar() {

                      if(this.numeroBalas > 0) {

                                    return true;

                      }                          

                      return false;

        }

       /**
        * Metodo disparar que permite al soldado disparar a otro pasado por parametro,
        * cada que dispare se le va a ir disminuyendo el numeroBalas
        * establece el atributo "estaMuerto" a true
        * @param sol es el objeto 
        */

        public void disparar(Soldado sol) {

                      this.numeroBalas--;

                      sol.estaMuerto = true;

        }

}

//Requerimiento 2

//Documentar la siguiente clase
	
/**
 * Clase jugador creada con la intencion de asignarle un numero de dorsal a los jugadores y 
 * establecer si esta expulsado o no segun el numero de tarjetas amarillas y rojas
 * @author Juanda
 * @version 1.0
 */
public class Jugador {

        private int dorsal; //Atributo entero que es el numero de dorsal

        private int numeroTarjetasAmarillas; //Atributo entero que es el numero de trajetas amarillas

        private int numeroTarjetasRojas; //Atributo entero que es el numero de trajetas rojas

                     

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada


/**
 * 
 * xd
 * Metodo poner dorsal asigna un numero de dorsal al jugador
 * Por medio de un numero int pasado por parametro se asigna el numero de
 * dorsal a un jugador, al entrar en la sentencia condicional dice que, si el numero pasado
 * es mayor o igual a 1 y menor o igual a 30, asigna este mismo numero al objeto,
 * si no cumple la condicion se le resta 1 al propio atributo dorsal del objeto
 * @param dorsal parametro para ingresar el numero del dorsal
 */
        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                                    this.dorsal = dorsal;

                      }else {

                                    this.dorsal = -1;

                      }

        }

       
/**
 * Metodo booleano que permite saber si un jugador esta expulsado o no
 * crea una variable boolean "expulsado" y la inicializa en false.
 * luego entra en una sentencia condicional donde:
 * Si el jugador tiene un igual de 2 tarjetas amarillas la variable expulsado cambiara a true,
 * Si el jugador tiene un igual de 1 tarjetas rojas la variable expulsado cambiara a true
 * @return devuleve la variable booleana expulsado creada en el mismo metodo
 */
        public boolean estaExpulsado() {

                      boolean expulsado = false;                                                  

                      if(numeroTarjetasAmarillas == 2) {

                                    expulsado = true;

                      }                          

                      if(numeroTarjetasRojas == 1) {

                                    expulsado = true;

                      }                          

                      return expulsado;

        }            

}
}
