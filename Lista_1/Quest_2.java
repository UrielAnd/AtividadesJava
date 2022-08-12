package Atividade_java.Lista_1;         //PACOTE//

public class Quest_2 
{
    public static void main (String [] args)            //MAIN//
    {
    int num_1=8, num_2=9, num_3=7, num_4=4, num_5=5, num_6=6;       //Declaração de variáveis e contas//
    int contaM1 = (num_1 + num_2 + num_3) / 3;                      //Declaração de variáveis e contas//
    int contaM2 = (num_4 + num_5 + num_6) / 3;                      //Declaração de variáveis e contas//
    int soma = contaM1 + contaM2;                                   //Declaração de variáveis e contas//
    float contaMM2 = (float)soma / 2;                               //Declaração de variáveis e contas//

    System.out.println("A média aritimética de 8, 9 e 7 é: " + contaM1); //OUTPUT//
    System.out.println("A média aritimética de 4, 5 e 6 é: " + contaM2); //OUTPUT//
    System.out.println("A soma das médias aritiméticas é de: " + soma);  //OUTPUT//
    System.out.println("A média da média aritimética é: " + contaMM2);   //OUTPUT//
    }
    

}
