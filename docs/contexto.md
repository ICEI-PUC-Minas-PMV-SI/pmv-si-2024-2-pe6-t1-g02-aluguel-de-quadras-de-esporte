## Introdução

O setor de aluguel de quadras esportivas cresceu significativamente nos últimos anos, impulsionado pela crescente conscientização sobre a importância de manter um estilo de vida ativo e saudável. Entre 2006 e 2019, a média de praticantes de esportes no Brasil era de 45%, e em 2023, esse índice subiu para 82% (Cândido, 2024). Como resultado, esportes coletivos como futevôlei, beach tênis e vôlei de praia têm ganhado popularidade, atraindo cada vez mais praticantes e fortalecendo essa tendência. Nesse cenário onde a digitalização dos serviços também é uma tendência "As ferramentas digitais estão desempenhando um papel cada vez mais importante na gestão esportiva. Elas permitem uma comunicação mais eficiente entre treinadores, atletas e a equipe de apoio, facilitam o agendamento de treinos e competições, e fornecem uma plataforma para o gerenciamento de dados de desempenho." (Volchan, 2024), clubes, academias e centros esportivos têm enfrentado dificuldades na gestão eficaz de suas quadras. A justificativa do projeto se baseia na necessidade de modernizar o setor, oferecendo uma solução que melhore a eficiência operacional dos estabelecimentos e atenda às demandas dos consumidores. O público-alvo inclui os usuários de quadras esportivas, como atletas amadores e pessoas em busca de atividades recreativas, quanto os proprietários de quadras, como clubes e centros esportivos.

#### Referências

Cândido, I. (2024). Prática esportiva cresce no país: veja as principais oportunidades para as marcas. Mundo do Marketing. Disponível em: https://www.mundodomarketing.com.br/pratica-esportiva-cresce-no-pais-veja-as-principais-oportunidades-para-as-marcas

Volchan, F. (2024). A gestão esportiva na era digital: ferramentas e tecnologias para otimizar processos e resultados. LinkedIn. Disponível em: https://www.linkedin.com/pulse/gest%C3%A3o-esportiva-na-era-digital-ferramentas-e-para-otimizar-volchan-5p5rf/

## Problema

Os estabelecimentos de aluguel de quadras esportivas frequentemente enfrentam desafios operacionais devido ao uso de métodos tradicionais e manuais para a gestão de reservas, como planilhas, cadernos de anotações e sistemas desatualizados. Esses métodos levam a ineficiências, como conflitos de horários, onde duas ou mais reservas são feitas para o mesmo período, causando frustração tanto para os clientes quanto para os proprietários. Além disso, a falta de uma visão clara e atualizada sobre a ocupação das quadras resulta em horários ociosos, gerando subutilização dos espaços e perda de receita.

Outro problema comum é o processo demorado e frustrante de encontrar e reservar uma quadra disponível. Usuários frequentemente precisam enviar mensagens ou fazer ligações, aguardando o retorno de um funcionário, o que causa incertezas e diminui a satisfação do cliente. A ausência de uma plataforma centralizada e eficiente para gerenciamento e reservas dificulta o acesso dos usuários e prejudica a demanda, impactando negativamente a experiência do cliente e a rentabilidade dos locatários.

## Objetivos

O objetivo é desenvolver uma aplicação distribuída para realizar agendamentos de quadras esportivas. Dentro deste objetivo geral há os seguintes objetivos específicos:

1. Desenvolver uma aplicação web administrativa para proprietários.
2. Desenvolver uma aplicação mobile para clientes.
3. Desenvolver uma API para integração de serviços.
4. Implementar um sistema de notificações e lembretes.

## Justificativa
A aplicação de aluguel de quadras esportivas tem como objetivo principal proporcionar uma plataforma fácil e conveniente para que os usuários encontrem e reservem quadras esportivas de acordo com suas necessidades. Além disso, a aplicação também visa ajudar os proprietários de quadras esportivas a gerenciar suas quadras de forma mais eficiente, aumentando a visibilidade e a receita.

Benefícios para os Usuários:

* Facilita a busca e reserva de quadras esportivas de acordo com a localização, tipo de esporte e disponibilidade;
* Oferece uma variedade de opções de quadras esportivas para escolher;
* Permite a reserva, evitando a necessidade de ligar ou visitar pessoalmente;
* Oferece uma experiência de usuário intuitiva e fácil de usar.

Benefícios para os Proprietários de Quadras Esportivas:

* Aumenta a visibilidade das quadras esportivas, alcançando um público mais amplo;
* Facilita a gerenciamento de reservas e alugueis, evitando conflitos de horários e garantindo que as quadras sejam utilizadas ao máximo;
* Permite a gestão eficiente de reservas, cancelamentos e alterações;
* Aumenta a receita, pois os proprietários podem alugar as quadras por períodos mais curtos e com mais frequência.

## Público-Alvo

