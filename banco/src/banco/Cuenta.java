package banco;

public class Cuenta {
	//Atributos (caracter�sticas) del objeto
			private int numCuenta;
			private String tipo;
			private double valor;
			
			
			//M�todo Constructor sin Par�metros
			public Cuenta () {
				numCuenta = 0 ;
				tipo = "";
				valor = 0.0;
				}
			
			//M�todo Mostrar Datos
			public void mostrarDatos() {
				System.out.println("");
				System.out.println("Los datos de la Cuenta son:");
				System.out.println("    N�mero de Cuenta: "+ numCuenta);
				System.out.println("    Tipo de Cuenta: " + tipo);
				System.out.println("    Valor de Cuenta:" + valor);
			}
			
			
}
