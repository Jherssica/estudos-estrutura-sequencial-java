import java.util.Scanner;

public class Questao6 {

/*
Leia dois valores inteiros. Após isso, calcule o produto entre eles e armazene o resultado em uma
variável denominada PROD . Imprima o resultado como no exemplo abaixo. Não se esqueça de imprimir
o final da linha após o resultado, caso contrário você receberá “Erro de apresentação” .

Entrada
O arquivo de entrada contém 2 números inteiros.

Saída
Imprima a mensagem "PROD" e PROD conforme o exemplo a seguir, com um espaço em branco antes e depois
do sinal de igual.
 */

    public static void main(String[] args) {

        //leitura de dados
        Scanner sc= new Scanner (System.in);


        //variaveis
        int A= sc.nextInt();
        int B = sc.nextInt();

        //PROCESSAMENTO DE DADOS
        int prod= A + B;


        //SAIDA DOS DADOS
        System.out.println("PROD = " + prod);

        sc.close();
    }
}
