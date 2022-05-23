package main;

public class CalculatriceSimple {
    public static void main(String[] args) {
        Nombre n = new Nombre(6);
        Multiplication m = new Multiplication(n, n);
        System.out.println(m);

        Nombre huit = new Nombre(8);
        Nombre deux = new Nombre(2);

        Operation j = new Multiplication(huit , deux);
        System.out.println(j);

        Operation a = new Addition(huit, deux);
        System.out.println(a);

        Operation s = new Soustraction(huit, deux);
        System.out.println(s);

        Operation d = new Division(huit, deux);
        System.out.println(d);


        Nombre zero = new Nombre(0);
        Operation z = new Division(huit,zero);
        System.out.println(z);
    }
}
