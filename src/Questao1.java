import java.util.Locale;
import java.util.Scanner;

public class Questao1 {


    /*
    *Data 22/02/2022
    * Autor: Jherssica Amorim Carvalho dos Santos
    *
    * Questão:
    * Faça uma programa para ler as medidas da largura e comprimento de um
    * terreno retangular com uma casa decimal,bem como o valor do metro quadrado
    * do terreno com duas casas decimais.Em seguida,o programa deve mostrar o valor
    * da area do terreno, bem como o valor do preço do terreno,ambos com duas casas
    * decimais,conforme exemplo.
    *
    * Exemplo:
    *
    * Entrada:
    * 10.0
    * 30.0
    * 200.00
    *
    * Saida:
    * AREA: 300.00
    * PRECO: 60000.00
    *
     */


    public static void main(String[] args) {
        // PARA LER OS DADOS DE ENTRADA
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //VARIAVEIS
        double largura, comprimento,metroQuadrado;

        //FAZENDO A LEITURA DAS VARIAVEIS
        largura = sc.nextDouble();
        comprimento=sc.nextDouble();
        metroQuadrado=sc.nextDouble();

        //ATRIBUIÇÃO DE VALORES DE VARIAVEIS
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        //RESULTADO,IMPRIMINDO VALOR DA QUESTÃO
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f%n" , preco);

        sc.close();
    }





}
