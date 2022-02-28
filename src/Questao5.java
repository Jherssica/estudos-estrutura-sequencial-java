import java.util.Locale;
import java.util.Scanner;

public class Questao5 {

     /*
     *Data 22/02/2022
     * Autor: Jherssica Amorim Carvalho dos Santos
     *
     * Questão:
     Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada:                                                 Saída:
5
6
7
8
                                                          DIFERENCA = -26
Entrada:                                                  Saída:
5
6
-7
8
                                                          DIFERENCA = 86
   */


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner ( System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENÇA =" +diferenca);

        sc.close();
    }
}
