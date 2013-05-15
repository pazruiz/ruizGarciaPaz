/**1. Disponemos del siguiente código: class Lampara { boolean encendida = false; encender(){ encendida = true;
 * System.out.println("Ilumninando"); } apagar(){ encendida = false; System.out.println("Oscuridad"); } } 
 * El código actual contiene errores de compilación. Corrígelos. 
 * Encapsula en la medida de lo posible 
 * Empaqueta la clase Lampara en una biblioteca 
 * Haciendo uso de la clase Lámpara ya modificada, simula el funcionamiento de una lámpara en una nueva clase
 * TestLampara (con método main()) El resultado de la ejecución será este: Ilumninando Oscuridad 
 * 
 * @author Paz Ruiz García
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
