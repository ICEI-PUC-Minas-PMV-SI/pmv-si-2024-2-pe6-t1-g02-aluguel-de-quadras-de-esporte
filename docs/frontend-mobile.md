# Front-end Móvel

Front-end Móvel para Aplicação de Aluguel de Quadras Esportivas
O projeto consiste no desenvolvimento do front-end de uma aplicação móvel que conecta usuários a quadras esportivas disponíveis para aluguel.
O objetivo principal é criar uma interface intuitiva e responsiva, que facilite a busca e reserva de quadras esportivas para prática de diversas modalidades, como futebol, basquete e vôlei.

### Objetivos do Projeto
* Facilidade de uso: Proporcionar uma experiência fluida com navegação intuitiva e design amigável.
* Busca eficiente: Implementar filtros para localização, horários e tipos de quadra.
* Reservas rápidas: Permitir que usuários visualizem a disponibilidade e realizem reservas em poucos passos.
* Gestão de quadras: Facilitar o cadastro e a gestão de horários para proprietários de quadras.


## Tecnologias Utilizadas

### Front-end (Camada de Apresentação)
#### Frameworks/Plataformas :
* React Native:  Usado para desenvolvimento de aplicações móveis multiplataforma (Android e iOS). Suporta componentes estilizados e integração com back-end via APIs.
* Flutter: Opção  para multiplataforma, com foco em interfaces responsivas e fluídas.
* Kotlin (Android) ou Swift (iOS): Para aplicativos desenvolvidos diretamente nas linguagens nativas das plataformas.
  #### Estilização:
* Uso de CSS-in-JS (React Native) ou widgets específicos no Flutter para estilização.
#### Validações no Cliente:
* E-mail: Uso de expressões regulares para verificar o formato do e-mail.
* Campos obrigatórios: Validações básicas realizadas com código JavaScript (React Native) ou Dart (Flutter).
* Back-end (Camada de Aplicação e Acesso a Dados)
#### Linguagens e Frameworks:
* Node.js com Express.js: Popular para construir APIs REST. Suporta alto desempenho para autenticação e conexão com banco de dados.
* Django/Flask (Python): Focado em simplicidade e segurança, ideal para autenticação.
* Ruby on Rails: Oferece um ecossistema completo para APIs e gerenciamento de usuários.
#### API REST:
* A comunicação cliente-servidor deve ser feita através de APIs RESTful, enviando e recebendo dados no formato JSON.
#### Banco de Dados (Camada de Persistência)
* MySQL ou PostgreSQL: Muito usados para armazenar dados estruturados como e-mails e senhas (armazenadas como hash, nunca em texto puro).
* MongoDB: Banco de dados NoSQL, útil em projetos que precisam de mais flexibilidade nos dados.
  #### Segurança:
* Senhas devem ser armazenadas com hashing seguro (e.g., bcrypt).
* Comunicação cliente-servidor deve ser protegida por HTTPS.

## Arquitetura
### Camadas da Arquitetura
#### Camada de Apresentação (Front-end):
* Interface gráfica representada pela tela de login mostrada na imagem.
* Validações básicas no cliente, como verificar se os campos estão preenchidos e se o formato do e-mail é válido.
* Exibe mensagens de erro para o usuário (e.g., "Informe seu e-mail", "E-mail inválido", "Credenciais inválidas").
#### Camada de Aplicação/Negócio:
* Responsável por gerenciar as interações da aplicação.
* Reúne os dados do formulário e os envia ao servidor através de requisições HTTP (provavelmente via API REST).
* Trata respostas do servidor (e.g., credenciais inválidas) e repassa o feedback para a camada de apresentação.
#### Camada de Acesso a Dados (Back-end):
* Realiza a autenticação das credenciais no banco de dados.
* Retorna mensagens apropriadas para o cliente, como "Credenciais inválidas" ou sucesso no login.
* Possui uma API para gerenciar as requisições recebidas do front-end.
#### Camada de Persistência de Dados (Banco de Dados):
* Armazena os dados do usuário (e.g., e-mails, senhas hash).
* Garante a segurança e integridade das informações.
 Fluxo de Comunicação
#### Entrada do usuário: O usuário insere o e-mail e a senha.
* Validação local: O front-end verifica se os campos estão preenchidos e se o formato do e-mail está correto.
* Requisição ao servidor: Os dados são enviados ao backend via API para autenticação.
* Verificação no banco: O backend consulta o banco de dados para validar as credenciais.
* Resposta ao cliente: O servidor retorna o status da autenticação (sucesso ou erro), que é exibido na interface.
* Essa arquitetura garante flexibilidade para evoluir o sistema e atender diferentes requisitos, como segurança, escalabilidade e desempenho.

## Modelagem da Aplicação
[Descreva a modelagem da aplicação, incluindo a estrutura de dados, diagramas de classes ou entidades, e outras representações visuais relevantes.]
### A imagem mostra o diagrama de um banco de dados para um sistema de aluguel de quadras esportivas.
![Fluxograma (1)](https://github.com/user-attachments/assets/37e253b9-2710-4deb-a51a-f163de9d5770)

### Existem três tabelas:

- Usuários Cadastro: Armazena informações sobre os usuários do sistema, como nome, CPF, data de criação, etc. Também define os tipos de usuários: "cliente" ou "administrador".
- Os administradores têm acesso a funcionalidades adicionais, como gerenciar quadras e usuários.
- Quadra: Armazena informações sobre as quadras esportivas disponíveis para aluguel, como nome, tipo, localização, descrição, e se está disponível.
- Além disso, define as funções "verificarDisponibilidade" e "reservar".
- Reserva: Armazena informações sobre as reservas feitas pelos usuários, como data da reserva, usuário que fez a reserva, quadra reservada, localização da reserva, e se está disponível para o usuário.
- Também define as funções "confirmar" e "cancelar".
- As linhas que conectam as tabelas representam relacionamentos entre elas.
- Por exemplo, a tabela "Usuários Cadastro" tem uma relação com a tabela "Reserva" através do atributo "usuario".

## Projeto da Interface
[Descreva o projeto da interface móvel da aplicação, incluindo o design visual, layout das páginas, interações do usuário e outros aspectos relevantes.]

### Wireframes
[Inclua os wireframes das páginas principais da interface, mostrando a disposição dos elementos na página.]

### Design Visual
[Descreva o estilo visual da interface, incluindo paleta de cores, tipografia, ícones e outros elementos gráficos.]

### Layout Responsivo
[Discuta como a interface será adaptada para diferentes tamanhos de tela e dispositivos.]

### Interações do Usuário
[Descreva as interações do usuário na interface, como animações, transições entre páginas e outras interações.]

## Fluxo de Dados

[Diagrama ou descrição do fluxo de dados na aplicação.]

## Requisitos Funcionais

[Liste os principais requisitos funcionais da aplicação.]

## Requisitos Não Funcionais

[Liste os principais requisitos não funcionais da aplicação, como desempenho, segurança, escalabilidade, etc.]


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
