package main;

public class ManqueOperandeException extends Exception{
    /**
     * Exception est levée si une opération n'a pas pu être correctement instantiée car le nombre d'opérande est incorrect
     * Encapsule les opérandes qui ont provoquées la levée de l'exception
     * @version 1.0
     */

    public ManqueOperandeException(Expression op1, Expression op2){
        this.op1 = op1;
        this.op2 = op2;
    }
    /**
     * Constructeur qui initialise l'exception
     */
    public Expression getOperande1(){
        return this.op1;

    }
    public Expression getOperande2(){
        return this.op2;

    }
    public String getMessage(){
        return ( l'expression est levée '+getOperande1().valeur '+' + getOperande2().valeur()' );
    }



}
