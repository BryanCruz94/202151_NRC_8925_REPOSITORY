package banco;

public class Cliente {
	//Atributos (características) del objeto
		private int ci;
		private String nombre;
		private String apellido;
		private int edad;
		private int anioNacimiento;
		
		//Método Constructor sin Parámetros
		public Cliente () {
			ci = 0 ;
			nombre = "";
			apellido = "";
			edad = 0;
			}
		
		//Méotodo Constructor con Parámetros
		public Cliente(int pCi, String pNombre, String pApellido, int pEdad) {
			ci = pCi ;
			nombre = pNombre;
			apellido = pApellido;
			edad = pEdad;
		}
		
			
		//Métodos (Funcionalidad del objeto)
		public void mostrarInfo () {
			System.out.println("");
			System.out.println("Los datos del Cliente son:");
			System.out.println("    Cédula de Identidad: "+ ci);
			System.out.println("    Nombre y Apellido: " + nombre + apellido);
			System.out.println("    La edad es:" + edad);
			
			
		}
		
		// Calcular año de nacimiento
		public void calcularAnioNacimiento() {
			anioNacimiento = (2021 - edad);
			System.out.println("Año de nacimiento es: " + anioNacimiento);
			
		}
		
	}