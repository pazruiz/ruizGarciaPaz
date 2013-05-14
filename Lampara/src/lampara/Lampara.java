/**1. Disponemos del siguiente c�digo: class Lampara { boolean encendida = false; encender(){ encendida = true;
 * System.out.println("Ilumninando"); } apagar(){ encendida = false; System.out.println("Oscuridad"); } } 
 * El c�digo actual contiene errores de compilaci�n. Corr�gelos. 
 * Encapsula en la medida de lo posible 
 * Empaqueta la clase Lampara en una biblioteca 
 * Haciendo uso de la clase L�mpara ya modificada, simula el funcionamiento de una l�mpara en una nueva clase
 * TestLampara (con m�todo main()) El resultado de la ejecuci�n ser� este: Ilumninando Oscuridad 
 * 
 * @author Paz Ruiz Garc�a
 * 
 */
package lampara;

public class Lampara {
	private boolean encendida=false;
	
	public boolean getEncendida(){
		System.out.println(encendida);
		return encendida;
	}
	public void setEncendida(boolean encendida){
		this.encendida = encendida;
	}
	public void encender(){
		System.out.println("Iluminando");
		encendida = true;
	}
	public void apagar(){
		System.out.println("Oscuridad");
		encendida = false;
	}
}
