import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaBanco novaConta = criarConta();
         }
    
    private static ContaBanco criarConta() {
        Scanner scanner = new Scanner(System.in);
        
      System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o número da agência:");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        return new ContaBanco(numero, agencia, nomeCliente, saldo);

    }
}
