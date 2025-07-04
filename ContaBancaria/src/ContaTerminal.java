import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int conta = 1021;

        System.out.println("Seja bem-vindo(a) ao banco!");
        System.out.println("Para comçar a criar sua conta, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Agora digite o valor para saque:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco! "+
         "Sua agência é " +agencia+ ", conta " +conta+ " e seu saldo de " +saldo+ " já está disponível para saque.");

    
         scanner.close();

    }
}
