/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Modelo {
    private float numeroUno;
    private float numeroDos;
    private float producto;

    //GETTERS Y SETTERS
    public float getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public float getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public float getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    // MÉTODOS FUNCIONALES
    
    public float multiplicar(){
        this.producto = this.numeroDos * this.numeroUno;
        return this.producto;
    }
}
