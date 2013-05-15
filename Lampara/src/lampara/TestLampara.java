/**2. A�adiendo comentarios de l�nea en la nueva clase TestLampara, indica en qu� parte del c�digo se:
 * Instancia un objeto = new
 * Invoca a un m�todo = lampara.metodo()
 * Accede a un campo = getCampo
 * 
 * 3. �Aparece el constructor? �Por qu�?
 * 
 * No, invoca al padre
 * 
 * @author Paz Ruiz Garc�a
 * 
 */
package lampara;

public class TestLampara {

	public static void main(String[] args) {
		//Inicializaci�n de un objeto l�mpara
		Lampara lampara = new Lampara();
		
		//instancia de la clase L�mpara
		lampara.encender();
		lampara.apagar();
		//acceso al campo encendida de la clase Lampara
		lampara.getEncendida();
		System.out.println("La bombilla se ha fundido");
		System.out.println("Fran va a cambiar la bonmbilla");
		
	}

}
