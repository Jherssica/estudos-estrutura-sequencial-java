import java.util.Locale;
import java.util.Scanner;

public class Questao4 {




    /*
    *Data 22/02/2022
    * Autor: Jherssica Amorim Carvalho dos Santos
    *
    *Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    *mensagem explicativa, conforme exemplos.

    Exemplos:
Entrada:                      Saída:
10
30
                              SOMA = 40
Entrada:                      Saída:
-30
10
                              SOMA = -20
Entrada:                      Saída:
0
0
                              SOMA = 0
    * */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("SOMA =" + soma);

        sc.close();
    }
}
