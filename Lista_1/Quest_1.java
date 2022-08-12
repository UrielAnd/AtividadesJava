package Atividade_java.Lista_1;         //PACOTE//

import java.util.Scanner;       //BIBLIOTECA//


public class Quest_1 
{
    public static int getAno()      //MÉTODO PARA REALIZAR O GET DE INFORMAÇÔES DO USUÁRIO//
    {
        int ano=0, repet=0;
        while(repet<1)
        {
            System.out.print("Digite seu ano(s) de vida: ");        //INFO//
            try (Scanner ent = new Scanner(System.in)) {
                ano = ent.nextInt();        //INPUT//
            }
            if((ano>=1)&&(ano<=120))
            {
                continue;      //INFO//
            }
        }
        return ano;
    }

public static int getMes()      //MÉTODO PARA REALIZAR O GET DE INFORMAÇÔES DO USUÁRIO//
{
    int mes=0, repet=0;
    while(repet<1)
        {
            System.out.print("Digite os mes(es): ");        //INFO//
            try (Scanner ent = new Scanner(System.in)) {
                mes = ent.nextInt();        //INPUT//
            }
            if((mes>=1)&&(mes<=12))
            {
                continue;       //INFO//
            }
    }     //Ciclo de repetição caso entrada de dados esteja invalida//
    return mes;
};

public static int getDia()      //MÉTODO PARA REALIZAR O GET DE INFORMAÇÔES DO USUÁRIO//
{
    int dia;
    do      //Ciclo de repetição caso entrada de dados esteja invalida//
        {
            System.out.print("Digite os dia(s): ");     //INFO//
            try (Scanner ent = new Scanner(System.in)) {
                dia = ent.nextInt();        //INPUT//
            }
            if((dia<1)&&(dia>31))
            {
                System.out.println("--ERRO DIA INVALIDA--");        //INFO//
            }
        }while((dia<1)&&(dia>31));      //Ciclo de repetição caso entrada de dados esteja invalida//
        
    return dia;
};
    public static void main (String [] args)            //MAIN//
    {
        int ANO = getAno();     //Declaração de variáveis junto com as chamada dos metodos//
        int MES = getMes();     //Declaração de variáveis junto com as chamada dos metodos//
        int DIA = getDia();     //Declaração de variáveis junto com as chamada dos metodos//
        int conta_A = ANO*365;      //Cálculos//
        int conta_M = MES*31;       //Cálculos//
        int TOTAL;      //Cálculos//
        TOTAL = conta_A + conta_M + DIA;        //Cálculos//
        System.out.println("Sua idade em dias é de " + TOTAL + " no total."); //OUTPUT//
    }
}
