package main;

public class CalculatriceSimple {
    public static void main(String[] args) {
        Nombre n = new Nombre(6);
        Multiplication m = new Multiplication(n, n);
        System.out.println(m + " = " + m.valeur());

        Nombre huit = new Nombre(8);
        Nombre deux = new Nombre(2);

        Operation j = new Multiplication(huit , deux);
        System.out.println(j + " = " + j.valeur());

        Operation a = new Addition(huit, deux);
        System.out.println(a + " = " + a.valeur());

        Operation s = new Soustraction(huit, deux);
        System.out.println(s + " = " + a.valeur());

        Operation d = new Division(huit, deux);
        System.out.println(d + " = " + d.valeur());


        Nombre zero = new Nombre(0);
        Operation z = new Division(huit,zero);
        System.out.println(z + " = " + z.valeur());
    }
}
