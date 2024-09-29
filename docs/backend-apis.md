# APIs e Web Services

O planejamento de uma aplicação de APIS Web é uma etapa fundamental para o sucesso do projeto. Ao planejar adequadamente, você pode evitar muitos problemas e garantir que a sua API seja segura, escalável e eficiente.

 O setor de aluguel de quadras esportivas tem experimentado um crescimento notável, refletindo uma maior conscientização sobre a importância de um estilo de vida ativo. Entre 2006 e 2019, a taxa de praticantes de esportes no Brasil era de 45%, aumentando para 82% em 2023. Isso resultou na popularidade de esportes coletivos, como futevôlei, tênis de praia e vôlei de praia, atraindo mais praticantes. Com a digitalização ganhando destaque na gestão esportiva, as ferramentas digitais facilitam a comunicação e o agendamento, mas clubes e centros esportivos ainda enfrentam desafios na gestão eficiente de suas quadras. O projeto visa modernizar o setor para melhorar a eficiência operacional e atender às necessidades de atletas amadores e proprietários de quadras. 
 
Planejamento de Aplicação de APIS Web para Aluguel de Quadras Esportivas

A aplicação será composta por uma API Gateway, microserviços para gestão de usuários, quadras e agendamento, e uma camada de dados com bancos de dados PostgreSQL isolados para cada microserviço.

Etapas do Planejamento

1. API Gateway (AWS)
   
Função: Roteamento de requisições, autenticação/autorização (JWT), monitoramento e controle de tráfego

Segurança: Utilização de JWT para autenticação e autorização

2. Microserviços

Microserviço de Gestão de Usuários (Java): Gerenciamento de contas de usuários.

Microserviço de Gestão de Quadras (Java): Gerenciamento das informações e características das quadras.

Microserviço de Agendamento de Quadras (Java): Gerenciamento de reservas e disponibilidade das quadras.

3. Comunicação
   
APIs REST para comunicação entre os microserviços e a API Gateway.

4. Camada de Dados
   
Banco de Dados (PostgreSQL): Cada microserviço possui um banco de dados PostgreSQL isolado.

5. Ambiente de Hospedagem
   
Cloud Provider (AWS): Utilização da AWS para hospedar todos os componentes, garantindo alta disponibilidade e escalabilidade.

6. Segurança
    
Autenticação e Autorização: Implementação de autenticação e autorização via JWT.

Validação do JWT pela API Gateway para assegurar o acesso seguro aos microserviços.

Arquitetura Modular e Escalável.

A arquitetura proposta é modular e escalável, garantindo robustez, segurança e capacidade de adaptação ao crescimento da aplicação. 

A separação entre as camadas facilita a manutenção e futuras expansões.


## Objetivos da API

O objetivo é desenvolver uma aplicação distribuída para realizar agendamentos de quadras esportivas. Dentro deste objetivo geral há os seguintes objetivos específicos:

Desenvolver uma aplicação web administrativa para proprietários.

Desenvolver uma aplicação mobile para clientes.

Desenvolver uma API para integração de serviços.

Implementar um sistema de notificações e lembretes.


## Arquitetura

A arquitetura da API é composta por uma série de componentes que trabalham juntos para fornecer uma plataforma segura e escalável para o aluguel de quadras esportivas.

