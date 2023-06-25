import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Número da Conta: ");
        int numero = scan.nextInt();
        System.out.print("Agência da Conta: ");
        int agencia = scan.nextInt();
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scan.next();
        System.out.print("Saldo da Conta: ");
        double saldo = scan.nextDouble();
        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + " já está disponível para saque");
        scan.close();
                
        }

    } 
