package ContaBanco.src;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pelo scanner os valores digitados no terminal

        int numeroConta = getNumeroConta(scanner);

        String agencia = getString(scanner);

        String nomeCliente = getNomeCliente(scanner);

        double saldoConta = getSaldoConta(scanner);

        //TODO: exibir a mensagem conta criada

        mensagemFinal(nomeCliente, agencia, numeroConta, saldoConta);

    }

    private static void mensagemFinal(String nomeCliente, String agencia, int numeroConta, double saldoConta) {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", sua conta é: " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");
    }

    private static double getSaldoConta(Scanner scanner) {
        System.out.println("Por favor, digite o Saldo:");
        double saldoConta = scanner.nextDouble();
        return saldoConta;
    }

    private static String getNomeCliente(Scanner scanner) {
        System.out.println("Por favor, digite o primeiro nome do Cliente:");
        String nomeCliente = scanner.next();
        return nomeCliente;
    }

    private static String getString(Scanner scanner) {
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        return agencia;
    }

    private static int getNumeroConta(Scanner scanner) {
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        return numeroConta;
    }
}