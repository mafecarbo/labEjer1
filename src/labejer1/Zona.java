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
public class Zona {
    private String NombreZ;
    private int Contadorz;
    private Estacionamiento[] espacio;

    public Zona(String NombreZ) {
        this.NombreZ = NombreZ;
        this.Contadorz=0;
        this.espacio= new Estacionamiento[5];
    }

    public String getNombreZ() {
        return NombreZ;
    }

    public Estacionamiento[] getEspacio() {
        return espacio;
    }

    public void setNombreZ(String NombreZ) {
        this.NombreZ = NombreZ;
    }

    public void setEspacio(Estacionamiento[] espacio) {
        this.espacio = espacio;
    }

    public int getContadorz() {
        return Contadorz;
    }

    public void setContadorz(int Contadorz) {
        this.Contadorz = Contadorz;
    }
    public int ContarEs (){
        int contador=0;
        for (int i=0; i<5; i++){
            if (this.espacio[i].Lleno()){
            contador++;
            }
        }
        return contador;
    }
   public String InfoZona(Carro carros){
       for (int i=0; i<5; i++){
           if (this.espacio[i].getCarros()==carros){
               return this.espacio[i].InfoEsta()+", en la "+this.NombreZ;
           }
       }
       return null;
   }
   public String Desocupado (){
       for (int i=0; i<5; i++){
           if (this.espacio[i].Lleno()==false){
               return "Estacionamiento "+this.espacio[i].getNumero();
           }
       }
       return null;
   }
}
