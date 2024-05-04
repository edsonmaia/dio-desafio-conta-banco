import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criar um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir mensagem de interação e ler o dado digitado
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

    }
}
