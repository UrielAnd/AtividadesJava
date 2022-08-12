package Atividade_java;             //PACOTE//

import java.util.Scanner;       //BIBLIOTACA//

public class Quest_4 
{
    public static void main (String [] args)        //MAIN//
    {
        float hp, lp, ha, la, conta;           //Declaralções de variáveis//

        Scanner ent = new Scanner(System.in);

        System.out.println("Esse programa descobre quantos azuleijos de determinado tamanho cabe em uma parede de um determinado tamanho.");        //INFO//

        System.out.print("Digite a altura da parade: ");        //INFO//
        hp = ent.nextFloat();           //INPUT//

        System.out.print("Digite a largura da parade: ");       //INFO//
        lp = ent.nextFloat();           //INPUT//

        System.out.print("Digite a altura do azulejo: ");       //INFO//
        ha = ent.nextFloat();           //INPUT//
        
        System.out.print("Digite a largura do azulejo: ");      //INFO//
        la = ent.nextFloat();           //INPUT//

        conta = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede é de " + conta + " azulejos.");         //OUTPUT//

        ent.close();        //Fechando Dado//
    }
}
