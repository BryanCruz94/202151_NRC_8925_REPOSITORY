package mundo;

public class Telefono {

	//Atributos (características) del objeto
	private int id;
	private String marca;
	private String modelo;
	private Double precio;
	
	//Método Constructor sin Parámetros
	public Telefono () {
		id = 0 ;
		marca = "";
		modelo = "";
		precio = 0.0;
		}
	
	//Méotodo Constructor con Parámetros
	public Telefono(int pId, String pMarca, String pModelo, Double pPrecio) {
		id = pId;
		marca = pMarca;
		modelo = pModelo;
		precio = pPrecio;
	}
	
		
	//Métodos (Funcionalidad del objeto)
	public void mostrarDatos () {
		System.out.println("Datos del Telefono");
		System.out.println("ID: "+ id);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Precio:" + precio);
		System.out.println("");
		
	}
	
	//
	public void enviarMensaje(String mensaje) {
		System.out.println("Mensaje enviado: " + mensaje);
		
	}
	
}
