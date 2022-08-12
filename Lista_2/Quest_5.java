package Atividade_java;     //PACOTE//

import java.util.Scanner;       //BIBLIOTECA//

public class Quest_5    
{
    public static void main (String [] args)            //MAIN//
    {
        float raio, altura, volume;     //Declaração de variáveis//

        Scanner ent =new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");        //INFO//
        raio = ent.nextFloat();     //INPUT//
        
        System.out.print("Digite a altura da lata: ");          //INFO//   
        altura = ent.nextFloat();       //INPUT//

        volume = (((float)3.14159 * raio) * raio) * altura;         //CONTA//

        System.out.printf("O valor do volume dessa lata de oléo é de %.2f m³.", volume);        //OUTPUT//

        ent.close();        //Fechando Dado//
    }
}
