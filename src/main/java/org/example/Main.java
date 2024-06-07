package org.example;

public class Main {
    public static void main(String[] args) {
        String[] palabra = {"Hola", "Mundo", "Como estas?"};
        int[] numeros = {1,2,3};
        String[] palabras2 = new String[3];

        palabras2[0] = "nope";

        for (int i = 0; i < 3; i++) {
            System.out.println(palabra[i]);
            System.out.println(numeros[i]);
        }
    }
}
