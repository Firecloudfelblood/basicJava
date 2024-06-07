package org.calculadora;

public class Calculadora extends Valores{

    public void operaciones(String operacion){
        switch (operacion){
            case "suma": resultado = numero1 + numero2;
                break;
            case "resta": resultado = numero1 - numero2;
                break;
            case "multiplicacion": resultado =numero1 * numero2;
                break;
            case "division":
                resultado = numero1/numero2;
                break;
            case "noesoperacion"  :
                System.out.println(" nose que operacion");
                break;

            default:
                System.out.println("aqui no debe llegar");
                break;

        }
    }
}
