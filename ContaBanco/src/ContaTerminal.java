import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pelo scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o primeiro nome do Cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo:");
        double saldoConta = scanner.nextDouble();

        //TODO: exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");

    }
}