package Atividade_java.Lista_1;         //PACOTE//

import java.util.Scanner;       //BIBLIOTECA//

public class Quest_3
{
    public static void main (String [] args)            //MAIN//
    {
        int saldo, conta;           //Declaração de variáveis//

        Scanner ent = new Scanner(System.in);     

        System.out.println("Informe o seu saldo para o reajuste de 1%:");//INFO//
        saldo = ent.nextInt();          //INPUT//

        conta = (1 * saldo) / 100;         //CONTA//

        saldo+=conta;           //CONTA//

        System.out.println("O seu saldo com o reajuste é: " + saldo + "reais.");     //OUTPUT//

        ent.close();    //Fechando Dado//
    }
}