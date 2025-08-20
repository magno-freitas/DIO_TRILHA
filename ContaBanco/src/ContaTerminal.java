
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Informe o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Informe o número da agência: ");
        agencia = sc.nextLine();
        System.out.println("Informe o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("Informe o saldo: ");
        saldo = sc.nextFloat();
        
        System.out.println("Olá "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
