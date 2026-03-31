# 📦 Inventory System

Sistema de controle de estoque desenvolvido com **Java + Spring Boot**, com foco em prática de backend, organização em camadas e boas práticas de desenvolvimento.

## 🚀 Sobre o projeto

Este projeto simula um sistema real de gerenciamento de estoque, permitindo:

- Cadastro de produtos  
- Controle de estoque  
- Registro de movimentações (entrada e saída)  
- Consulta de produtos  
- Banco de dados persistente  

O objetivo é demonstrar habilidades em desenvolvimento backend com arquitetura organizada.

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Maven  
- Lombok  

## 🧠 Conceitos aplicados

- Arquitetura em camadas:
  - Controller  
  - Service  
  - Repository  
  - Model  

- API REST  
- CRUD completo  
- Persistência de dados  
- Banco de dados em modo arquivo (H2 persistente)  
- Boas práticas de organização de código  

---

## 📁 Estrutura do projeto

```Bash 
src/main/java/com/luana/inventory  
│  
├── controller  
├── service  
├── repository  
├── model  
└── InventoryApplication.java  
```
## 📌 Funcionalidades

📦 Produtos
- Criar produto
- Listar produtos
- Buscar por ID
- Atualizar produto
- Remover produto

## 📊 Estoque
- Controle de quantidade
- Definição de estoque mínimo
- Alertas de estoque baixo

## 🔄 Movimentações
- Entrada de estoque
- Saída de estoque
- Registro de histórico

---

## Como rodar o projeto?

1. Clone o repositório
```Bash 
git clone https://github.com/luanamcrs/inventory-system.git
```

3. Acesse o diretório
```Bash 
cd inventory-system
```
5. Execute a aplicação
```Bash 
mvn spring-boot:run
```
## 🌐 Acesso ao sistema
- API: http://localhost:8080
- Banco H2: http://localhost:8080/h2-console

## 📌 Configuração do banco:
JDBC URL: jdbc:h2:file:./data/testdb
User: sa
Password: (vazio)

## 💾 Sobre o banco de dados

Este projeto utiliza o H2 Database em modo persistente, ou seja:

- Os dados são salvos em arquivo local (./data/testdb)
- As informações não são perdidas ao reiniciar a aplicação
- Simula um ambiente mais próximo de produção

  ---

## 📈 Exemplo de requisição
Criar produto

```Bash 
POST /products
{
  "nome": "Mouse",
  "preco": 50.0,
  "quantidade": 10,
  "estoqueMinimo": 5
}
```

## 📸 Demonstração

<img width="1843" height="867" alt="Captura de tela 2026-03-30 214352" src="https://github.com/user-attachments/assets/f9bd0b37-145b-4579-980b-d3317fa98cc0" />

## 🔧 Próximas melhorias
 - Validações mais robustas
 - Tratamento de erros global
 - Testes automatizados
 - Integração com banco MySQL
 - rontend mais completo
 - Autenticação com Spring Security

## ⭐ Diferenciais do projeto
- Arquitetura bem estruturada
- Uso de Spring Boot
- Separação de responsabilidades
- Controle de estoque funcional
- Uso de banco de dados persistente

** 👩‍💻 Desenvolvido por Luana Monteiro.

 Estudante em Desenvolvimento Backend.

 📎 Contato
GitHub: https://github.com/luanamcrs
LinkedIn: linkedin.com/in/luana-monteiro-818588214 **
