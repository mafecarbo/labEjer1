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
public class Carro {
    private String placa;
    private int horallegada;
    private int horasalida;

    public Carro(String placa, int horallegada) {
        this.placa = placa;
        this.horallegada = horallegada;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHorallegada() {
        return horallegada;
    }

    public int getHorasalida() {
        return horasalida;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setHorallegada(int horallegada) {
        this.horallegada = horallegada;
    }

    public void setHorasalida(int horasalida) {
        this.horasalida = horasalida;
    }
    public String InformacionCarro (){
        String info;
        info=this.placa+" "+this.horallegada;
        return info;
    }
    
    
}
