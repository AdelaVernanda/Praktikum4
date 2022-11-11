public class LuasBangunDatar {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas persegi: " + persegi.luas(5));
        System.out.println("Keliling persegi: " + persegi.keliling(5));
        System.out.println("Luas segitiga: " + segitiga.luas(4, 6));
        System.out.println("Luas lingkaran: " + lingkaran.luas(7));
        System.out.println("keliling lingkaran: " + lingkaran.keliling(7));
    }
}