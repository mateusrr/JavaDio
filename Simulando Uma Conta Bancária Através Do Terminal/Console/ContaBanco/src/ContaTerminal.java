import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da Agência.");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta.");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do Cliente.");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da Conta.");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia +
                ", Conta: " + numero + " e seu Saldo: R$" + saldo + ". Já está disponível para saque.");

        scanner.close();
    }
}