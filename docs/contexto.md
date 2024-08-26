# Introdução

O setor de aluguel de quadras esportivas cresceu significativamente nos últimos anos, impulsionado pela crescente conscientização sobre a importância de manter um estilo de vida ativo e saudável. Como resultado, esportes coletivos como futevôlei, beach tênis e vôlei de praia têm ganhado popularidade no Brasil, atraindo cada vez mais praticantes e fortalecendo essa tendência. Nesse cenário onde a digitalização dos serviços também é uma tendência, clubes, academias e centros esportivos têm enfrentado dificuldades na gestão eficaz de suas quadras. A justificativa do projeto se baseia na necessidade de modernizar o setor, oferecendo uma solução que melhore a eficiência operacional dos estabelecimentos e atenda às demandas dos consumidores. O público-alvo inclui os usuários de quadras esportivas, como atletas amadores e pessoas em busca de atividades recreativas, quanto os proprietários de quadras, como clubes e centros esportivos. 

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

Facilita a busca e reserva de quadras esportivas de acordo com a localização, tipo de esporte e disponibilidade;
Oferece uma variedade de opções de quadras esportivas para escolher;
Permite a reserva, evitando a necessidade de ligar ou visitar pessoalmente;
Oferece uma experiência de usuário intuitiva e fácil de usar.

Benefícios para os Proprietários de Quadras Esportivas:

Aumenta a visibilidade das quadras esportivas, alcançando um público mais amplo;
Facilita a gerenciamento de reservas e alugueis, evitando conflitos de horários e garantindo que as quadras sejam utilizadas ao máximo;
Permite a gestão eficiente de reservas, cancelamentos e alterações;
Aumenta a receita, pois os proprietários podem alugar as quadras por períodos mais curtos e com mais frequência.

## Público-Alvo

Adolescentes de (15-17 anos) com excelente convivência com a tecnologia e facilidade no seu uso e adultos (18-50 anos) em que fluxos longos e complexos podem ser um problema. 

# Especificações do Projeto

## Requisitos

### Requisitos Funcionais

|ID    | Descrição do Requisito  | Prioridade |
|------|-----------------------------------------|----|
|RF-001| Permitir que o locador disponibilize suas quadras para aluguel | ALTA | 
|RF-002| Permitir que o locador possa gerir os horarios disponíveis de cada quadra que possui   | ALTA |
|RF-003| Permitir que o locador cancele reservas de locatários de suas quadras   | MÉDIA |
|RF-004| Permitir que o locador bloqueie usuários do sistema  | BAIXA |
|RF-005| Permitir que o locatário pesquise quadras por nome, endereço ou preço   | MÉDIA |
|RF-006| Permitir que o locatário reserve uma quadra dentro dos horários disponibilizados pelo locador   | ALTA |

### Requisitos não Funcionais

|ID     | Descrição do Requisito  |Prioridade |
|-------|-------------------------|----|
|RNF-001| O sistema deve ser responsivo para rodar em um dispositivos móvel | ALTA | 
|RNF-002| O sistema deve ser escalável para lidar com aumentos de demanda de usuários |  BAIXA | 
|RNF-003| O sistema deve estar disponível quando requisitado pelo usuário |  ALTA | 
|RNF-004| O sistema deve ter boa usabilidade |  MÉDIA | 

### Critério de priorização
Foi utilizado um critério que prioriza requisitos que sejam necessários para a viabilidade da solução em primeiro lugar e que aumentem a flexibilidade do que foi desenvolvido para permitir mudanças rápidas, seguidos por critérios que melhorem a experiência do usuário e por último requisitos que tragam funcionalidades secundárias ou melhorias que ganham mais valor apenas se a solução se consolidar no mercado.

## Restrições

O projeto está restrito pelos itens apresentados na tabela a seguir.

|ID| Restrição                                             |
|--|-------------------------------------------------------|
|01| O projeto deverá ser entregue até o final do semestre |
|02| Não pode ser desenvolvido um módulo de backend        |

Enumere as restrições à sua solução. Lembre-se de que as restrições geralmente limitam a solução candidata.

