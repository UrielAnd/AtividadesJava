package Atividade_java.Lista_1;         //PACOTE//

import java.util.Scanner;       //BIBLIOTECA//

public class Quest_5 {
    public static void main (String [] args)            //MAIN//
    {
        int salario_min=788;        //Declaração de variáveis//
        float valor, resposta;      //Declaração de variáveis//

        Scanner ent = new Scanner(System.in);

        System.out.print("Qual é o valor do seu salário: ");        //INFO//
        valor = ent.nextInt();      //INPUT//

        resposta = valor / (float)salario_min;          //CONTA//

        System.out.printf("A quantidade de salários mínimos que você ganha é %.2f", resposta);      //OUTPUT//

        ent.close();            //Fechando Dado//
    }
}
