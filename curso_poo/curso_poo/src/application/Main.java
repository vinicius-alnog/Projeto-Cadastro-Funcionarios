import java.util.Locale;
import java.util.Scanner;
import util.Account;

public class Main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		int accountNumber = sc.nextInt();
		System.out.print("Digite o nome do dono da conta: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Tem depósito inicial (s/n)? ");
		char init = sc.next().charAt(0);
		Account account = new Account(accountNumber, accountHolder);

		if (init == 's') {
			System.out.print("Digita o valor do depósito inicial: ");
			account.setBalance(sc.nextDouble());
			System.out.println();
		}
			
		System.out.println("Dados da conta: ");
		System.out.println(account);
		System.out.println();

		System.out.print("Digite um valor para depositar: ");
		account.depositBalance(sc.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		System.out.println();

		System.out.print("Digite um valor para sacar: ");
		double saque = sc.nextDouble();

		while (saque > account.getBalance()) {
    		System.out.println("DINHEIRO INSUFICIENTE!");
    		System.out.print("Digite novamente o valor do saque: ");
    		saque = sc.nextDouble();
		}
		account.withdrawBalance(saque);

		System.out.println("Dados da conta atualizados:");
		System.out.println(account);

		sc.close();

		}
	}


