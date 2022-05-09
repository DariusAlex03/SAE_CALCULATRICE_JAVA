package main;

public class CalculatriceSimple {
    public static void main(String[] args) {
        Nombre n = new Nombre(5);
        System.out.println(n.valeur());

        Nombre trois = new Nombre(3);
        Nombre deux = new Nombre(2);
        Operation s = new Soustraction(trois,deux);


    }
}
