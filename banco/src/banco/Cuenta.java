package banco;

public class Cuenta {
	//Atributos (características) del objeto
			private int numCuenta;
			private String tipo;
			private double valor;
			
			
			//Método Constructor sin Parámetros
			public Cuenta () {
				numCuenta = 0 ;
				tipo = "";
				valor = 0.0;
				}
			
			//Método Mostrar Datos
			public void mostrarDatos() {
				System.out.println("");
				System.out.println("Los datos de la Cuenta son:");
				System.out.println("    Número de Cuenta: "+ numCuenta);
				System.out.println("    Tipo de Cuenta: " + tipo);
				System.out.println("    Valor de Cuenta:" + valor);
			}
			
			
}