> **Links Úteis**:
> - [O que são Requisitos Funcionais e Requisitos Não Funcionais?](https://codificar.com.br/requisitos-funcionais-nao-funcionais/)
> - [O que são requisitos funcionais e requisitos não funcionais?](https://analisederequisitos.com.br/requisitos-funcionais-e-requisitos-nao-funcionais-o-que-sao/)

# Catálogo de Serviços

A aplicação de aluguel de quadras esportivas oferecerá os seguintes serviços:

Cadastro de Quadras: permitirá que os proprietários de quadras esportivas cadastrem suas quadras, fornecendo informações como nome, descrição, endereço, capacidade e disponibilidade.

Busca de Quadras: permitirá que os usuários busquem quadras esportivas por localização, tipo de esporte, capacidade e disponibilidade.

Reserva de Quadras: permitirá que os usuários reservem quadras esportivas para um período específico.

Gerenciamento de Reservas: permitirá que os proprietários de quadras gerenciem as reservas de suas quadras, incluindo a confirmação ou cancelamento de reservas.

Avaliação de Quadras: permitirá que os usuários avaliem as quadras esportivas após a utilização, fornecendo feedback sobre a qualidade do serviço.

Notificações: permitirá que os usuários recebam notificações sobre as reservas, incluindo confirmação, cancelamento ou alterações.
Arquitetura da Solução



# Arquitetura da Solução

Definição de como o software é estruturado em termos dos componentes que fazem parte da solução e do ambiente de hospedagem da aplicação.

![arq](https://github.com/user-attachments/assets/b9402e05-8445-47c3-9d47-f11696e38a3d)

A arquitetura da solução para a aplicação de aluguel de quadras esportivas é baseada em uma estrutura de microserviços, que permite escalabilidade, flexibilidade e manutenção mais eficientes.
A solução é composta por:

Frontend e Mobile: IONIC

Backend: API Gateway (Node.js),
Microserviço de Autenticação (Node.js),
Microserviço de Quadras (Node.js)

Banco de Dados: Banco de Dados Relacional (MySQL) e Banco de Dados NoSQL (MongoDB)

Ambiente de Hospedagem: Cloud Provider (AWS), Containerização (Docker), Orquestração (Kubernetes)

Segurança: Autenticação e Autorização, Criptografia, Firewall

A arquitetura da plataforma de serviços é estruturada em três camadas:

Camada de Apresentação: Página Web (HTML, CSS, JavaScript) e Aplicativo Móvel (React Native)

Camada de Negócios: Servidor de Aplicação (Node.js)

Camada de Dados: Banco de Dados (MySQL)

A aplicação será hospedada em um ambiente de nuvem, utilizando os seguintes componentes:

Servidor Web: Hospedado na AWS
Banco de Dados: Hospedado na AWS
Serviço de Notificações: Utilizando o serviço de notificações da Firebase

Essas arquiteturas permitem que a aplicação seja escalável, flexível e segura, garantindo uma experiência de usuário satisfatória e uma gestão eficiente das quadras esportivas.

## Tecnologias Utilizadas

Descreva aqui qual(is) tecnologias você vai usar para resolver o seu problema, ou seja, implementar a sua solução. Liste todas as tecnologias envolvidas, linguagens a serem utilizadas, serviços web, frameworks, bibliotecas, IDEs de desenvolvimento, e ferramentas.

Apresente também uma figura explicando como as tecnologias estão relacionadas ou como uma interação do usuário com o sistema vai ser conduzida, por onde ela passa até retornar uma resposta ao usuário.

A aplicação será desenvolvida utilizando as seguintes tecnologias:

Front-end: React, JavaScript, HTML, CSS

Back-end: Node.js, Express.js, MongoDB

Banco de Dados: MongoDB

Serviço de Notificações: Firebase Cloud Messaging

## Hospedagem

Explique como a hospedagem e o lançamento da plataforma foi feita.

> **Links Úteis**:
>
> - [Website com GitHub Pages](https://pages.github.com/)
> - [Programação colaborativa com Repl.it](https://repl.it/)
> - [Getting Started with Heroku](https://devcenter.heroku.com/start)
> - [Publicando Seu Site No Heroku](http://pythonclub.com.br/publicando-seu-hello-world-no-heroku.html)
