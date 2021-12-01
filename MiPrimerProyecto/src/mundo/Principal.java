package mundo;

public class Principal {

	public static void main(String[] args) {
		// Declarar un objeto
		Telefono miTelefono;
		
		//Instancia de un Objeto
		miTelefono = new Telefono();
		
		//Declarar e instanciar un Objeto
		Telefono miTelefono2 = new Telefono();
	
		//MENSAJE (Orden a un objeto que ejecute un método)
		miTelefono.mostrarDatos();
		miTelefono2.mostrarDatos();
		
		//Instanciar un tercer objeto
		//int pId, String pMarca, String pModelo, Double pPrecio
		Telefono miTelefono3 = new Telefono(11, "Samsung", "Note8", 600.00);
	
		miTelefono3.mostrarDatos();
		miTelefono3.enviarMensaje("Hola mundo POO");
	}
	

}
