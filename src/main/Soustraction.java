package main;

public class Soustraction extends Operation {

    public Soustraction(Expression op1, Expression op2){

        super(op1, op2);
    }

    public double valeur(){

        return getOPerande1().valeur() - getOPerande2().valeur();
    }

    public String toString() {

        return "("+getOPerande1().valeur() + " - " + getOPerande2().valeur() + ") = " + valeur();
    }

}
