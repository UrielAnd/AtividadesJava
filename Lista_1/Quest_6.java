package Atividade_java.Lista_1;     //PATOTE//

import java.util.Scanner;      //BIBLIOTECA//

public class Quest_6 
{
    public static void main (String [] args)        //MAIN
    {
        int num;    //Declaração de variável//

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite um número para saber o seu sucessor e o antecessor: ");           //INFO//
        num = ent.nextInt();        //INPUT//

        System.out.println("O antecessor do número digitado é: " + --num);      //OUTPUT//      //INPUT//
        num++;
        System.out.println("O sucessor do número digitado é: " + ++num);        //OUTPUT//
    
        ent.close();            //Fechando Dado//
    }

}
