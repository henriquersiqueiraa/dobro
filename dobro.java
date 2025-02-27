import java.util.Scanner;
public class dobro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        System.out.println("\nO dobro de " + numero + " é " + (numero * 2));
    }
}
