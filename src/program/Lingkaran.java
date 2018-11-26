/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author x
 */
public class Lingkaran implements BangunDatar{
    
    private float jari;
    private static double phi = 3.14;
    
    public Lingkaran(float jari){
        this.jari = jari;
    }
    
    @Override
    public String getBangunDatar(){
        return "Lingkaran";
    }
    
    @Override
    public float Luas() {
        return (float) (phi*this.jari*this.jari);
    }

    @Override
    public float Keliling() {
        return (float) (2*phi*this.jari);
    }
    
    
}
