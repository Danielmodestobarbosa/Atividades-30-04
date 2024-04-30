/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.atividade30_04;

import java.util.Scanner;


public class Atividade1_30_04 {

    public static void Insercao(int []array){
         int n = array.length;
           int chave;
           int j;

           for(int i = 1; i < array.length; i++){
               chave = array[i];
                    for(j = i - 1; (j >= 0 && array[j] > chave); j--){
                        array[j + 1] = array[j]; 
                    }
                        array[j + 1] = chave;
               
            }
    }
    
    static int psqLinear(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i; 
            }
        }
        return -1; 
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite a quantidade de numeros: ");
        int qtdNumeros = scanner.nextInt();

        
        int[] numeros = new int[qtdNumeros];

        System.out.println("Digite os números inteiros:");
        for (int i = 0; i < qtdNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        Insercao(numeros);

        
        System.out.print("Digite o número para ser pesquisado: ");
        int nmrPesquisa = scanner.nextInt();

        
        int posicao = psqLinear(numeros, nmrPesquisa);

        
        if (posicao != -1) {
            System.out.println("O número " + nmrPesquisa + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O número " + nmrPesquisa + " não foi encontrado na lista.");
        }

        scanner.close();
        
        
    }
    
    
    
    
    
        
}
