package modul2method_202357201003;

import java.util.Scanner;

public class volume_Bangun_Ruang {

    public static void main(String[] args) {
        volume_Bangun_Ruang mt = new volume_Bangun_Ruang();
        Scanner scanner = new Scanner(System.in);

        //Tabung
        System.out.print("Masukkan diameter tabung :");
        int diameterTabung = scanner.nextInt();
        System.out.print("Masukkan tinggi tabung :");
        int tinggiTabung = scanner.nextInt();
        double volumeTabung = mt.volume_tabung(diameterTabung, tinggiTabung);
        System.out.print("Volume Tabung :" + volumeTabung);
        System.out.println("\t");

        //Kerucut
        System.out.print("Masukkan diameter kerucut :");
        int diameterKerucut = scanner.nextInt();
        System.out.print("Masukkan tinggi kerucut :");
        int tinggiKerucut = scanner.nextInt();
        double volumeKerucut = mt.volume_kerucut(diameterKerucut, tinggiKerucut);
        System.out.print("Volume Kerucut :" + volumeKerucut);
        System.out.println("\t");

        //Bola
        System.out.print("Masukkan diameter bola :");
        int diameterBola = scanner.nextInt();
        double volumeBola = mt.volume_bola(diameterBola);
        System.out.print("Volume Bola :" + volumeBola);
        System.out.println("\t");

        scanner.close();
    }

    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        return Math.PI * Math.pow(jari2, 3);
    }

    public double volume_tabung(int diameter, int tinggi) {
        double luasAlas = luas_lingkaran(diameter);
        return luasAlas * tinggi;
    }

    public double volume_kerucut(int diameter, int tinggi) {
        double luasAlas = luas_lingkaran(diameter);
        return (luasAlas * tinggi) / 3;
    }

    public double volume_bola(int diameter) {
        double jari2 = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
    }
}
