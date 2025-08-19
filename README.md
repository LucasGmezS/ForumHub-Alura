# FórumHub - (Projeto em desenvolvimento / incompleto)

API de Discussão em Spring Boot 🚀

API completa para um fórum de discussões, desenvolvida com **Spring Boot 3**, **Spring Security** e **MySQL**. Permite CRUD de tópicos, autenticação de usuários e muito mais!

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

---

## ⚙️ Funcionalidades

✅ **CRUD Completo de Tópicos**  
✅ **Autenticação com JWT**  
✅ **Banco de Dados MySQL (ou H2 para desenvolvimento)**  
✅ **Validações de Dados**  
✅ **Documentação com Swagger**  

---

## 📦 Estrutura do Projeto

forumhub/
├── src/
│ ├── main/
│ │ ├── java/com/forumhub/
│ │ │ ├── config/ # Configurações (Security, etc.)
│ │ │ ├── controller/ # Endpoints da API
│ │ │ ├── dto/ # Objetos de transferência de dados
│ │ │ ├── model/ # Entidades (Topic, User)
│ │ │ ├── repository/ # Interfaces JPA
│ │ │ ├── service/ # Lógica de negócio
│ │ │ └── ForumHubApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ └── test/ # Testes
├── pom.xml # Dependências Maven
└── README.md # Este arquivo

---

## 🚀 Como Executar

### Pré-requisitos
- JDK 17+
- MySQL ou Docker (opcional para H2)

Acesse a API

Base URL: http://localhost:8080
Swagger UI: http://localhost:8080/swagger-ui.html
H2 Console (se habilitado): http://localhost:8080/h2-console

Como Contribuir
Faça um fork do projeto
Crie uma branch (git checkout -b feature/nova-feature)
Comite suas alterações (git commit -m 'Adiciona nova feature')
Push para a branch (git push origin feature/nova-feature)
Abra um Pull Request


Contato
Lucas G. Silva - @LucasGmez - lucasgomez1818@gmail.com
