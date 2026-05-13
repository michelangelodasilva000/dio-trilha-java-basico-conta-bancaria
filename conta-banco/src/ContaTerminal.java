import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do titular da conta: ");
        String nomeTitular = scanner.next();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    
    }
}
