/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomes;

/**
 *
 * @author Gomes
 */
import java.util.Arrays;   
import java.util.Scanner;  

public class Nomes {
    public static void main(String[] args) {
       
        Scanner ordem= new Scanner(System.in); // Cria um objeto Scanner para ler

        System.out.print("Quantos nomes você quer digitar? ");// mensagem inicial para digitar informações
        int qtd = ordem.nextInt();   // lê um número inteiro
        ordem.nextLine();            //evita pular o próximo input

        
        String[] nomes = new String[qtd]; // cria um array que comporte o tanto de dados escolhidos

        // ler os nomes e armazenar no array
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": "); // area de digitação de acordo com o numero escolhido por meio da conta de quantidade
            nomes[i] = ordem.nextLine();  // lê cada nome digitado
        }

        
        Arrays.sort(nomes); // responsavel por organizar 

        
        System.out.println("\n--- Ordem Crescente (A-Z) ---"); // titulo de exibição
        for (String nome : nomes) { // ordena de forma crescente (alfabetica) baseado na primeira letra 
            System.out.println(nome);
        }

        
        System.out.println("\n--- Ordem Decrescente (Z-A) ---"); // titulo de exibição
        for (int i = nomes.length - 1; i >= 0; i--) { // ordena de forma decrescente lendo o array de tras para frente
            System.out.println(nomes[i]);
        }

      
        ordem.close(); // fecha o código 
    }
}
