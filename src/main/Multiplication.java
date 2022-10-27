package main;

public class Multiplication extends Operation{
    public Multiplication(Expression op1,Expression op2)throws ManqueOperandeException{
        super(op1, op2);
        if (op1.valeur() == 0 | op2.valeur() == 0){
            throw new ManqueOperandeException();
        }
    }
    public Multiplication(Nombre op1, Nombre op2){
        super(op1, op2);
    }

    public double valeur(){
        return getOPerande1().valeur()*getOPerande2().valeur();
    }

    public String toString() {
        return "("+getOPerande1().valeur() + " x " + getOPerande2().valeur() + ") ";
    }

}
