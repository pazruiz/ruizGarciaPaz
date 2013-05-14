/**2. Añadiendo comentarios de línea en la nueva clase TestLampara, indica en qué parte del código se:
 * Instancia un objeto = new
 * Invoca a un método = lampara.metodo()
 * Accede a un campo = getCampo
 * 
 * 3. ¿Aparece el constructor? ¿Por qué?
 * 
 * No, invoca al padre
 * 
 * @author Paz Ruiz García
 * 
 */
package lampara;

public class TestLampara {

	public static void main(String[] args) {
		//Inicialización de un objeto lámpara
		Lampara lampara = new Lampara();
		
		//instancia de la clase Lámpara
		lampara.encender();
		lampara.apagar();
		//acceso al campo encendida de la clase Lampara
		lampara.getEncendida();
	}

}
