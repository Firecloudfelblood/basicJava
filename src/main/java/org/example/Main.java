package org.example;

import org.calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.setNumero1(5);
        cal.setNumero2(2);
        cal.operaciones("suma");
        System.out.println(cal.getResultado());
    }
//        String mesaje = "Hello world! a todos ";
//        int numero = 5;
//        long numeroEntero =9000000000l;
//        boolean paso = false;
//        double decimal = 0.0;
//        double num1 =5.0;
//        double num2 =2;
//        String operacion = "division";
//
//        paso = numero > 5;
////        if(paso){
////            System.out.println(numero + numero);
////        } else {
////            System.out.println(numero * 5);
////        }
////        decimal = num1/num2;
////
////        System.out.println(decimal);
//
////        if(operacion.equals("suma")){
////            System.out.println( num1 + num2);
////        } else if (operacion.equals("resta")) {
////            System.out.println(num1 -num2);
////        } else if (operacion.equals("multiplicacion")) {
////            System.out.println(num1 * num2);
////        }
////
////        switch (operacion){
////            case "suma": System.out.println(num1 + num2);
////                break;
////            case "resta": System.out.println(num1 - num2);
////                break;
////            case "multiplicacion": System.out.println(num1 * num2);
////                break;
////            case "division":
////                System.out.println(num1/num2);
////                break;
////            case "noesoperacion"  :
////                System.out.println(" nose que operacion");
////                break;
////
////            default:
////                System.out.println("aqui no debe llegar");
////                break;
////
////        }
//        System.out.println(10 % 3);
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0){
//                System.out.println("contando " + i);
//            }
//        }
//
//        while (numero > 0){
//                if ( numero % 2 != 0 ) {
//                    System.out.println("contando de bajada " + numero);
//                }
//            numero--;
//        }
//    }
}