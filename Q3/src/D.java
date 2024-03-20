public class D {
    public static void main(String[] args) {
        int tamanhoSequencia = 5;
        int inicio = 2;
        for (int i = 0; i < tamanhoSequencia; i++) {
            int numero = inicio + (i * 2);
            int quadrado = numero * numero;
            System.out.print(quadrado + ", ");
        }
        System.out.println("Proximo Numero: 100");
    }
}
