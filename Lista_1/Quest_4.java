package Atividade_java.Lista_1;         //PATOTE//

import java.util.Scanner;       //BIBLIOTECA//

public class Quest_4 
{
    public static float getpeças(int valor)       //MÉTODOS PARA REALIZAR O GET DE PEÇAS//
    {
        int valor_unitario, quant;      //Declaração de variáveis//
        float TOTAL=0;                  //Declaração de variáveis//

        try (Scanner ent = new Scanner(System.in))
        {
            for(int repet=1;repet<=2;repet++)       //Ciclo de repetição para capturar os dados das 2 peças//
            {
                System.out.print("Qual o código da peça " + repet + ": ");      //INFO//
                ent.nextInt();  //INPUT//
                System.out.print("Qual o valor unitário da peça " + repet + ": ");      //INFO//
                valor_unitario = ent.nextInt(); //INPUT//
                System.out.print("Qual a quantidade comprada da peça " + repet + ": ");     //INFO//
                quant = ent.nextInt();  //INPUT//
                TOTAL += valor_unitario*quant;      //CONTA//
            }
        }

        TOTAL *= (float)valor/100+1;            //CONTA//   
    return TOTAL;       //Retorno para a função principal//
}
    public static void main (String [] args)        //MAIN//
    {
        int valor;          //Declaração de variáveis//
        float resposta;     //Declaração de variáveis//
        
        Scanner ent = new Scanner(System.in);
        System.out.print("Qual porcentagem do IPI a ser acrescido no valor das peças: ");       //INFO//
        valor = ent.nextInt();  //INPUT//

        resposta = getpeças(valor);     //Chamada do método//
        System.out.println("O valor total a ser pago é:" + resposta + "reais.");        //OUTPUT//

        ent.close();            //Fechando Dado//    
    }
}
