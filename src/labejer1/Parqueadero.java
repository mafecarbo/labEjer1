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
public class Parqueadero {
    private String NombreP;
    private int Tarifa;
    private Zona[] zonas;
   

    public Parqueadero(String NombreP, int Tarifa) {
        this.NombreP = NombreP;
        this.Tarifa = Tarifa;
        this.zonas= new Zona[3];
    }

    public String getNombreP() {
        return NombreP;
    }

    public int getTarifa() {
        return Tarifa;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public void setTarifa(int Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Zona[] getzonas() {
        return zonas;
    }

    public void setzonas(Zona[] zonas) {
        this.zonas = zonas;
    }
    public String ZonaMenos (){
        if (this.zonas[0].ContarEs()<=this.zonas[1].ContarEs() && this.zonas[0].ContarEs()<=this.zonas[2].ContarEs() ){
            return "Zona 1";
        }
        else if(this.zonas[1].ContarEs()<=this.zonas[0].ContarEs() && this.zonas[1].ContarEs()<=this.zonas[2].ContarEs() ){
            return "Zona 2";
        }
        else{
            return "Zona 3";
        } 
    }
    
    
    
}
