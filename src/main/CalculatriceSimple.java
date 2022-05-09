package main;

public class CalculatriceSimple {
    public static void main(String[] args) {
        Nombre n = new Nombre(6);
        Multiplication m = new Multiplication(n, n);
        System.out.println(m.toString());

        Nombre neuf = new Nombre(8);
        Nombre huit = new Nombre(2);

        Operation j = new Multiplication(neuf , huit);
        System.out.println(j.toString());







    }
}
