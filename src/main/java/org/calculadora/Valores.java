package org.calculadora;

public class Valores {
    protected int numero1 =0;
    protected int numero2 =0;
    protected int resultado =0;

    public Valores(){
    }
    public Valores(int numero1, int numero2, int resultado){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString(){
        return "Numero 1 = " + numero1 + " Numero 2 = " + numero2 + " Resultado = " + resultado;
    }

}
