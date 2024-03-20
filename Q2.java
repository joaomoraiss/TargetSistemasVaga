import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número a ser checado: ");
        int numero = input.nextInt();
        System.out.println("Resultado: "+estaNaSequencia(numero));
    }
    public static boolean estaNaSequencia(int numero){
        int numAnterior = 0, numAtual = 1, numProximo = 0;
        while (numProximo <= numero) {
            if (numero == 0 || numero == 1 || numero == numProximo) {
                return true;
            }
            numProximo = numAtual + numAnterior;
            numAnterior = numAtual;
            numAtual = numProximo;
        }
        return false;
    }
}
