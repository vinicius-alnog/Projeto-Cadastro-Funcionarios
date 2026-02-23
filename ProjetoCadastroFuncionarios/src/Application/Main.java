package Application;

import java.util.Locale;
import java.util.Scanner;
import util.Funcionarios;

public class Main {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int N = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Funcionarios[] funcionarios = new Funcionarios[N]; 
        
        // CADASTRAR FUNCIONÁRIOS
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionário " + (i+1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.print("Departamento: ");
            sc.nextLine();
            String departamento = sc.nextLine();
            System.out.println();

            funcionarios[i] = new Funcionarios(nome, salario, departamento);
        } 
        
        System.out.println("==== RELATÓRIO ====");
        System.out.println();

        // LISTAR FUNCIONÁRIOS
        System.out.println("FUNCIONÁRIOS CADASTRADOS:");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println((i+1) + ". " + funcionarios[i]);
        }
        System.out.println();

        // CALCULAR SALÁRIO MÉDIO E ENCONTRAR MAIOR SALÁRIO
        double somaSalario = 0.0;
        Funcionarios funcMaiorSalario = funcionarios[0];
        
        for (int i = 0; i < funcionarios.length; i++) {
            somaSalario += funcionarios[i].getSalario();
            
            if (funcionarios[i].getSalario() > funcMaiorSalario.getSalario()) {
                funcMaiorSalario = funcionarios[i];
            }
        }
        
        double mediaSalario = somaSalario / N;
        
        System.out.printf("Salário médio: R$ %.2f\n", mediaSalario);
        System.out.printf("Maior salário: %s (R$ %.2f)\n", 
            funcMaiorSalario.getNome(), 
            funcMaiorSalario.getSalario()
        );
        System.out.println();
        
        // CONTAR POR DEPARTAMENTO
        System.out.println("FUNCIONÁRIOS POR DEPARTAMENTO:");
        int ti = 0, vendas = 0, rh = 0, financeiro = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            String dept = funcionarios[i].getDepartamento().toUpperCase();
            
            switch (dept) {
                case "TI":
                    ti++;
                    break;
                case "VENDAS":
                    vendas++;
                    break;
                case "RH":
                    rh++;
                    break;
                case "FINANCEIRO":
                    financeiro++;
                    break;
            }
        }

        System.out.println("TI: " + ti + " funcionário(s)");
        System.out.println("Vendas: " + vendas + " funcionário(s)");
        System.out.println("RH: " + rh + " funcionário(s)");
        System.out.println("Financeiro: " + financeiro + " funcionário(s)");

        System.out.println();
        System.out.println("========================");
        // FUNCIONALIDADE PARA APLICAR AUMENTO À FUNCIONÁRIOS
        System.out.print("Deseja aplicar aumento a algum funcionário? (S/N): ");
        char resposta = sc.next().toUpperCase().charAt(0);
        
        while (resposta == 'S') {
            System.out.println();
            System.out.println("==== APLICAR AUMENTO DE SALÁRIO ====");
            System.out.println();
            
            // Listar funcionários com índice
            System.out.println("Escolha o funcionário:");
            for (int i = 0; i < funcionarios.length; i++) {
                System.out.printf("[%d] %s - R$ %.2f\n", 
                    (i+1), 
                    funcionarios[i].getNome(),
                    funcionarios[i].getSalario());
            }
            
            System.out.println();
            System.out.print("Digite o número do funcionário: ");
            int escolha = sc.nextInt() - 1;
            
            // Validar escolha
            if (escolha < 0 || escolha >= funcionarios.length) {
                System.out.println("✗ Número inválido!");
            } else {
                Funcionarios funcEscolhido = funcionarios[escolha];
                double salarioAntigo = funcEscolhido.getSalario();
                
                System.out.print("Digite o percentual de aumento (%): ");
                double percentual = sc.nextDouble();
                
                // Aplicar aumento
                funcEscolhido.aplicarAumento(percentual);
                double salarioNovo = funcEscolhido.getSalario();
                
                // Exibir resultado
                System.out.println();
                System.out.println("✓ Aumento aplicado com sucesso!");
                System.out.println("─────────────────────────────────────────");
                System.out.printf("Funcionário: %s\n", funcEscolhido.getNome());
                System.out.printf("Salário anterior: R$ %.2f\n", salarioAntigo);
                System.out.printf("Novo salário: R$ %.2f\n", salarioNovo);
                System.out.printf("Aumento: R$ %.2f (%.1f%%)\n", 
                    salarioNovo - salarioAntigo, percentual);
                System.out.println("─────────────────────────────────────────");
            }
            
            System.out.println();
            System.out.print("Deseja aplicar aumento a outro funcionário? (S/N): ");
            resposta = sc.next().toUpperCase().charAt(0);
        }
        
        // EXIBIR RELATÓRIO ATUALIZADO (SE HOUVE AUMENTO)
        if (resposta != 'S') {
            System.out.println();
            System.out.println("==== RELATÓRIO FINAL ATUALIZADO ====");
            System.out.println();
            
            System.out.println("FUNCIONÁRIOS:");
            for (int i = 0; i < funcionarios.length; i++) {
                System.out.println((i+1) + ". " + funcionarios[i]);
            }
            
            // Recalcular salário médio
            somaSalario = 0.0;
            for (int i = 0; i < funcionarios.length; i++) {
                somaSalario += funcionarios[i].getSalario();
            }
            mediaSalario = somaSalario / N;
            
            System.out.println();
            System.out.println("Novo salário médio: R$ " + String.format("%.2f", mediaSalario));
        }
        
        System.out.println();
        System.out.println("Sistema encerrado. Obrigado!");

        sc.close();       
    }
}