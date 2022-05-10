package main;

public abstract class Operation extends Expression {

    private final Expression op1;
    private final Expression op2;


    public Operation(Expression op1, Expression op2){
        this.op1 = op1;
        this.op2 = op2;
    }

    public abstract double valeur();
    public Expression getOPerande1(){
        return this.op1;
    }
    public Expression getOPerande2(){
        return this.op2;
    }
}
