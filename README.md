# Sistema de Cadastro de Funcionários

Sistema em Java para cadastro e gerenciamento de funcionários com aplicação de aumentos salariais.

## Funcionalidades

- Cadastro de múltiplos funcionários
- Armazenamento de: Nome, Salário e Departamento
- Relatório completo com estatísticas
- Cálculo automático de salário médio
- Identificação do funcionário com maior salário
- Contagem de funcionários por departamento (TI, Vendas, RH, Financeiro)
- Aplicação de aumentos salariais com cálculo de diferença

## Como Executar

### Pré-requisitos
- Java 17 ou superior instalado
- Terminal/CMD ou IDE Java (Eclipse, IntelliJ, VS Code)

## Exemplo de Uso

Quantos funcionários deseja cadastrar? 2

Funcionário 1:
Nome: Vinicius Nogueira
Salário: 3000
Departamento: TI

Funcionário 2:
Nome: Rafaela Ramalho
Salário: 4500
Departamento: VENDAS

==== RELATÓRIO ====

FUNCIONÁRIOS CADASTRADOS:
1. Vinicius Nogueira - R$ 3000.00 - TI
2. Rafaela Ramalho - R$ 4500.00 - VENDAS

Salário médio: R$ 3750.00
Maior salário: Rafaela Ramalho (R$ 4500.00)

FUNCIONÁRIOS POR DEPARTAMENTO:
TI: 1 funcionário(s)
Vendas: 1 funcionário(s)
RH: 0 funcionário(s)
Financeiro: 0 funcionário(s)

Deseja aplicar aumento a algum funcionário? (S/N): S

==== APLICAR AUMENTO DE SALÁRIO ====

Escolha o funcionário:
[1] Vinicius Nogueira - R$ 3000.00
[2] Rafaela Ramalho - R$ 4500.00

Digite o número do funcionário: 1
Digite o percentual de aumento (%): 10

✓ Aumento aplicado com sucesso!
─────────────────────────────────────────
Funcionário: João Silva
Salário anterior: R$ 3000.00
Novo salário: R$ 3300.00
Aumento: R$ 300.00 (10.0%)
─────────────────────────────────────────

## Estrutura do Projeto

src/
├── Application/
│   └── Main.java          # Classe principal com lógica do sistema
└── util/
    └── Funcionarios.java  # Classe modelo (entidade)

## Objetivos do Projeto

Projeto desenvolvido como parte dos estudos de:
- Lógica de Programação
- Java Básico 
- Programação Orientada a Objetos
- Estruturas de Dados

## Conceitos Aplicados

- **Encapsulamento**: Atributos privados com getters e setters
- **Abstração**: Modelagem da entidade Funcionário
- **Arrays**: Armazenamento de múltiplos objetos
- **Métodos**: Organização do código em funções reutilizáveis
- **Loops**: Iteração sobre coleções de dados
- **Validação**: Verificação de entradas do usuário

## Departamentos Disponíveis

- **TI** - Tecnologia da Informação
- **VENDAS** - Vendas
- **RH** - Recursos Humanos
- **FINANCEIRO** - Financeiro

## Autor

Desenvolvido por **Vinicius Antonio Lisboa Nogueira**

- GitHub: [@vinicius-alnog](https://github.com/vinicius-alnog)
- LinkedIn: [Vinicius Nogueira](https://www.linkedin.com/in/viniciusalnogueira/)
