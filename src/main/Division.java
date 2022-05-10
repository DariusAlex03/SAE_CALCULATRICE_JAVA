package main;

public class Division extends Operation{
    public Division(Expression op1, Expression op2){
        super(op1, op2);
    }
    public double valeur(){
        int result = 0;
        try {
            result = (int) (getOPerande1().valeur() / getOPerande2().valeur());
            return result;
        }
        catch (ArithmeticException e){
            System.out.println("Attention, division par 0, valeur retourne automatiquement est 0");
        }
        return result;
    }

    public String toString() {
        return getOPerande1().valeur() + " / " + getOPerande2().valeur() + " = " ;
    }

}
