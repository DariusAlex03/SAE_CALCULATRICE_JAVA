package main;

public class Division extends Operation{

    public Division(Expression op1,Expression op2)throws ManqueOperandeException{
        super(op1, op2);
        if (op1.valeur() == 0 | op2.valeur() == 0){
            throw new ManqueOperandeException();
        }
    }
    public Division(Expression op1, Expression op2){
        super(op1, op2);
    }
    public double valeur() throws ArithmeticException{
        double result = 0;
        try {
            result = (getOPerande1().valeur() / (int) getOPerande2().valeur());
        }
        catch (ArithmeticException e){
            System.out.println("Attention, division par 0, valeur retourne automatiquement est 0");
        }
        return result;
    }

    public String toString() {
        return "("+getOPerande1().valeur() + " / " + getOPerande2().valeur() + ") ";
    }

}
