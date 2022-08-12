package Atividade_java;     //PACOTE//

import java.util.Scanner;       //BIBLIOTECA//

public class Quest_6
{
    public static void main (String [] args)        //MAIN//
    {
        float massa, altura, tempo, cavalos;        //Declarações de variáveis//

        Scanner ent = new Scanner(System.in);

        System.out.print("Qual é a massa em quilogramas que deseja levantar o bloco: ");        //INFO//
        massa = ent.nextFloat();        //INPUT//

        System.out.print("Qual a altura em metros que deseja levantar o bloco: ");      //INFO//
        altura = ent.nextFloat();       //INPUT//

        System.out.print("Qual o tempo em segundos que deseja levantar o bloco: ");     //INFO//
        tempo = ent.nextFloat();        //INPUT//
        
        cavalos = (massa * altura / tempo) / (float)745.6999;       //CONTA//

        System.out.printf("O número de cavalos necessários para levantar esse bloco é de %.2f cavalos.", cavalos);      //OUTPUT//

        ent.close();        //Fechando Dado//
    }
}