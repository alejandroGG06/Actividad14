package actividad14;

public class Mainact14 {
	
	
	
	/** 
	 * el objetivo de esta clase es  <b> contar el numero de balas y asesinar un soldado <b>
	 *<u> tendra metodos como puede disparar y disparar<u>
	 * @version 1.0
	 * @author AlejandroGrajales
	 */
	
	public class Soldado {

        private boolean estaMuerto; // atributo de instancia

        private int numeroBalas; // atributo de instancia

       

        //Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

        
        
       /**
        *  metodo con el cual se podra o no disparar 
        * si el numero de balas es mayor que cero podra disparar
        * 
        * @return si es mayor a 0 devuelve true, pero si es igual o menor que cero devuelve false
        */

        public boolean puedeDisparar() {

                      if(this.numeroBalas > 0) {

                                    return true;

                      }                          

                      return false;

        }

       /**
        * metodo con el cual se dispara a un objeto creado por parametro
        * 
        * la muerte del objeto 'sol' estara condicionada por el numero de balas
        * que tenga el objeto principal
        
        * el numero de balas ira disminuyendo por lo que el objeto sol.estamuerto morira
        * si el objeto principal tiene las balas suficientes para matarlo       
        
        * 
        * @param el objeto sol es el que introduciemos por parametro
        * 
        *
        */

        public void disparar(Soldado sol) {

                      this.numeroBalas--;

                      sol.estaMuerto = true;

        }

}

	
	
//Requerimiento 2

//Documentar la siguiente clase
	
	/**
	 * el objetivo de esta clase es	<b> asignar los dorsales a los jugadores y saber si son expulsados en
	 * algun partido<b>
	 *  esta clase cuenta con 2 metodos que son, <b>poner dorsal y esta expulsado<b>
	 *  @version 1.0
	 *  @author AlejandroGrajales
	 */

public class Jugador {

        private int dorsal; // atributo de instancia

        private int numeroTarjetasAmarillas; // atributo de instancia

        private int numeroTarjetasRojas; // atributo de instancia

                     

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

        /**
         * metodo que permitira asignarle un dorsal a los jugadores de un equipo.
         
         * si el objeto dorsal esta comprendido en un rango de 1 y 30 mostrara el dorsal asignado
         
         * pero si el dorsal no esta en el rango asignado anteriormente mostrara -1
         * 
         * @param dorsal sera el objeto introducido por el usuario
         */

        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                                    this.dorsal = dorsal;

                      }else {

                                    this.dorsal = -1;

                      }

        }

       
        /**
         *  metodo con el cual se podra saber si un jugador sera expulsado.
         
         *	el atributo expulsado, por defecto sera false pero si se cumple alguno de los 
         *	siguientes casos cambiaria a true, por lo cual seria expulsado.
         
         *  si el numero de tarjetas amariilas es igual a 2 el jugador sera expulsado
         *  si el numero de tarjetas rojas es igual a 1 el jugador sera expulsado
         *  
         * 
         * @return si se cumple alguno de los casos anteriores  el jugador sera expulsado por lo que devuelve true
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
