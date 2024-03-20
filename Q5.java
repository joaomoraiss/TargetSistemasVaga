
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma String: ");
        String str = input.next();
        char[] vetor = str.toCharArray();

        System.out.println("String original: " + str);

        char[] vetorInvertido = new char[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorInvertido[i] = vetor[vetor.length - 1 - i];
        }

        String strInvertida = new String(vetorInvertido);
        System.out.println("String invertida: " + strInvertida);
    }
}
