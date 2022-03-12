/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grm.opmatematica;

import java.util.Scanner;

public class Operacoes {
    public static void main( String[]args ){
       
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int resultado;

        System.out.println("Digite um numero: ");
        n1 = input.nextInt();

        System.out.println("Digite um numero: ");
        n2 = input.nextInt();

        resultado = n1 + n2;
        System.out.print("O resut]ltado é:" +resultado);
    }
}