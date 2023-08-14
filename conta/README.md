# Generation Projeto Guia - Banco do Brazil com Z

Este é um projeto de um sistema de gerenciamento de contas bancárias desenvolvido em Java.

## Funcionalidades

1. **Criar Conta**: Permite criar uma nova conta informando o número da agência, tipo de conta (1 para Conta Corrente, 2 para Conta Poupança), nome do titular, saldo inicial e outros parâmetros específicos para cada tipo de conta.

2. **Listar todas as Contas**: Exibe uma lista de todas as contas cadastradas no sistema, mostrando informações como número, agência, tipo, titular e saldo.

3. **Buscar Conta por Número**: Permite buscar uma conta específica através do número da conta, exibindo suas informações.

4. **Atualizar Dados da Conta**: Atualiza os dados de uma conta existente, incluindo agência, titular, saldo e outros parâmetros específicos de cada tipo de conta.

5. **Apagar Conta**: Remove uma conta do sistema com base no número da conta.

6. **Sacar**: Realiza uma operação de saque em uma conta específica, subtraindo o valor informado do saldo.

7. **Depositar**: Realiza um depósito em uma conta específica, adicionando o valor informado ao saldo.

8. **Transferir Valores entre Contas**: Permite transferir um valor de uma conta de origem para uma conta de destino.

9. **Sair**: Encerra a execução do programa.

## Como Usar

1. Clone o repositório ou baixe os arquivos deste projeto.

2. Compile os arquivos Java usando um compilador Java (como o `javac`).

3. Execute a classe `Menu` para iniciar o programa.

4. Siga as instruções no menu para interagir com o sistema e realizar as operações bancárias.

## Estrutura do Projeto

O projeto está organizado em pacotes que representam diferentes componentes do sistema:

- **`Conta.Model`**: Contém as classes relacionadas às contas bancárias, incluindo a classe abstrata `Conta`, e as subclasses `ContaCorrente` e `ContaPoupanca`.

- **`Conta.Controller`**: Inclui a classe `ContaController`, que gerencia as operações de criação, atualização, exclusão, listagem e outras operações bancárias.

- **`Conta.Repository`**: Define a interface `ContaRepository`, que especifica os métodos para as operações de CRUD e operações bancárias.

- **`Conta.util`**: Contém a classe `Cores`, que define códigos de cores para melhorar a aparência do menu no console.

## Observações

Certifique-se de ter um ambiente Java configurado em seu sistema para compilar e executar o projeto.

Este projeto é uma simulação de um sistema de gerenciamento de contas bancárias e não é destinado a fins de produção real. Pode ser usado para fins educacionais e de aprendizado.