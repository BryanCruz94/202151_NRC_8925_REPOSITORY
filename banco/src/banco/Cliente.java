package banco;

public class Cliente {
	//Atributos (caracter�sticas) del objeto
		private int ci;
		private String nombre;
		private String apellido;
		private int edad;
		private int anioNacimiento;
		
		//M�todo Constructor sin Par�metros
		public Cliente () {
			ci = 0 ;
			nombre = "";
			apellido = "";
			edad = 0;
			}
		
		//M�otodo Constructor con Par�metros
		public Cliente(int pCi, String pNombre, String pApellido, int pEdad) {
			ci = pCi ;
			nombre = pNombre;
			apellido = pApellido;
			edad = pEdad;
		}
		
			
		//M�todos (Funcionalidad del objeto)
		public void mostrarInfo () {
			System.out.println("");
			System.out.println("Los datos del Cliente son:");
			System.out.println("    C�dula de Identidad: "+ ci);
			System.out.println("    Nombre y Apellido: " + nombre + apellido);
			System.out.println("    La edad es:" + edad);
			
			
		}
		
		// Calcular a�o de nacimiento
		public void calcularAnioNacimiento() {
			anioNacimiento = (2021 - edad);
			System.out.println("A�o de nacimiento es: " + anioNacimiento);
			
		}
		
	}