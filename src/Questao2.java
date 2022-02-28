import java.util.Scanner;

public class Questao2 {
    /*
     *Data 22/02/2022
     * Autor: Jherssica Amorim Carvalho dos Santos
     *
     * Questão:
     * Leia 2 valores inteiros e armazene-os nas variaveis A e B.
     * efetue a soma de A e B atribuindo seu resultado na variavel X.
     * imprima X conforme exemplo apresentado abaixo.Não apresente mensagem alguma
     * alem daquilo que esta sendo especificado e não esqueça de imprimir
     * o fim da linha após o resultado.caso contrari você receberá "presentation error"
     **
     * Entrada:
     * A entrada contem 2 valores inteiros
     *
     * Saida:
     * Imprime a mesagem "X=" seguindo pelo valor da variavel x e pelo final da linha.
     * cuide para que tenha um espaço antes e depois do sinal de igualdade,conforme exemplo abaixo.

     * Exemplos de entrada:                Exemplos de saida:
     * 10                                   x=  19
     * 9
     *
     *
     * -10                                 X= -6
     * 4
     *
     *
     * 15                                  X= 8
     * -7
     * */


    public static void main(String[] args) {

        // para ler a 2 variaveis
        Scanner sc =new Scanner(System.in);

        //Variaveis

         int A=sc.nextInt();
         int B=sc.nextInt();
         int X= A + B;

        // atribuir valores a variavel x,mesnsagem a segui é "x="
        System.out.println("X=" + X);

        sc.close();
    }








}
