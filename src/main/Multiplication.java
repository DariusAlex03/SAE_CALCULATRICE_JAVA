package main;

public class Multiplication extends Operation{

    public Multiplication(Nombre op1, Nombre op2){
        super(op1, op2);
    }

    public double valeur(){
        return getOPerande1().valeur()*getOPerande2().valeur();
    }

    public String toString() {
        return "("+getOPerande1().valeur() + " x " + getOPerande2().valeur() + ") = " + valeur();
    }

}
