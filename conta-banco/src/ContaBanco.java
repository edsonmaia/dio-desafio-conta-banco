import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {

        // Criar um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir mensagem de interação e ler o dado digitado
        System.out.println("Digite o seu nome completo: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o saldo da Conta: ");
        double Saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$ " + Saldo + " já está disponível para saque.");

    }
}
