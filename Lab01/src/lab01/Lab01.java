/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        float num, maior, menor, numeroCompare;
        maior = 0;
        menor = 0;
        int count = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quanto numeros vão ser comparados: ");
        numeroCompare = entrada.nextFloat();

        while (count <= numeroCompare) {
            System.out.print("Numero " + count + " : ");
            num = entrada.nextFloat();
            if (num > maior) {
                maior = num;
            }
            if (num < maior) {
                menor = num;
            }
            count++;
        }
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("O menor numero digitado foi: " + menor);
    }
}