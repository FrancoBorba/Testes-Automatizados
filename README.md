# Domine Testes Unitários e de Integração para APPs Java e Spring Boot 3

Este repositório contém os projetos e exercícios desenvolvidos durante o curso **"Domine Testes Unitários e de Integração para APPs Java e Spring Boot 3 com JUnit 5, Mockito, TestContainers, TDD e +++++"**, ministrado pelo Professor Leandro Erudio na plataforma Udemy.

O objetivo principal deste repositório é aplicar e documentar o aprendizado obtido no curso, servindo como um portfólio prático das minhas habilidades em testes de software no ecossistema Java e Spring.

## 🎯 Sobre o Curso

O curso foca em capacitar o desenvolvedor a escrever testes robustos e de alta qualidade para aplicações Java, utilizando as ferramentas e frameworks mais modernos do mercado. A abordagem é majoritariamente prática (90%), garantindo a aplicação dos conceitos em um projeto real com Spring Boot 3.

## ✨ Tecnologias e Conceitos Abordados

A seguir, uma lista das principais ferramentas e metodologias que serão exploradas e aplicadas neste repositório:

### 🧪 Testes Unitários com JUnit 5
O JUnit 5 é o framework padrão para a escrita de testes em Java. Ao longo dos projetos, serão aplicados conceitos como:
- **Assertions:** Validação de resultados esperados com `assertEquals`, `assertTrue`, `assertNotNull`, entre outros.
- **Anotações:** Uso de `@Test`, `@DisplayName`, `@BeforeEach`, `@AfterEach`, `@Nested` para estruturar os testes.
- **Testes parametrizados:** Execução de um mesmo teste com diferentes conjuntos de dados.
- **Tratamento de Exceções:** Como testar se o código lança as exceções esperadas.
- **Ordenação de Testes:** Controle da ordem de execução dos métodos de teste.

### 🎭 Mocks e Stubs com Mockito
O Mockito é essencial para isolar as unidades de código que estão sendo testadas. Serão explorados:
- **Criação de Mocks:** Utilização de `mock()` e a anotação `@Mock`.
- **Definição de Comportamentos:** Configuração de respostas para métodos de objetos mockados com `when(...).thenReturn(...)`.
- **Verificação de Interações:** Garantia de que determinados métodos foram chamados com `verify()`.
- **Argument Captors:** Captura de argumentos passados para métodos mockados para validações complexas.
- **Spies:** Teste de classes reais com a possibilidade de mockar apenas alguns de seus métodos.

### 🐳 Testes de Integração com TestContainers
Para testes de integração que dependem de serviços externos (como bancos de dados, message brokers, etc.), o TestContainers é uma ferramenta poderosa. Veremos como:
- **Gerenciar o ciclo de vida de contêineres Docker** diretamente a partir dos testes JUnit.
- **Testar a camada de persistência** com um banco de dados real (PostgreSQL, MySQL, etc.) em um contêiner.
- **Garantir que a aplicação se integra corretamente** com suas dependências de infraestrutura.

### 🔁 Desenvolvimento Guiado por Testes (TDD - Test-Driven Development)
Uma das principais metodologias abordadas. O ciclo TDD "Red-Green-Refactor" será aplicado no desenvolvimento de novas funcionalidades:
1.  **Red:** Escrever um teste que falha para uma funcionalidade ainda não implementada.
2.  **Green:** Escrever o código mínimo necessário para fazer o teste passar.
3.  **Refactor:** Refatorar o código para melhorar a qualidade sem alterar seu comportamento.

### 🚀 Spring Boot 3 & Testes
O curso aborda como testar eficientemente cada camada de uma aplicação Spring Boot:
- **Testes da Camada de `Controller`:** Utilizando `@WebMvcTest` e `MockMvc` para testar os endpoints da API REST.
- **Testes da Camada de `Service`:** Testes unitários para a lógica de negócio, utilizando mocks para as dependências.
- **Testes da Camada de `Repository`:** Utilizando `@DataJpaTest` para testar a integração com o banco de dados (geralmente em memória como o H2 ou com TestContainers).

### ➕ Outras Ferramentas e Conceitos
- **REST Assured:** Para testes de integração de APIs REST de forma fluente e declarativa.
- **Maven:** Gerenciamento de dependências e do ciclo de vida do projeto.
- **Cobertura de Testes (Code Coverage):** Análise da porcentagem do código que está sendo coberta pelos testes, utilizando ferramentas como o JaCoCo.

