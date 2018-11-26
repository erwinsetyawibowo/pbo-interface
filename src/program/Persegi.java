
package program;

public class Persegi implements BangunDatar{

    private int sisi;
    
    public Persegi(int newSisi){
        sisi = newSisi;
    }

    @Override
    public String getBangunDatar(){
        return "Persegi";
    }
    
    @Override
    public float Luas() {
        return sisi*sisi;
    }

    @Override
    public float Keliling() {
        return sisi*4;
    }
}

