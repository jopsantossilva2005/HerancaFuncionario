# Projeto de Herança em Java: Funcionário e Pessoa

Este projeto foi desenvolvido como parte do meu portfólio para demonstrar o uso de **herança** e **associação** em **Programação Orientada a Objetos (POO)** com Java.

## Descrição

O projeto consiste em um sistema simples que modela a relação entre as classes `Pessoa`, `Funcionario` e `Endereco`. A classe `Funcionario` herda os atributos da classe `Pessoa` e adiciona um atributo específico (`salario`). Além disso, a classe `Pessoa` possui uma associação com a classe `Endereco`.

## Estrutura do Projeto

### Classes

1. **Endereco**:
   - Atributos:
     - `String rua`
     - `int numero`

2. **Pessoa**:
   - Atributos:
     - `String nome`
     - `int idade`
     - `Endereco endereco` (associação com a classe `Endereco`).

3. **Funcionario** (herda de `Pessoa`):
   - Atributos:
     - `double salario` (atributo específico da classe `Funcionario`).

### Relacionamentos

- `Funcionario` **herda** de `Pessoa`.
- `Pessoa` **associa** `Endereco`.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jopsantossilva2005/HerancaFuncionario.git
   
2. Execute o Projeto dentro do arquivo FuncionarioTeste01
