import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Informe o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.printf("Infome o número de sua agência: ");
        agencia = scanner.next();
    
        System.out.printf("Infome seu nome: ");
        nomeCliente = scanner.next();

        System.out.printf("Infome o saldo da conta: ");
        saldo = scanner.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo );

        scanner.close();
    }
}
