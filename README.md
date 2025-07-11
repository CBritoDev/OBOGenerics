# 🛠️ OBO Generics – Sistema de Orçamento para Oficina Mecânica (EM ANDAMENTO)

Sistema de orçamentos veiculares desenvolvido com foco em boas práticas de **Java** orientado a objetos, aplicação real de **padrões de projeto**, interface gráfica em **Java Swing** e integração com **banco de dados (JDBC)**.

---

## 📌 Objetivo do Projeto

Criar uma aplicação funcional de uma oficina mecânica, permitindo:

- Cadastro de **clientes (PF e PJ)**
- Registro e gerenciamento de **veículos** (carros e motos)
- Criação e edição de **orçamentos de serviços**
- Exportação de dados em **formato TXT**
- Integração com banco de dados para **persistência real**
- Interface gráfica com padrão visual fixo e amigável

---

## 🧩 Funcionalidades

- [x] Cadastro de clientes PF e PJ  
- [x] Cadastro e consulta de veículos  
- [x] Cadastro e listagem de orçamentos  
- [x] Validação automática de CPF/CNPJ  
- [x] Tela de login da pessoa jurídica  
- [x] Exportação de orçamento em `.txt`  
- [x] Uso de padrões de projeto: **Builder**, **Singleton** e **Abstract Factory**  
- [x] Comentários e documentação profissional no código  

---

## 🧪 Tecnologias e Conceitos Aplicados

- Java 17+
- Java Swing (interface gráfica)
- JDBC (Java Database Connectivity)
- MySQL / SQLite (banco de dados)
- Padrões de projeto (GOF)
- Programação Orientada a Objetos
- Try-Catch para tratamento de exceções
- Pacotes organizados (`model`, `view`, `dao`, `util`, etc.)
- Documentação com Javadoc

---


## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```
   git clone https://github.com/seu-usuario/OBO-Generics.git
   ```

2. Abra no NetBeans ou IntelliJ

3. Configure o banco de dados:
   - Crie o banco e as tabelas (veja o script SQL na pasta `/resources`)
   - Atualize as credenciais no arquivo de conexão JDBC

4. Execute a classe principal:
   ```
   App.java
   ```

---

## 🧠 Autor e Aprendizado

Este projeto foi desenvolvido por **Carlos Brito** como parte do processo de consolidação de conhecimentos em Java Backend.  
O foco foi aplicar **conceitos fundamentais de POO, padrões de projeto e persistência de dados** em um projeto real e completo.

---

## 🤝 Contato

- [LinkedIn](https://www.linkedin.com/in/seu-perfil)
- carlos.brito@email.com

---

## 📄 Licença

Este projeto está sob a licença MIT.
