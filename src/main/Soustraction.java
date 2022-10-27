package main;

public class Soustraction extends Operation {

    public Soustraction(Expression op1,Expression op2)throws ManqueOperandeException{
        super(op1, op2);
        if (op1.valeur() == 0 | op2.valeur() == 0){
            throw new ManqueOperandeException();
        }
    }

    public Soustraction(Expression op1, Expression op2){

        super(op1, op2);
    }

    public double valeur(){

        return getOPerande1().valeur() - getOPerande2().valeur();
    }

    public String toString() {

        return "("+getOPerande1().valeur() + " - " + getOPerande2().valeur() + ") ";
    }

}
