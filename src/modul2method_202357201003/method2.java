package modul2method_202357201003;

public class method2 {

    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    public static void main(String[] args) {
        method2 mt = new method2();
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }

}
