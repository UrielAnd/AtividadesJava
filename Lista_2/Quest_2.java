package Atividade_java;         //PACOTE//

import java.util.Scanner;       //BIBLIOTECA//

public class Quest_2 
{
    private static void clearBuffer(Scanner scanner)        //procedimento para linpa o bufffer de memória//
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    public static void main (String [] args)        //MAIN//
    {
        int Sexo;
        float Alt, Alt_M=0, media_H, menor=100, maior=0;        //Declarações de variáveis//
        int Qnt_F=0, Qnt_H=0;       //Declarações de variáveis//
        Scanner ent = new Scanner(System.in);
        
        for(int repet=1;repet<=10;repet++)      //Ciclo para as 10 pessoas
        {
            do      //Ciclo para previnir errors//
            {
                System.out.println("|1|->Masculino |2|->Feminino");     //INFO//
                System.out.print("Qual seu sexo: ");        //INFO//
                Sexo = ent.nextInt();       //INPUT//
                if((Sexo!=1)&&(Sexo!=2))        //CONDICIONAL//
                {
                    System.out.printf("___ERRO Sexo inválido___\n");        //INFO//
                }
            }while((Sexo!=1)&&(Sexo!=2));
            do      //Ciclo para previnir errors//
            {
                System.out.print("Digite sua altura: ");        //INFO//
                Alt = ent.nextFloat();      //INPUT//
                
                if((Alt<0.30)||(Alt>2.5))       //CONDICIONAL//
                {
                    System.out.printf("___ERRO Altura inválida___\n");      //INFO//
                }
            }while((Alt<0.30)||(Alt>2.5));
            clearBuffer(ent);
            
            if(Alt>maior)       //CONDICIONAL//
            {
                maior=Alt;
            }

            if(Alt<menor)       //CONDICIONAL//
            {
                menor=Alt;
            }

            if(Sexo==2)     //CONDICIONAL//
            {
                Qnt_F++;
            }
            else        //CONDICIONAL//
            {
                Alt_M+=Alt;
                Qnt_H++;
            }
        }
        media_H = Alt_M / Qnt_H;        //CONTA//
        
        System.out.printf("A maior altura do grupo é de %.2fm e a menor é %.2fm. \n A média de altura dos homens é de %.2fm. \n O número de mulheres é de %d mulheres.", maior, menor, media_H, Qnt_F);         //OUTPUT//
        
        ent.close();        //Fechando Dado//  
    }
}
