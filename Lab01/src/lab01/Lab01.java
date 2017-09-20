/*
 Universidade Estadual da Paraíba / Centro de Ciências e Tecnologias - CCT /
Departamento de Computação / Curso de Bacharelado em Ciência da Computação
Componente Curricular: Laboratorio de Programação
Aluno: Kelvin Vandick de Sousa - Mat.: 141085134
 */
package lab01;

/**
 *
 * @author kelvin Vandick
 */
import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        
        float n, max=0, min=0, aux;
       
        int contador = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quatidade de numeros a serem comparados: ");
        aux = entrada.nextFloat();

        while (contador <= aux) {
            System.out.print("n " + contador + " : ");
            n = entrada.nextFloat();

            if (max == 0 && min == 0) {
                max = n;
                min = n;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            contador++;
        }
        System.out.println("O maior numero é: " + max);
        System.out.println("O menor numero é: " + min);
    }
}