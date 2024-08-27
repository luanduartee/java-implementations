import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o número da sua conta!");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        contaTerminal.agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite seu nome!");
        contaTerminal.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo!");
        contaTerminal.saldo = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + ", conta " 
        + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo + " já está disponível para saque.");

        scanner.close();
    }
}
