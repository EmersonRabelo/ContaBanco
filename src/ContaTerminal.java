import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.print("\nPor favor insira os seguintes dados.\n");

        System.out.print("Número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Seu saldo: ");
        saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta com nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
