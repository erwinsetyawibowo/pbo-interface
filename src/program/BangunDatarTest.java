
package program;

public class BangunDatarTest {

    public static void printBangDatar(BangunDatar bdr) {
        System.out.println("================");
        System.out.println("Bangun Datar    = "+bdr.getBangunDatar());
        System.out.println("Luas            = "+bdr.Luas());
        System.out.println("Keliling        = "+bdr.Keliling());
    }
    
    static void test(){
        BangunDatar BangDatar = new PersegiPanjang(10, 20);
        printBangDatar(BangDatar);
        BangDatar = new Persegi (10);
        printBangDatar(BangDatar);
        BangDatar = new Lingkaran(7);
        printBangDatar(BangDatar);
    }
    
    public static void main(String[] args) {
        test();
    }
}
