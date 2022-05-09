package main;

public class Division extends Operation{
    private Nombre ope1;
    private Nombre ope2;
    public Division(Nombre op1, Nombre op2){
        this.ope1 = op1;
        this.ope2 = op2;

    }
    public int valeur(){
        return 0;
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public Nombre getOPerande1() {
        return this.ope1;
    }

    @Override
    public Nombre getOPerande2() {
        return this.ope2;
    }
}
