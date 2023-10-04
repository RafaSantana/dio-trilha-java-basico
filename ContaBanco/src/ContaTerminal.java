import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe a agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o número da conta: ");
        Integer numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe o saldo da conta: ");
        Double saldo = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numeroConta + " e seu saldo " + df.format(saldo)
                        + " já está disponível para saque");
    }
}
