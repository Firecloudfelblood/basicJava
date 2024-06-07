package org.example;

import org.calculadora.Valores;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] palabra = {"Hola", "Mundo", "Como estas?"};
        int[] numeros = {1,2,3};
        String[] palabras2 = new String[3];
        List<Valores> listaValores = new ArrayList<>();
        Valores v1 = new Valores(1,1,1);
        Valores v2 = new Valores();
        v2.setNumero1(2);
        v2.setNumero2(2);
        v2.setResultado(2);
        Valores v3 = new Valores(3,3,3);

        listaValores.add(v1);
        listaValores.add(v2);
        listaValores.add(v3);
        listaValores.add(new Valores(4,4,4));

//        System.out.println(listaValores.get(3).toString());
//        System.out.println(listaValores.get(3).getNumero2());

        listaValores.stream()
                .filter(x-> x.getNumero1()%2==0)
                .forEach( x -> System.out.println(x.toString()));

        for (Valores v : listaValores){
            if(v.getNumero1() % 2 == 0) {
                System.out.println(v.toString());
            }
        }


//        palabras2[0] = "nope";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(palabra[i]);
//            System.out.println(numeros[i]);
//        }
    }
}
