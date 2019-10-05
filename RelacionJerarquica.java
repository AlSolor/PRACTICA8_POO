public class RelacionJerarquica{
	public static void main(String[] args) {
		Punto punto=new Punto(30,50);
		Circulo circulo = new Circulo (120,89,2.7);
		System.out.println("ACTIVIDAD 3");
		System.out.println("Lllamado a toString de Punto con referencia "+ "a la superclase apuntando al objeto de la superclase: \n"+ punto.toString());
		System.out.println("Llamado a toString de Circulo con referencia" + " a la subclase apuntando al objeto de la subclase: \n" + circulo.toString());
		circulo= punto;
		System.out.println("Lllamdo a toString de Circulo con referencia"+" a la superclase apuntando al objeto e la subclase: \n"+ punto.toString());
	}
}