Adolescentes de (15-17 anos) com excelente convivência com a tecnologia e facilidade no seu uso e adultos (18-50 anos) em que fluxos longos e complexos podem ser um problema. 

# Especificações do Projeto

## Requisitos

### Requisitos Funcionais

|ID    | Descrição do Requisito  | Prioridade | Responsável |
|------|-----------------------------------------|----| --------|
|RF-001| O sistema deve prover a gestão de usuários | ALTA | Bianca e Davi |
|RF-002| O sistema deve prover o agendamento de quadras | ALTA | Enzo e Henrique |
|RF-003| O sistema deve prover a gestão de quadras | ALTA | Lucas e Diego |

### Requisitos não Funcionais

|ID     | Descrição do Requisito  | Prioridade |  
|-------|-------------------------|----|
|RNF-001| O sistema deve ser responsivo para rodar em um dispositivos móvel | ALTA |
|RNF-002| O sistema deve ter latência máxima de 5 segundos |  MÉDIA | 

### Critério de priorização
Foi utilizado um critério que prioriza requisitos que sejam necessários para a viabilidade da solução em primeiro lugar e que aumentem a flexibilidade do que foi desenvolvido para permitir mudanças rápidas, seguidos por critérios que melhorem a experiência do usuário e por último requisitos que tragam funcionalidades secundárias ou melhorias que ganham mais valor apenas se a solução se consolidar no mercado.

## Restrições

O projeto está restrito pelos itens apresentados na tabela a seguir.

|ID| Restrição                                             |
|--|-------------------------------------------------------|
|01| O projeto deverá ser entregue até o final do semestre |
|02| Desenvolver o projeto utilizando as tecnologias definidas na arquitetura |

# Catálogo de Serviços

A aplicação de aluguel de quadras esportivas oferecerá os seguintes serviços:

* Cadastro de quadras: permitirá que os proprietários de quadras esportivas cadastrem suas quadras, fornecendo informações como nome, descrição, endereço, capacidade e disponibilidade.
* Busca de quadras: permitirá que os usuários busquem quadras esportivas por localização, tipo de esporte, capacidade e disponibilidade.
* Reserva de quadras: permitirá que os usuários reservem quadras esportivas para um período específico.
* Gerenciamento de reservas: permitirá que os proprietários de quadras gerenciem as reservas de suas quadras, incluindo a confirmação ou cancelamento de reservas.
* Notificações: permitirá que os usuários recebam notificações sobre as reservas, incluindo confirmação, cancelamento ou alterações.

# Arquitetura da Solução

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


## Tecnologias Utilizadas

Apresente também uma figura explicando como as tecnologias estão relacionadas ou como uma interação do usuário com o sistema vai ser conduzida, por onde ela passa até retornar uma resposta ao usuário.

A aplicação será desenvolvida utilizando as seguintes tecnologias:

Front-end: React, React Native, JavaScript, HTML, CSS

Back-end: JAVA

Banco de Dados: Postgresql

## Hospedagem

A hospedagem da solução será realizada na AWS para garantir escalabilidade, alta disponibilidade e segurança:

## 1. API Gateway (AWS)
- **Serviço Utilizado:** AWS API Gateway
- **Função:** Serve como o ponto de entrada único para todas as requisições do frontend (Web e Mobile) aos microserviços. Gerencia o roteamento das requisições, autenticação e autorização (via JWT), monitoramento, controle de tráfego.
- **Escalabilidade:** O AWS API Gateway escala automaticamente para lidar com diferentes níveis de tráfego.

## 2. Microserviços (Backend - Java)
- **Serviço Utilizado:** Amazon Elastic Container Service (ECS)
- **Descrição:**
  - Cada microserviço será containerizado utilizando Docker, garantindo isolamento e escalabilidade independente.


## 3. Banco de Dados (PostgreSQL)
- **Serviço Utilizado:** Amazon RDS (Relational Database Service)
- **Descrição:**
  - Cada microserviço terá seu próprio banco de dados PostgreSQL, gerenciado pelo Amazon RDS.

## 4. Frontend Web
- **Serviço Utilizado:** Amazon S3 e Amazon CloudFront
- **Descrição:**
  - Os arquivos estáticos da aplicação Web (HTML, CSS, JavaScript, e assets) serão hospedados no Amazon S3.
  - O Amazon CloudFront, uma CDN global, será utilizado para distribuir esses arquivos, garantindo baixa latência e rápida entrega do conteúdo para os usuários.
- **Segurança:** HTTPS será utilizado para proteger a comunicação entre o navegador dos usuários e o CloudFront.

## 5. Aplicativo Móvel
- **Comunicação:** O aplicativo se comunicará com a API Gateway da AWS para interagir com os microserviços, utilizando HTTPS e autenticação via JWT.

## 6. Gerenciamento de Logs e Monitoramento
- **Serviço Utilizado:** Amazon CloudWatch
- **Descrição:** Utilizado para coletar e monitorar logs e métricas de todos os componentes (API Gateway, microserviços, banco de dados). 

