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

[Diagrama ou descrição do fluxo de dados na aplicação.]

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

#### 1. Autenticação
Métodos de Autenticação: Utilize autenticação forte, como OAuth, OpenID Connect ou autenticação multifator (MFA). 
Isso ajuda a garantir que apenas usuários legítimos acessem o sistema.
Gerenciamento de Senhas: Implemente políticas de senha robustas e armazene senhas usando algoritmos de hashing seguros (ex: bcrypt, Argon2).
#### 2. Autorização
Controle de Acesso: Utilize modelos de controle de acesso baseados em papéis (RBAC) ou em atributos (ABAC) para definir quem pode acessar quais recursos.
Princípio do Menor Privilégio: Garanta que os usuários e serviços tenham apenas as permissões necessárias para realizar suas funções.
#### 3. Proteção de Dados
Criptografia: Utilize criptografia para proteger dados em trânsito (TLS/SSL) e em repouso (criptografia de banco de dados). 
Isso ajuda a proteger dados sensíveis contra interceptação e acesso não autorizado.
#### 4. Segurança de APIs
Autenticação e Autorização de APIs: Proteja APIs com autenticação adequada e verifique os direitos de acesso em cada chamada.
Rate Limiting: Implemente limitação de taxa para proteger suas APIs contra abusos e ataques automatizados.
#### 5. Conformidade
Regulamentações e Normas: Certifique-se de que sua aplicação esteja em conformidade com regulamentações relevantes, como GDPR, HIPAA, ou PCI DSS, dependendo do tipo de dados que está manipulando.
#### 6. Atualizações e Manutenção
Patch Management: Mantenha todos os componentes da aplicação e dependências atualizados para proteger contra vulnerabilidades conhecidas.
Considerar essas práticas desde o início do desenvolvimento da aplicação distribuída pode reduzir significativamente os riscos de segurança e garantir uma experiência mais segura para os usuários.

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

Inclua todas as referências (livros, artigos, sites, etc) utilizados no desenvolvimento do trabalho.
