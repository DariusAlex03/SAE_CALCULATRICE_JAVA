package main;

public class Soustraction extends Operation{
    private int ope1;
    private int ope2;
    private int resul;

    public Soustraction(Nombre op1, Nombre op2){

        this.resul = op1 - op2;
    }

    public int valeur(){
        return 0;
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public Nombre getOPerande1(){

        return null;
    }

    @Override
    public Nombre getOPerande2() {
        return null;
    }

}
