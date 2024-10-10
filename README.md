```markdown
# CRUD de Usuários com Spring Boot

Este projeto é um CRUD básico de usuários desenvolvido com Spring Boot e utiliza um banco de dados H2. A aplicação permite a criação, leitura, atualização e exclusão de usuários.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.0
- H2 Database (banco de dados em memória)
- Spring Data JPA (para manipulação dos dados)
- Maven (para gerenciamento de dependências)

## Endpoints

### 1. Criar Usuário

- URL: `/api/users`
- Método HTTP: `POST`
- Descrição: Cria um novo usuário no sistema.
- Exemplo de Request:
  ```json
  {
    "email": "usuario@email.com",
    "name": "Nome do Usuário"
  }
  ```
- Exemplo de Response:
  ```json
  {
    "id": 1,
    "email": "usuario@email.com",
    "name": "Nome do Usuário"
  }
  ```
- Respostas:
  - `201 Created`: Usuário criado com sucesso.
  - `400 Bad Request`: Alguma validação falhou.

### 2. Listar Todos os Usuários

- URL: `/api/users`
- Método HTTP: `GET`
- Descrição: Retorna a lista de todos os usuários cadastrados.
- Exemplo de Response:
  ```json
  [
    {
      "id": 1,
      "email": "usuario1@email.com",
      "name": "Usuário 1"
    },
    {
      "id": 2,
      "email": "usuario2@email.com",
      "name": "Usuário 2"
    }
  ]
  ```
- Respostas:
  - `200 OK`: Lista de usuários retornada com sucesso.
  - `204 No Content`: Nenhum usuário encontrado.

### 3. Buscar Usuário por ID

- URL: `/api/users/{id}`
- Método HTTP: `GET`
- Descrição: Busca os detalhes de um usuário específico com base no seu ID.
- Exemplo de Response:
  ```json
  {
    "id": 1,
    "email": "usuario@email.com",
    "name": "Nome do Usuário"
  }
  ```
- Respostas:
  - `200 OK`: Usuário encontrado e retornado com sucesso.
  - `404 Not Found`: Usuário não encontrado.

### 4. Atualizar Usuário

- URL: `/api/users/{id}`
- Método HTTP: `PUT`
- Descrição: Atualiza as informações de um usuário existente.
- Exemplo de Request:
  ```json
  {
    "email": "novoemail@email.com",
    "name": "Novo Nome"
  }
  ```
- Exemplo de Response:
  ```json
  {
    "id": 1,
    "email": "novoemail@email.com",
    "name": "Novo Nome"
  }
  ```
- Respostas:
  - `200 OK`: Usuário atualizado com sucesso.
  - `404 Not Found`: Usuário não encontrado.

### 5. Deletar Usuário

- URL: `/api/users/{id}`
- Método HTTP: `DELETE`
- Descrição: Remove um usuário do sistema com base no seu ID.
- Respostas:
  - `204 No Content`: Usuário deletado com sucesso.
  - `404 Not Found`: Usuário não encontrado.

## Banco de Dados

Esta aplicação utiliza o banco de dados H2, um banco de dados em memória que é automaticamente criado e inicializado quando a aplicação é executada. A interface web do H2 está disponível em `http://localhost:8080/h2-console` e as credenciais de acesso são:

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(em branco)*

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/crud-usuarios-spring.git
   cd crud-usuarios-spring
   ```

2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse a aplicação em `http://localhost:8080`.

## Testes

Para rodar os testes unitários, utilize o seguinte comando:
```bash
mvn test
```
