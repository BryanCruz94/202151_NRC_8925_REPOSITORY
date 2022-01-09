/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import modelo.Modelo;
import vista.Vista1;

public class Controlador implements ActionListener{
    private final Vista1 view;
    private final Modelo model;
  
    public Controlador (Vista1 view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
        
    }

    public void iniciar(){
        view.setTitle("Grupo 1");
        view.setLocationRelativeTo(null);
    }

    
    public void actionPerformed(ActionEvent e) {
        model.setNumeroUno(Integer.parseInt(view.txt1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txt2.getText()));
        model.multiplicar();
        view.txtProducto.setText(String.valueOf(model.getProducto()));
    }
    
}
