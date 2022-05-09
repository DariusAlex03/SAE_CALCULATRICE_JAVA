package main;

public class Division extends Operation{
    public Division(Nombre op1, Nombre op2){
        super(op1, op2);
    }
    public int valeur(){
        int result = 0;
        try {
            result = getOPerande1().valeur() / getOPerande2().valeur();
            return result;
        }
        catch (ArithmeticException e){
            System.out.println("Attention, division par 0, valeur retourne automatiquement est 0");
        }
        return result;
    }

    public String toString() {
        return getOPerande1().valeur() + " / " + getOPerande2().valeur() + " = " + valeur();
    }

}
