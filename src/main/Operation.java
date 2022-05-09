package main;

public abstract class Operation {

    private final Nombre op1;
    private final Nombre op2;


    public Operation(Nombre op1, Nombre op2){
        this.op1 = op1;
        this.op2 = op2;
    }

    public abstract int valeur();
    public Nombre getOPerande1(){
        return this.op1;
    }
    public Nombre getOPerande2(){
        return this.op2;
    }
}
