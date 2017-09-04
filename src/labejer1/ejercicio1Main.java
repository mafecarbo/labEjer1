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
public class ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parqueadero p =new Parqueadero("parking", 85);
        Zona [] z= new Zona [3]; 
        for (int i=0; i<3; i++){
            z[i]= new Zona ("Zona "+(i+1));
        }
        p.setzonas(z);
        Estacionamiento[] e1= new Estacionamiento[5];
        Estacionamiento[] e2= new Estacionamiento[5];
        Estacionamiento[] e3= new Estacionamiento[5];
        for (int i=0; i<5; i++){
            e1[i]= new Estacionamiento (i+1);
        }
        z[0].setEspacio(e1);
        for (int i=0; i<5; i++){
            e2[i]= new Estacionamiento (i+1);
        }
        z[1].setEspacio(e2);
        for (int i=0; i<5; i++){
            e3[i]= new Estacionamiento (i+1);
        }
        z[2].setEspacio(e3);
        System.out.println(p.getNombreP());
        for (int i=0; i<3; i++){
            System.out.println(z[i].getNombreZ());
        }
        Carro c1= new Carro ("UCR821", 1100);
        Carro c2= new Carro ("COL123", 1130);
        Carro c3= new Carro ("FRA921", 1200);
        Carro c4= new Carro("QRT935",1300);
        e1[0].setCarros(c1);
        e1[1].setCarros(c3);
        e2[0].setCarros(c2);
        System.out.println(p.ZonaMenos());
        System.out.println(p.Informacion(c4));
    }
    
}
