# 🌐 Spring Boot JPA Webservice

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.0-brightgreen?logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)  
[![Maven](https://img.shields.io/badge/Maven-3.9.3-red?logo=apache-maven&logoColor=white)](https://maven.apache.org/)  
[![H2 Database](https://img.shields.io/badge/H2-Database-blueviolet?logo=h2database&logoColor=white)](https://www.h2database.com/)  

Um **webservice de estudo** em **Spring Boot**, simulando um sistema de e-commerce com **usuários, produtos, categorias, pedidos e pagamentos**.

---

## 🛠 Tecnologias

- Java 17  
- Spring Boot 3  
- Spring Data JPA / Hibernate  
- H2 Database (em memória)  
- Maven  
- REST API (JSON/Jackson)  

---

## 📦 Estrutura do Projeto

### Entidades (`entities`)
- **User**: Usuários do sistema  
- **Product**: Produtos com descrição, preço e categorias  
- **Category**: Categorias de produtos  
- **Order**: Pedidos com itens e status  
- **OrderItem**: Associa produtos a pedidos com quantidade e preço  
- **Payment**: Pagamento vinculado ao pedido  
- **OrderStatus**: Enum (`WAITING_PAYMENT`, `PAID`, `SHIPPED`, `DELIVERED`, `CANCELED`)  

### Repositórios (`repositories`)
- CRUD JPA: **User**, **Product**, **Category**, **Order**, **OrderItem**

### Serviços (`services`)
- Lógica de negócio e tratamento de exceções  
- **UserService, ProductService, CategoryService, OrderService**

### Controladores REST (`controllers`)
- Endpoints para **Users, Products, Categories e Orders**  
- Tratamento global de erros com **ResourceExceptionHandler**

### Configuração (`config`)
- **TestConfig**: Popula o banco H2 com dados iniciais para testes (`@Profile("test")`)

---

## 💾 Banco de Dados

- **H2 em memória** para testes  
- Console disponível em: `/h2-console`  

---

## 🚀 Endpoints da API

| Entidade   | Endpoint             | Método | Descrição                     |
|------------|--------------------|--------|-------------------------------|
| Users      | `/users`            | GET    | Lista todos os usuários       |
| Users      | `/users/{id}`       | GET    | Busca usuário por ID          |
| Users      | `/users`            | POST   | Cria novo usuário             |
| Users      | `/users/{id}`       | PUT    | Atualiza usuário              |
| Users      | `/users/{id}`       | DELETE | Remove usuário                |
| Products   | `/products`         | GET    | Lista produtos                |
| Products   | `/products/{id}`    | GET    | Busca produto por ID          |
| Categories | `/categories`       | GET    | Lista categorias              |
| Categories | `/categories/{id}`  | GET    | Busca categoria por ID        |
| Orders     | `/orders`           | GET    | Lista pedidos                 |
| Orders     | `/orders/{id}`      | GET    | Busca pedido por ID           |

---

## ⚡ Funcionalidades

- CRUD completo para **usuários, produtos e categorias**  
- Criação de pedidos com múltiplos itens  
- Associação de produtos a categorias  
- Pagamentos vinculados a pedidos  
- Tratamento global de exceções  
- Banco de dados em memória para testes rápidos  

---

## 🏃 Como Rodar

1. Clone o repositório  
2. Configure o perfil `test` em `application.yaml`  
3. Execute a aplicação (`SpringBootJpaWebserviceApplication`)  
4. Acesse `/h2-console` para visualizar dados  
5. Teste endpoints via **Postman**, **Insomnia** ou navegador  
