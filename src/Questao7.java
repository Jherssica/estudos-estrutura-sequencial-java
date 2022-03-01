import java.util.Locale;
import java.util.Scanner;

public class Questao7 {

    /*
    Leia três valores (variáveis A, B e C), que são as notas dos três alunos.
    Em seguida, calcule a média, considerando que a nota A tem peso 2,
    a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 a 10,0,
     sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores de pontos flutuantes (duplos) com um dígito após o ponto decimal.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo a seguir, com um espaço em branco antes
e depois do sinal de igual.


*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner ( System.in);



        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();


        double media = (A * 2 +B * 3 +C * 5)/ 10.0;


        System.out.printf("SUA MEDIA =  %.2f%n" , media);

       sc.close();
    }


}
