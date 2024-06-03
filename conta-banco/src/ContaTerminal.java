import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("------------CONTA BANCÁRIA------------");
        System.out.println("Seja bem-vindo(a)! Siga as instruções a seguir para criar sua conta.");
        System.out.println();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Agora, digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Insira seu CPF:");
        String cpf = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Agora, insira o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta de número " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        System.out.println();

        System.out.println("------------SUA CONTA------------");
        System.out.println();

        System.out.println("Deseja fazer um saque? Insira Sim ou Não:");
        String saque = scanner.next();

        if (saque.equalsIgnoreCase("Sim")) {
            System.out.println("Insira o valor que deseja sacar:");
            double valor = scanner.nextDouble();
            
            if (valor > 0) {
                if (valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso. Seu novo saldo é: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente. Seu saldo atual é: R$ " + saldo);
                }
            } else {
                System.out.println("Valor de saque inválido. Insira um valor positivo.");
            }
        } else {
            System.out.println("Solicitação de saque cancelada.");
        }

        scanner.close();

    }
}
    

        
