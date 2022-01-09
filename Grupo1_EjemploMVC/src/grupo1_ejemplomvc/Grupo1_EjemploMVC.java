
package grupo1_ejemplomvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista1;


public class Grupo1_EjemploMVC {

    
    public static void main(String[] args) {
       Modelo mod = new Modelo();
       Vista1 ventana = new Vista1();
       
       Controlador ctrl = new Controlador(ventana,mod);
      ctrl.iniciar();
      
      ventana.setVisible(true);
       
    }
    
}
