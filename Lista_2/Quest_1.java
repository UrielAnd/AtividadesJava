package Atividade_java;     //PACOTE//

import java.util.Scanner;       //BIBLIOTECA

public class Quest_1
{
    public static void main (String [] args)
    {
        float Celsius, Kelvim, Reaumur, Rankine, Fahrenheit;        //Declaração das variáveis de temperatura//
        
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius para descobrir em outros temperaturas.");       //INFO//
        System.out.print("Digite: ");       //INFO//
        Celsius= ent.nextFloat();       //INPUT//

        Fahrenheit = (Celsius * (float)1.8) + 32;                   //CONTA//
        Kelvim = Celsius + (float)273.15;                           //CONTA//
        Reaumur = Celsius * (float)0.8;                             //CONTA//
        Rankine = (float)((Celsius * 1.8) + 32 + 459.67);           //CONTA//

        System.out.printf("%.2f° Celsius = %.2f° Kelvim \n", Celsius, Kelvim);              //OUTPUT//
        System.out.printf("%.2f° Celsius = %.2f° Reaumur \n", Celsius, Reaumur);            //OUTPUT//
        System.out.printf("%.2f° Celsius = %.2f° Rankine \n", Celsius, Rankine);            //OUTPUT//
        System.out.printf("%.2f° Celsius = %.2f° Fahrenheit \n", Celsius, Fahrenheit);      //OUTPUT//

        ent.close();        //Fechando Dado//
    }
}