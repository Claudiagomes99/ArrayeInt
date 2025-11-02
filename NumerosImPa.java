/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosimpa;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
import java.util.Arrays;

public class NumerosImPa {

    public static void main(String[] args) {
        Scanner ordem = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int qtd = ordem.nextInt();

        int[] numeros = new int[qtd];

        // Ler os números e armazenar no array
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = ordem.nextInt();
        }

        // Contar quantos pares e ímpares existem
        int contPares = 0;
        int contImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }

        // Criar arrays para pares e ímpares
        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];

        // Preencher os arrays de pares e ímpares
        int indicePar = 0;
        int indiceImpar = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[indicePar] = numeros[i];
                indicePar++;
            } else {
                impares[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }

        // Ordenar os arrays
        Arrays.sort(pares);
        Arrays.sort(impares);

        // Exibir números pares
        System.out.println("\n--- Números Pares (Ordem Crescente) ---");
        if (pares.length == 0) {
            System.out.println("Nenhum número par foi digitado.");
        } else {
            for (int i = 0; i < pares.length; i++) {
                System.out.println(pares[i]);
            }
        }

        // Exibir números ímpares
        System.out.println("\n--- Números Ímpares (Ordem Crescente) ---");
        if (impares.length == 0) {
            System.out.println("Nenhum número ímpar foi digitado.");
        } else {
            for (int i = 0; i < impares.length; i++) {
                System.out.println(impares[i]);
            }
        }

        ordem.close();
    }
}