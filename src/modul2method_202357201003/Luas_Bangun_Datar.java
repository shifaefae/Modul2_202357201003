package modul2method_202357201003;

import javax.swing.JOptionPane;

public class Luas_Bangun_Datar {

    public static void main(String[] args) {

        //Persegipanjang
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang Persegi Panjang :"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar Persegi Panjang :"));
        int LuasPersegiPanjang = hitung_Luas_Persegi_Panjang(panjang, lebar);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang :" + LuasPersegiPanjang);
        System.out.println("Luas Persegi Panjang :" + LuasPersegiPanjang);

        //Segitiga
        int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas Segitiga :"));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi Segitiga :"));
        double LuasSegitiga = hitung_Luas_Segitiga(alas, tinggi);
        JOptionPane.showMessageDialog(null, "Luas Segitiga :" + LuasSegitiga);
        System.out.println("Luas Segitiga :" + LuasSegitiga);

        //jari-jari Lingkaran
        int jarijari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jari-jari Lingkaran :"));
        double LuasLingkaran = hitung_Luas_Lingkaran(jarijari);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran :" + LuasLingkaran);
        System.out.println("Luas Lingkaran :" + LuasLingkaran);
    }

    //Method Untuk Menghitung Luas Persegi Panjang
    public static int hitung_Luas_Persegi_Panjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    //Method Untuk Menghitung Luas Segitiga
    public static double hitung_Luas_Segitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    //Method Untuk Menghitung Luas Lingkaran
    public static double hitung_Luas_Lingkaran(int jarijari) {
        return Math.PI * Math.pow(jarijari, 2);
    }
}
