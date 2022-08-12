package Atividade_java;     //PACOTE//

import  java.util.Scanner;          //BIBLIOTECA//

public class Quest_3 
{
    public static void main (String [] args)           //MAIN//
    {
        int funcionarios;       //Declaração de variáveis//
        float salario=0, M_salarial;        //Declarações de variáveis//
        Scanner ent = new Scanner(System.in);

        do
        {
            System.out.print("Quantos salarios de funcionarios deseja inserir: ");      //INFO//
            funcionarios = ent.nextInt();       //INPUT//
            if(funcionarios<1)
            {
                System.out.print("____ERRO NÚMERO INVÁLIDO____");       //INFO//
            }
        }while(funcionarios<1);

        for(int repet=1;repet<=funcionarios;repet++)
        {
            System.out.print("Digite o salário do funcionário: " + repet + " ");        //INFO//
            salario += ent.nextFloat();         //INPUT//
        }
        M_salarial = salario / funcionarios;            //CONTA//
        System.out.printf("A média salarial dos funcionários é de %.2f reais.", M_salarial);        //OUTPUT//

        ent.close();                //Fechando Dado//
    }
}