![image](https://github.com/user-attachments/assets/6faa05a1-e2bb-4967-9a74-93a62a3fc8e1)

### 1. Camada de Apresentação (Frontend)

- **Componentes:**

  - **Página Web:** Desenvolvida com HTML, CSS, JavaScript e React.
  - **Aplicativo Móvel:** Desenvolvido com React Native para suportar plataformas Android e iOS.

- **Comunicação:**
  - As interfaces Web e Mobile se comunicam com os microserviços através da **API Gateway** (AWS) via chamadas RESTful (HTTP/HTTPS).

### 2. Camada de Negócios (Backend)

- **API Gateway (AWS):**

  - **Função:** Roteamento de requisições, autenticação/autorização (JWT), monitoramento e controle de tráfego.
  - **Segurança:** Utilização de JWT para autenticação e autorização.

- **Microserviços:**

  - **Microserviço de Gestão de Usuários (Java):** Gerenciamento de contas de usuários.
  - **Microserviço de Gestão de Quadras (Java):** Gerenciamento das informações e características das quadras.
  - **Microserviço de Agendamento de Quadras (Java):** Gerenciamento de reservas e disponibilidade das quadras.

- **Comunicação:**
  - APIs REST para comunicação entre os microserviços e a API Gateway.

### 3. Camada de Dados

- **Banco de Dados (PostgreSQL):**
  - Cada microserviço possui um banco de dados PostgreSQL isolado.

### 4. Ambiente de Hospedagem

- **Cloud Provider (AWS):**
  - Utilização da AWS para hospedar todos os componentes, garantindo alta disponibilidade e escalabilidade.

### 5. Segurança

- **Autenticação e Autorização:**
  - Implementação de autenticação e autorização via JWT.
  - Validação do JWT pela API Gateway para assegurar o acesso seguro aos microserviços.

Esta arquitetura é modular e escalável, garantindo robustez, segurança e capacidade de adaptação ao crescimento da aplicação. A separação entre as camadas facilita a manutenção e futuras expansões.

Fluxo de Requisição

Aqui está um exemplo de fluxo de requisição para ilustrar como os componentes se comunicam entre si:

O usuário faz uma requisição para criar uma conta de usuário através do front-end.

O front-end envia a requisição para a API Gateway.

A API Gateway valida o JWT e autentica o usuário.

A API Gateway se comunica com o Microserviço de Gestão de Usuários para criar a conta de usuário.

O Microserviço de Gestão de Usuários cria a conta de usuário e armazena as informações no banco de dados PostgreSQL isolado.

A API Gateway retorna a resposta para o front-end, que apresenta a resposta ao usuário.

Essa arquitetura modular e escalável permite que a aplicação seja facilmente escalável e mantida, além de garantir a segurança e a robustez da plataforma.

## Modelagem da Aplicação

### Estrutura da entidade quadra

    "Quadra": {
        "id": "INT",
        "nome": "STRING",
        "tipo": "STRING",
        "localizacao": "STRING",
        "descricao": "STRING",
        "status": "STRING"
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

Existem muitas tecnologias diferentes que podem ser usadas para desenvolver APIs Web. A tecnologia certa para o seu projeto dependerá dos seus objetivos, dos seus clientes e dos recursos que a API deve fornecer.

Apresente também uma figura explicando como as tecnologias estão relacionadas ou como uma interação do usuário com o sistema vai ser conduzida, por onde ela passa até retornar uma resposta ao usuário.

A aplicação será desenvolvida utilizando as seguintes tecnologias:

Front-end: React, React Native, JavaScript, HTML, CSS

Back-end: JAVA

Banco de Dados: Postgresql

Hospedagem
A hospedagem da solução será realizada na AWS para garantir escalabilidade, alta disponibilidade e segurança:

1. API Gateway (AWS)
Serviço Utilizado: AWS API Gateway
Função: Serve como o ponto de entrada único para todas as requisições do frontend (Web e Mobile) aos microserviços. Gerencia o roteamento das requisições, autenticação e autorização (via JWT), monitoramento, controle de tráfego.
Escalabilidade: O AWS API Gateway escala automaticamente para lidar com diferentes níveis de tráfego.
2. Microserviços (Backend - Java)
Serviço Utilizado: Amazon Elastic Container Service (ECS)
Descrição:
Cada microserviço será containerizado utilizando Docker, garantindo isolamento e escalabilidade independente.
3. Banco de Dados (PostgreSQL)
Serviço Utilizado: Amazon RDS (Relational Database Service)
Descrição:
Cada microserviço terá seu próprio banco de dados PostgreSQL, gerenciado pelo Amazon RDS.
4. Frontend Web
Serviço Utilizado: Amazon S3 e Amazon CloudFront
Descrição:
Os arquivos estáticos da aplicação Web (HTML, CSS, JavaScript, e assets) serão hospedados no Amazon S3.
O Amazon CloudFront, uma CDN global, será utilizado para distribuir esses arquivos, garantindo baixa latência e rápida entrega do conteúdo para os usuários.
Segurança: HTTPS será utilizado para proteger a comunicação entre o navegador dos usuários e o CloudFront.
5. Aplicativo Móvel
Comunicação: O aplicativo se comunicará com a API Gateway da AWS para interagir com os microserviços, utilizando HTTPS e autenticação via JWT.
6. Gerenciamento de Logs e Monitoramento
Serviço Utilizado: Amazon CloudWatch
Descrição: Utilizado para coletar e monitorar logs e métricas de todos os componentes (API Gateway, microserviços, banco de dados).

## API Endpoints

### Gerenciamento de quadras

#### Cadastro de quadra
- Método: POST
- URL: /quadras
- Parâmetros:
```
{
    "nome": "STRING",
    "tipo": "STRING",
    "localizacao": "STRING",
    "descricao": "STRING",
    "status": "STRING"
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
        "id": INT,
        "nome": STRING,
        "tipo": STRING,
        "localizacao": STRING,
        "descricao": STRING,
        "status": STRING
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
    "nome": "STRING",
    "tipo": "STRING",
    "localizacao": "STRING",
    "descricao": "STRING",
    "status": "STRING"
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

[Discuta as considerações de segurança relevantes para a aplicação distribuída, como autenticação, autorização, proteção contra ataques, etc.]

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
