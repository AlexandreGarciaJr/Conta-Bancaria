import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        //Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá Cliente");
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Informe seu saldo bancário: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobreNome + " , obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + " , conta número " + conta + " e seu saldo de " + saldo + " já está disponivel para saque!"); 

        scanner.close();
        
    }
}
