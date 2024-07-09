import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente: ");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agencia com dígito: ");
        String agency = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + clientName + " , obrigado por criar uma conta em nosso banco," + " sua agência é " + agency + ",conta " + accountNumber +" e seu saldo " + balance + " já está " + "disponivel para saque.");

        scanner.close();
    }
}