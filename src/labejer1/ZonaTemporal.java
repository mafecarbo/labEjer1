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
public class ZonaTemporal {
    private String NombreZT;
    private Estacionamiento [] hueco;

    public ZonaTemporal(String NombreZT) {
        this.NombreZT = NombreZT;
        this.hueco= new Estacionamiento[4];
    }

    public String getNombreZT() {
        return NombreZT;
    }

    public Estacionamiento[] getHueco() {
        return hueco;
    }

    public void setNombreZT(String NombreZT) {
        this.NombreZT = NombreZT;
    }

    public void setHueco(Estacionamiento[] hueco) {
        this.hueco = hueco;
    }
    
}
