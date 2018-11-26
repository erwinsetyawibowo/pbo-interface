
package program;

public class PersegiPanjang implements BangunDatar{

    private int sisi;
    private float panjang, lebar;
    
    public PersegiPanjang(float newPanjang, float newLebar){
        panjang = newPanjang;
        lebar = newLebar;
    }
    
    @Override
    public String getBangunDatar(){
        return "Persegi Panjang";
    }

   
    @Override
    public float Luas() {
        return panjang * lebar;
    }

    
    @Override
    public float Keliling() {
        return 2 * (panjang + lebar);
    }
}

