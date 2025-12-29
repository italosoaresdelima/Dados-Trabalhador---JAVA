# Projeto: Worker Contracts (Java)

## Descrição

Este é um projeto em Java orientado a objetos que simula o gerenciamento de renda de um trabalhador com base em um salário base mensal e contratos por hora. O sistema permite cadastrar um trabalhador, associá-lo a um departamento, registrar múltiplos contratos de trabalho e calcular a renda total em um determinado mês e ano.

O projeto foi desenvolvido com foco em boas práticas de POO, como encapsulamento, composição, uso de enums e coleções.

---

## Funcionalidades

* Cadastro de departamento
* Cadastro de trabalhador com:

  * Nome
  * Nível profissional (JUNIOR, PLENO ou SENIOR)
  * Salário base
* Registro de múltiplos contratos por hora
* Cálculo da renda total do trabalhador por mês/ano

---

## Estrutura do Projeto

```
application
 └── Program.java
entities
 ├── Worker.java
 ├── Department.java
 └── HourContract.java
entities.enums
 └── WorkerLevel.java
```

---

## Conceitos Utilizados

* Programação Orientada a Objetos (POO)
* Composição entre classes (Worker → Department / HourContract)
* Enumerações (Enum)
* Listas (`ArrayList`)
* Manipulação de datas (`Date`, `Calendar`, `SimpleDateFormat`)
* Entrada de dados via `Scanner`

---

## Como Executar

1. Clone ou baixe este repositório
2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, VS Code)
3. Execute a classe `Program`
4. Insira os dados solicitados no console

---

## Exemplo de Entrada

```
Nome do departamento:
TI

---Dados do trabalhador---
Nome:
João
Nível:
PLENO
Salário base:
3000

Quantos contratos esse trabalhador terá?
2

---#1 Dados do contrato---
Data (DD/MM/YYYY):
15/06/2024
Valor por hora:
50
Duração (horas):
20

---#2 Dados do contrato---
Data (DD/MM/YYYY):
20/06/2024
Valor por hora:
60
Duração (horas):
10

Entre com o mês e ano (MM/YYYY):
06/2024
```

---

## Saída Esperada

```
Nome: João
Departamento: TI
Renda em 06/2024: 4600.00
```

---

## Objetivo do Projeto

Este projeto foi criado com fins educacionais e para portfólio pessoal, demonstrando domínio de fundamentos da linguagem Java, lógica de programação e modelagem orientada a objetos.

---

## Possíveis Melhorias Futuras

* Validação de entradas do usuário
* Uso da API `java.time` (LocalDate)
* Interface gráfica ou API REST
* Persistência de dados (arquivo ou banco de dados)

---

## Autor

Ítalo Soares

Projeto pessoal desenvolvido para fins de estudo e portfólio.
