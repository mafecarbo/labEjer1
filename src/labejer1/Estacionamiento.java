/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labejer1;

/**
 *
 * @author Estudiante
 */
public class Estacionamiento {
    private int Numero;
    private Carro carros;

    public Estacionamiento(int Numero) {
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }

    public Carro getCarros() {
        return carros;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setCarros(Carro carros) {
        this.carros = carros;
    }
    public boolean Lleno (){
        return this.carros != null;
    }
    
}
