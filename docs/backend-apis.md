# APIs e Web Services

Planejamento de aplicação de API's Web para aluguel de quadras esportivas: a aplicação será composta por uma API Gateway, microserviços para gestão de usuários, quadras e agendamento, e uma camada de dados com bancos de dados PostgreSQL isolados para cada microserviço.

## Objetivos da API

O objetivo é desenvolver uma API distribuída para realizar o cadastro de usuários e proprietários para gestão dos agendamentos em quadras esportivas. Espera-se que a API seja usada por clientes externos (pessoas que queiram fazer agendamentos) e por clientes internos (proprietários). A API deve fornecer agendamentos, quadras e usuários como recurso.

## Arquitetura

A arquitetura da API é composta por uma série de componentes que trabalham juntos para fornecer uma plataforma segura e escalável para o aluguel de quadras esportivas.

![image](https://github.com/user-attachments/assets/6faa05a1-e2bb-4967-9a74-93a62a3fc8e1)

As aplicações web e mobile acessam as apis por meio de um api gateway que redirecionam as chamadas para os respectivos microserviços. Cada microserviço tem seu próprio banco de dados.

## Modelagem da Aplicação

### Estrutura da entidade usuário

    "Usuario": {
        "id": "String",
        "nome": "String",
        "telefone": "String",
        "email": "String",
        "senha": "String",
        "dataCriacao": "DateTime"
        "dataUltimaAtualizacao": "DateTime"
        "dataDelecao": "DateTime"
    }

### Estrutura da entidade agendamento

    "Agendamento": {
        "status": "String",
        "quadra": "String",
        "usuario": "String",
        "inicioAgendamento": "String",
        "fimAgendamento": "String"
    }

### Estrutura da entidade quadra

    "Quadra": {
        "id": "Int",
        "nome": "String",
        "tipo": "String",
        "localizacao": "String",
        "descricao": "String",
        "status": "String"
    }

## Fluxo de Dados

A imagem descreve uma arquitetura de aplicação composta por uma interface mobile (React Native) e uma web (usando HTML5, JavaScript e CSS3), que se comunicam com um backend via API Gateway da AWS. O backend é dividido em microserviços, todos executados em contêineres no Amazon ECS, com persistência de dados em Amazon RDS (PostgreSQL).

Há três microserviços principais: Gestão de Quadras, Agendamento de Quadras e Gestão de Usuários, todos implementados em Java. O API Gateway recebe as requisições das interfaces e as direciona para o serviço correspondente, que processa os dados e acessa o banco de dados para responder ao usuário.

## Requisitos Funcionais

Requisitos Funcionais da Aplicação


| ID     | Descrição do Requisito                         | Prioridade | Responsável     |
| ------ | ---------------------------------------------- | ---------- | --------------- |
| RF-001 | O sistema deve prover a gestão de usuários     | ALTA       | Bianca e Diego  |
| RF-002 | O sistema deve prover o agendamento de quadras | ALTA       | Enzo e Henrique |
| RF-003 | O sistema deve prover a gestão de quadras      | ALTA       | Lucas           |


## Requisitos Não Funcionais

Aqui estão os principais requisitos não funcionais da aplicação:

| ID      | Descrição do Requisito                                            | Prioridade |
| ------- | ----------------------------------------------------------------- | ---------- |
| RNF-001 | O sistema deve ser responsivo para rodar em um dispositivos móvel | ALTA       |
| RNF-002 | O sistema deve ter latência máxima de 5 segundos                  | MÉDIA      |



## Tecnologias Utilizadas

A aplicação será desenvolvida utilizando as seguintes tecnologias:
- Front-end: React, React Native, JavaScript, HTML, CSS
- Back-end: Java, Spring boot
- Banco de Dados: PostgreSQL

## API Endpoints

Repositório dos microserviços: https://github.com/ICEI-PUC-Minas-PMV-SI/pe6-t1-g02-aluguel-de-quadras-de-esporte-codigo

### Gerenciamento de usuários
#### Cadastro de usuários
- Método: POST
- URL: /api/v1/usuarios
- Parâmetros:
```
{
  "nome": "String",
  "telefone": "String",
  "email": "String",
  "senha": "String",
  "cpf": "String",
  "cnpj": "String"
}
```
#### Resposta:
- Sucesso (201 OK)
```
{
  "id": "String",
  "cpf": "String",
  "cnpj": "String",
  "nome": "String",
  "telefone": "String",
  "email": "String",
  "dataCriacao": "DateTime",
  "dataUltimaAtualizacao": "DateTime",
  "dataDelecao": "DateTime"
}
```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```
#### Edição de usuários
- Método: PUT
- URL: /api/v1/usuarios/{id}
- Parâmetros:
```
{
  "senha": "String",
  "telefone": "String",
  "nome": "String"
}
```
#### Resposta:
- Sucesso (204)
```

```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Usuário não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

#### Listar usuários
- Método: GET
- URL: /api/v1/usuarios
- Parâmetros:
```

```
#### Resposta:
- Sucesso (200 OK)
```
{
  "usuario": [
    {
      "id": "String",
      "cpf": "String",
      "cnpj": "String",
      "nome": "String",
      "telefone": "String",
      "email": "String",
      "dataCriacao": "DateTime",
      "dataUltimaAtualizacao": "DateTime",
      "dataDelecao": "DateTime"
    }
  ]
}
 ```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

#### Deletar usuários
- Método: DELETE
- URL: /api/v1/usuarios/{id}
- Parâmetros:
```

```
#### Resposta:
- Sucesso (204 OK)
```

```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Usuário não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

### Login
- Método: POST
- URL: /api/v1/login
- Parâmetros:
```
{
  "email": "string",
  "senha": "string"
}
```
#### Resposta:
- Sucesso (200 OK)
```
{
   "token": "String",
   "expiresIn": "Int",
}
 ```

- Credenciais inválidas (401)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

### Gerenciamento de agendamento
#### Cadastro de agendamento
- Método: POST
- URL: /api/v1/agendamentos
- Parâmetros:
```
{
  "quadraId": "String",
  "usuarioId": "String",
  "inicioAgendamento": "DateTime",
  "fimAgendamento": "DateTime"
}
```
#### Resposta:
- Sucesso (201 OK)
```
 {
   "id": "String",
   "status": "String",
   "quadraId": "String",
   "usuarioid": "String",
   "inicioAgendamento": "DateTime",
   "fimAgendamento": "DateTime"
}
 ```

- Requisição inválida (400)
```
{
  "message": "String"
}
```

- Usuário não autorizado (401)
```
{
  "message": "String"
}
```

- Recurso não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

#### Edição de agendamento
- Método: PUT
- URL: /api/v1/agendamentos/{id}
- Parâmetros:
```
{
  "inicioAgendamento": "DateTime",
  "fimAgendamento": "DateTime"
}
```
#### Resposta:
- Sucesso (204)
```

 ```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Usuário não autorizado (401)
```
{
  "message": "String"
}
```
- Agendamento não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```
#### Deleção de agendamento
- Método: DELETE
- URL: /api/v1/agendamentos/{id}
- Parâmetros:
```

```
- Sucesso (204)
```

 ```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Usuário não autorizado (401)
```
{
  "message": "String"
}
```
- Agendamento não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

#### Lista de agendamentos por usuário
- Método: GET
- URL: /api/v1/agendamentos/usuario/{id}
- Parâmetros:
```

```
- Sucesso (200)
```
{
  "agendamentos": [
    {
      "idAgendamento": "String",
      "idQuadra": "String",
      "idUsuario": "String",
      "dataInicio": "DateTime",
      "dataFim": "DateTime",
      "status": "String"
    }
  ]
}
 ```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Usuário não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

#### Lista de agendamentos por quadra
- Método: GET
- URL: /api/v1/agendamentos/quadra/{id}
- Parâmetros:
```

```
- Sucesso (200)
```
{
  "agendamentos": [
    {
      "idAgendamento": "String",
      "idQuadra": "String",
      "idUsuario": "String",
      "dataInicio": "DateTime",
      "dataFim": "DateTime",
      "status": "String"
    }
  ]
}
 ```
- Requisição inválida (400)
```
{
  "message": "String"
}
```
- Usuário não encontrado (404)
```
{
  "message": "String"
}
```
- Erro interno (500)
```
{
  "message": "String"
}
```

### Gerenciamento de quadras
#### Cadastro de quadra
- Método: POST
- URL: /quadras
- Parâmetros:
```
{
    "nome": "String",
    "tipo": "String",
    "localizacao": "String",
    "descricao": "String",
    "status": "String"
}
```

- Resposta:
  - Sucesso (200 OK)
    ```
    {
      "message": "Success",
      "data": {
        Quadra cadastrada com sucesso!
      }
    }
    ```
  - Erro (400, 401, 500)
    ```
    {
      "message": "Falha",
      "error": {
        Falha ao cadastrar quadra.
      }
    }


#### Consulta de quadra
- Método: GET
- URL: /quadras/{{nome}}
- Parâmetros: N/A
- Resposta:
  - Sucesso (200 OK)
    ```
    {
      "message": "Success",
      "data": {
        "id": Int,
        "nome": String,
        "tipo": String,
        "localizacao": String,
        "descricao": String,
        "status": String
      }
    }
    ```
  - Erro (404)
    ```
    {
      "message": "Falha",
      "error": {
        Quadra não encontrada!
      }
    }
    ```
  - Erro (400, 401, 500)
    ```
    {
      "message": "Falha",
      "error": {
        Falha ao consultar quadra.
      }
    }


#### Edição de quadra
- Método: PUT
- URL: /quadras/{{nome}}
- Parâmetros:
  ```
  {
    "nome": "String",
    "tipo": "String",
    "localizacao": "String",
    "descricao": "String",
    "status": "String"
  }

- Resposta:
  - Sucesso (200 OK)
    ```
    {
      "message": "Success",
      "data": {
        Quadra atualizada com sucesso!
      }
    }
    ```
  - Erro (404)
    ```
    {
      "message": "Falha",
      "error": {
        Quadra não encontrada para ser atualizada!
      }
    }
    ```
  - Erro (400, 401, 500)
    ```
    {
      "message": "Falha",
      "error": {
        Falha ao atualizar quadra.
      }
    }


#### Exclusão de quadra
- Método: DELETE
- URL: /quadras/{{nome}}
- Parâmetros: N/A
- Resposta:
  - Sucesso (200 OK)
    ```
    {
      "message": "Success",
      "data": {
        Quadra excluida com sucesso!
      }
    }
    ```
  - Erro (404)
    ```
    {
      "message": "Falha",
      "error": {
        Quadra não encontrada para ser excluida!
      }
    }
    ```
  - Erro (400, 401, 500)
    ```
    {
      "message": "Falha",
      "error": {
        Falha ao excluir quadra.
      }
    }
    
## Considerações de Segurança

Para garantir a segurança de uma aplicação distribuída, é essencial implementar autenticação segura, como o uso de tokens JWT e autorização baseada em funções (RBAC). Todo o tráfego deve ser protegido por TLS/SSL, e os dados armazenados criptografados em repouso. Proteções como WAF devem ser configuradas para evitar ataques como SQL Injection e XSS, além de implementar Rate Limiting no API Gateway para prevenir sobrecargas e DDoS. A validação e sanitização de dados nas APIs são cruciais, assim como o princípio do menor privilégio para permissões dos serviços. Monitoramento contínuo via CloudWatch e centralização de logs garantem auditoria e detecção de incidentes, seguindo normas como a LGPD para proteção de dados pessoais.

## Implantação

[Instruções para implantar a aplicação distribuída em um ambiente de produção.]

1. Defina os requisitos de hardware e software necessários para implantar a aplicação em um ambiente de produção.
2. Escolha uma plataforma de hospedagem adequada, como um provedor de nuvem ou um servidor dedicado.
3. Configure o ambiente de implantação, incluindo a instalação de dependências e configuração de variáveis de ambiente.
4. Faça o deploy da aplicação no ambiente escolhido, seguindo as instruções específicas da plataforma de hospedagem.
5. Realize testes para garantir que a aplicação esteja funcionando corretamente no ambiente de produção.

## Testes

[Descreva a estratégia de teste, incluindo os tipos de teste a serem realizados (unitários, integração, carga, etc.) e as ferramentas a serem utilizadas.]

1. Crie casos de teste para cobrir todos os requisitos funcionais e não funcionais da aplicação.
2. Implemente testes unitários para testar unidades individuais de código, como funções e classes.
3. Realize testes de integração para verificar a interação correta entre os componentes da aplicação.
4. Execute testes de carga para avaliar o desempenho da aplicação sob carga significativa.
5. Utilize ferramentas de teste adequadas, como frameworks de teste e ferramentas de automação de teste, para agilizar o processo de teste.

# Referências

Luizalabs. (2017). Descomplicando a Clean Architecture. Medium. Disponível em: https://medium.com/luizalabs/descomplicando-a-clean-architecture-cf4dfc4a1ac6

Docker. (2024). Install Docker Desktop on Windows. Docker Documentation. Disponível em: https://docs.docker.com/desktop/install/windows-install/

Romualdo, V. (2021). Clean Architecture with Spring Boot: A Good Idea. Medium. Disponível em: https://medium.com/@viniciusromualdobusiness/clean-architecture-with-spring-boot-a-good-idea-d6f97e450130

Obregon, A. (2021). IntelliJ IDEA and Spring Boot Integration: A Complete Guide. Medium. Disponível em: https://medium.com/@AlexanderObregon/intellij-idea-and-spring-boot-integration-a-complete-guide-aa90ab6e1a83
