import java.text.DecimalFormat;

public class HerenciaAbstracta {
	public static void main(String[] args) {
		DecimalFormat dosDigitos = new DecimalFormat("0.00");

		//Crear objetos Punto, Circulo y Cilindro
		Punto1 punto = new Punto1(7,11);
		Circulo1 circulo = new Circulo1(22, 8, 3.5);
		Cilindro1 cilindro = new Cilindro1(20, 30, 3.3, 10.75);

		//Obtener nombre y representacion de cadena de cada objeto
		System.out.println("Nombre y representacion de cadena: ");
		System.out.println(punto.obtenerNombre() + ": " + punto +
			"\n" + circulo.obtenerNombre() + ": " + circulo + "\n" +
			cilindro.obtenerNombre() + ": " + cilindro + "\n");

		//Crear un arreglo de Figuras
		Figura1 arregloDeFiguras[] = new Figura1[3];

		//Apuntar arregloDeFiguras[0] al objeto de la subclase Punto
		arregloDeFiguras[0] = punto;

		//Apuntar arregloDeFiguras[1] al objeto de la subclase Circulo
		arregloDeFiguras[1] = circulo;

		//Apuntar arregloDeFiguras[2] al objeto de la subclase Cilindro
		arregloDeFiguras[2] = cilindro;

		//iterar a traves del arreglo para obtener nombre,
		//representacion de cadena, area y volumen de cada
		//Figura en el arreglo
		System.out.println("\nNombre e invocaciones: ");
		for(int i = 0; i < arregloDeFiguras.length; i++) {
			System.out.println(arregloDeFiguras[i].obtenerNombre());
			System.out.println(arregloDeFiguras[i].toString());
			System.out.println(arregloDeFiguras[i].obtenerArea());
			System.out.println(arregloDeFiguras[i].obtenerVolumen());
			System.out.println("\n");
		}
	}
}

