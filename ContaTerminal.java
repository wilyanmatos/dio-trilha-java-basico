import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal{
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Por favor, digite o número da agência:");
        int numeroCliente = scanner.nextInt();
        System.out.print("Informe sua agência: ");
        String agenciaCliente = scanner.next();
        System.out.print("Informe o seu nome: ");
        String nomeCliente = scanner.next();
        System.out.print("Informe o seu saldo: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agenciaCliente+", conta "+numeroCliente+" e " +
                "seu saldo "+saldoCliente+" já está disponível para saque");

    }
}


