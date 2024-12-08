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

![Captura de tela 2024-12-08 154801](https://github.com/user-attachments/assets/ef591c4a-6e46-4d26-8113-9187a164f0ed)
#### Descrição do Projeto da Interface Móvel
Design Visual
* Tema: Interface com estilo moderno e minimalista, usando cores escuras como fundo (dark mode) para destacar os elementos principais e proporcionar conforto visual.
 Paleta de cores:
* Fundo: Preto/Antracite.
* Botão principal: Azul vibrante (#007BFF), para chamar a atenção para ações importantes.
* Textos: Branco para legibilidade em contraste com o fundo escuro.
* Tipografia: Uso de fonte serifada elegante para o título (“QUADDRA”), contrastando com fontes sans-serif para textos secundários e botões.
Layout das Páginas
* Tela Inicial (Splash/Welcome):
* Logo e título: Nome da aplicação destacado na parte superior da tela.
* Mensagem de boas-vindas: Texto centralizado que indica a funcionalidade principal (“Gerencie suas quadras de qualquer lugar!”) e um subtítulo menor (“Faça login para começar”).
* Botão de ação: Botão grande e centralizado, com label "Acessar", projetado para facilitar a navegação para a tela de login.
Tela de Login (conforme imagem anterior):
* Campos para entrada de e-mail e senha com validação visual de erros.
* Botão de “Cadastrar” para novos usuários.
Interações do Usuário
* Clique em “Acessar”: Redireciona para a tela de login com animação de transição simples (deslizar ou fade).
* Animações: Efeitos suaves para botões quando clicados, como mudanças de cor ou escala, para indicar interação.
* Responsividade: O layout é ajustável para diferentes tamanhos de telas, mantendo o alinhamento central e proporções dos elementos.
Outros Aspectos Relevantes
* Acessibilidade: Texto grande e contrastante para garantir que a interface seja inclusiva.
* UX Simples: A interface segue princípios de usabilidade, com fluxos intuitivos que minimizam a curva de aprendizado do usuário.
* Escalabilidade: A página inicial é modular, podendo incluir links para "Ajuda", "Sobre" ou outras funções no futuro.
* Esse design proporciona uma experiência fluida e agradável, focada na funcionalidade principal da aplicação, com atenção aos detalhes visuais e interativos.

## Design Visual
Estilo Minimalista:
* Tons escuros (tema "dark mode"), criando um visual moderno e agradável para uso prolongado.
* Contraste bem definido: botões em azul vibrante destacam as ações principais, enquanto mensagens de erro aparecem em vermelho para chamar atenção.
#### Espaçamento e Organização:
* Elementos bem espaçados para evitar toques acidentais.
* Layout limpo, sem distrações visuais.
#### Layout das Páginas
A interface é estruturada de forma consistente, com uma hierarquia clara e foco nas funcionalidades principais.
Tela de Login (Principal)
Componentes:
* Título:
"Bem-vindo(a)" aparece no topo da tela, centralizado, com destaque visual (tamanho maior e contraste).
* Campos de Entrada:
E-mail: Campo para inserir o e-mail, com validação em tempo real.
Senha: Campo para inserir a senha, com máscara de proteção para ocultar os caracteres digitados.
* Botões:
Acessar: Botão principal para login, destacado em azul.
Cadastrar: Botão secundário, em cinza, posicionado logo abaixo.
* Mensagens de Validação/Erro:
Mensagens em vermelho exibidas abaixo dos campos para indicar erros, como e-mail inválido ou credenciais incorretas.
#### Feedback Visual:
* Bordas dos campos e mensagens de erro mudam dinamicamente conforme a interação do usuário.
* Pop-up ou tooltip para mensagens de erro gerais (e.g., "Erro no login - Credenciais inválidas").
* Tela de Cadastro (Sugestão)
Embora não exibida na imagem, é provável que a aplicação tenha uma tela de cadastro semelhante, com:
Campos adicionais, como nome completo, confirmação de senha, etc.
* Botão para voltar à tela de login.
#### Interações do Usuário
Validações em Tempo Real:
* Campos de entrada verificam erros ao perder o foco (e.g., e-mail inválido ou campos vazios).
* Mensagens de erro aparecem imediatamente, ajudando o usuário a corrigir problemas antes de tentar o login.
Navegação:
* Toque no botão Cadastrar redireciona para uma tela de cadastro.
* Após o login bem-sucedido, o usuário é redirecionado para a página inicial da aplicação.
  Estado do Botão "Acessar":
* Desativado enquanto os campos obrigatórios estão vazios.
* Ativado somente após validações bem-sucedidas.
Exibição de Erros no Login:
* Em caso de credenciais incorretas, um pop-up exibe o erro ("Erro de login - Credenciais inválidas"), com opção para tentar novamente.
#### Aspectos Relevantes
Acessibilidade:
* Uso de labels e descrições claras para auxiliar usuários com deficiências visuais.
* Alto contraste e tamanhos de toque adequados para facilitar a navegação.
Responsividade:
* Interface ajustável para diferentes tamanhos de tela, garantindo uma boa experiência tanto em smartphones pequenos quanto em dispositivos maiores.
Conectividade:
* Design preparado para funcionar em cenários online e offline:
* Feedback apropriado caso o dispositivo esteja sem conexão.
Resumo
A interface combina funcionalidade e design visual moderno, mantendo foco na usabilidade e na experiência do usuário. As validações e interações dinâmicas garantem que os usuários recebam feedback imediato e claro, minimizando erros e frustrações. O layout simples, aliado a cores e tipografia bem escolhidas, resulta em um aplicativo móvel profissional e intuitivo.

### Wireframes
### Tela inicial

![Captura de tela 2024-12-08 154801](https://github.com/user-attachments/assets/106f01b2-d811-49b2-b615-ac923c25354e)

#### Esta tela inicial da aplicação QUADDRA apresenta um design minimalista e focado na experiência do usuário. Ela funciona como uma página de boas-vindas, orientando o usuário sobre o propósito da aplicação: o gerenciamento de quadras esportivas.

### Tela login
![Captura de tela 2024-12-08 080511](https://github.com/user-attachments/assets/6873552e-ece2-403f-927c-1b859e99d8a2)

A imagem apresenta diferentes estados de validação na tela de login de uma aplicação, destacando as interações relacionadas à entrada de dados e mensagens de erro:
Estado Inicial:
* Campos de e-mail e senha estão vazios.
* Botão "Acessar" destacado em azul para chamar a atenção do usuário.
Validação de E-mail:
* Exibe uma mensagem em vermelho "Informe seu e-mail" quando o campo é deixado vazio.
* Mostra "E-mail inválido" caso o formato inserido seja incorreto (ex.: falta de "@" ou domínio).
Validação de Senha:
* Mensagem "Informe sua senha" aparece em vermelho ao tentar prosseguir sem preencher este campo.
Toast de Erro:
* Uma notificação (toast) no topo da tela informa "Erro de login" com a mensagem "Credenciais inválidas" após tentativa de login com dados incorretos.
Propósito:
* Esses estados de validação e feedback garantem uma experiência do usuário clara e intuitiva, reduzindo erros e orientando o preenchimento correto dos campos obrigatórios.

### Tela cadastro

Análise das Telas de Cadastro

*Título: Faça seu cadastro![Captura de tela 2024-12-08 161211](https://github.com/user-attachments/assets/ade24cb7-d01a-464d-8b47-ddf2dc72ed30)

#### Tela 1:
Campos:
* Nome
* Telefone
* E-mail
* Senha
* CPF
* Botão: Cadastrar
Descrição: Esta tela representa a interface de cadastro inicial, onde o usuário preenche seus dados para criar uma conta.
#### Tela 2:
Campos:
* Nome (com validação "Digite seu nome")
* Telefone (com validação "O número de telefone é obrigatório")
* E-mail (com validação "Informe seu e-mail")
* Senha (com validação "Informe sua senha")
* CPF (com validação "Digite seu CPF")
* Botão: Cadastrar

Descrição: Esta tela mostra a validação dos campos de input. Ela destaca a importância de inserir informações válidas, como um número de telefone válido.
Conclusão:
* Tela 1 - Coleta as informações do usuário para cadastro.
* Tela 2 - Exibe a validação dos campos de input, garantindo a integridade dos dados inseridos.
  #### Interface
  ![Captura de tela 2024-12-08 162206](https://github.com/user-attachments/assets/328f9dde-c5d8-46d7-a580-e853f33910c6)
 ### App Mobile - Interface
Objetivo: Ajudar o usuário a encontrar e reservar quadras esportivas.
* Seus Agendamentos: Acesso à lista de reservas.
* Perfil: Acesso ao perfil do usuário.
Conclusão: A interface do app é simples, clean e fácil de usar.

As imagens atrativas e o texto informativo convidam o usuário a explorar as funcionalidades do app.
### Atualizar Perfil
![Captura de tela 2024-12-08 162929](https://github.com/user-attachments/assets/fd7e2a2d-e788-494c-9d8d-ed3a8abca221)

A imagem apresenta três telas diferentes de um aplicativo, todas com o objetivo de atualizar um perfil.
As diferenças entre elas demonstram a evolução do processo de atualização.
#### Tela 1 - Recuperaçao de Informações:
* Objetivo: Solicitar as informações básicas do usuário para atualizar o perfil.
* Campos: Nome, Telefone e Nova Senha.
* Observação: A tela solicita a nova senha sem validação inicial.
#### Tela 2 - Validação de Senha:
* Objetivo: Validar a nova senha informada pelo usuário.
* Campos: Nome, Telefone, Nova Senha e Confirmar Nova Senha.
* Observação: A tela apresenta a mensagem "Informe sua senha", indicando que a senha inicial não foi considerada válida. A confirmação da nova senha é solicitada, garantindo que o usuário digite a senha corretamente.
#### Tela 3 - Validação de Senha (2):
* Objetivo: Validar a nova senha informada pelo usuário.
* Campos: Nome, Telefone, Nova Senha e Confirmar Nova Senha.
* Observação: A tela apresenta a mensagem "As senhas devem ser iguais", indicando que a nova senha e a confirmação são diferentes. As senhas inseridas aparecem como "..." para manter a confidencialidade.
*Conclusão:

As três telas representam um processo iterativo de atualização de perfil, guiando o usuário na entrada de informações e validando a nova senha para garantir a segurança da conta.

### Agendamentos
![Captura de tela 2024-12-08 163548](https://github.com/user-attachments/assets/66c98fc3-e2d3-4530-99d3-21025fe33ac5)

A imagem mostra três telas de um sistema de agendamento, cada uma representando uma funcionalidade específica:
#### 1. Gestão de Agendamentos:
* Exibe uma lista com os agendamentos realizados.
* Cada agendamento contém informações como:
* Quadra
* Data
* Horário
* Local
* Permite cancelar um agendamento individualmente.
* Permite editar um agendamento (a tela de edição é mostrada na segunda imagem).
#### 2. Alterar Data e Hora:
* Permite editar a data e hora de um agendamento específico.
* Mostra a data e hora atuais do agendamento.
* Permite selecionar a nova data e hora.
* Oferece a opção de salvar as alterações no agendamento.
#### 3. Cancelar Agendamento:
* Exibe uma lista com os agendamentos realizados.
* Cada agendamento contém informações como:
* Quadra
* Data
* Horário
* Local
* Permite cancelar todos os agendamentos de uma vez.
* Indica os agendamentos que já foram cancelados.
As três telas trabalham juntas para oferecer ao usuário uma experiência completa de gerenciamento de agendamentos.
### Design Visual
O estilo visual da interface combina um tema escuro elegante com elementos visuais minimalistas. 

A paleta de cores equilibrada e a tipografia limpa proporcionam uma experiência agradável e profissional, enquanto o uso de feedback dinâmico e ícones melhora a usabilidade e acessibilidade da aplicação.
### Layout Responsivo
A interface será altamente flexível e otimizada para atender às necessidades de diferentes dispositivos e tamanhos de tela. 

O uso de design responsivo, elementos escaláveis, e técnicas específicas de otimização garantirá que a aplicação funcione perfeitamente, oferecendo uma experiência de usuário consistente e agradável em qualquer dispositivo.

### Interações do Usuário
A interface será projetada para proporcionar uma experiência interativa, fluida e intuitiva, incorporando animações, transições e interações que guiem o usuário e tornem o uso da aplicação agradável. Abaixo está a descrição detalhada das principais interações:
1. Transições Entre Páginas
Efeito de Transição Suave:
* Transições entre telas (como a tela de login para o dashboard) usarão animações de deslizamento lateral ou desvanecimento.
Exemplo: Ao clicar no botão "Acessar", a nova página desliza da direita para a esquerda, criando uma continuidade natural.
Animação de Retorno:
* Ao utilizar o botão de "voltar" do dispositivo ou um botão de navegação, a página anterior retorna com um movimento deslizante reverso, reforçando o fluxo intuitivo.
Duração:
* Transições rápidas (~300ms) para manter a aplicação responsiva sem atrasos perceptíveis.
2. Animações de Feedback
Interações diretas com elementos da interface proporcionarão feedback imediato para o usuário:

Botões:
* Quando um botão é clicado, ele muda levemente de cor (e.g., clareamento ou sombreamento) para indicar que foi pressionado.
Ripple Effect:
* Um efeito de onda será exibido ao tocar nos botões, especialmente em dispositivos Android, seguindo as diretrizes do Material Design.
Campos de Texto:
* Campos de entrada ganham destaque visual (borda colorida ou efeito de brilho) quando selecionados.
Validações em tempo real:
* E-mail ou senha inválidos mostram mensagens de erro com animações de desvanecimento ou pequenos tremores no campo correspondente para chamar atenção.
Erro no Login:
* Exibição de uma mensagem de erro (e.g., "Credenciais inválidas") com uma animação de fade-in para que o usuário perceba a mensagem de forma natural.

## Fluxo de Dados

[Diagrama ou descrição do fluxo de dados na aplicação.]

## Requisitos Funcionais

| ID     | Descrição do Requisito                         | Prioridade | Responsável     |
| ------ | ---------------------------------------------- | ---------- | --------------- |
| RF-001 | O sistema deve prover a gestão de usuários     | ALTA       | Bianca e Diego  |
| RF-002 | O sistema deve prover o agendamento de quadras | ALTA       | Enzo e Henrique |
| RF-003 | O sistema deve prover a gestão de quadras      | ALTA       | Lucas           |

## Requisitos Não Funcionais

| ID      | Descrição do Requisito                                            | Prioridade |
| ------- | ----------------------------------------------------------------- | ---------- |
| RNF-001 | O sistema deve ser responsivo para rodar em um dispositivos móvel | ALTA       |
| RNF-002 | O sistema deve ter latência máxima de 5 segundos                  | MÉDIA      |

## Considerações de Segurança

* A segurança da aplicação será garantida por uma combinação de autenticação robusta, autorização cuidadosa, criptografia, proteção contra ataques comuns e boas práticas de desenvolvimento. 
* Isso não apenas protegerá os dados do usuário, mas também manterá a confiança na aplicação e evitará riscos legais ou de reputação.

## Implantação
#### Requisitos de Hardware e Software:
* Servidor (Backend): CPU de 2 vCPUs, 4 GB de RAM, 50 GB de armazenamento SSD. Sistema operacional Linux ou Windows Server.
* Dispositivo Móvel (Cliente): Android 8.0 ou superior, iOS 12 ou superior, com 3 GB de RAM.
Plataforma de Hospedagem:
*AWS, GCP, Azure ou DigitalOcean são boas opções. AWS e GCP oferecem escalabilidade, enquanto DigitalOcean é mais acessível para pequenas empresas.
Configuração do Ambiente de Implantação:
* Criação de instância no provedor de nuvem, instalação de dependências como Node.js, Python, banco de dados (PostgreSQL/MySQL).
Deploy da Aplicação:
* Backend: Clone o repositório, instale dependências e configure o servidor web (Nginx ou Apache).
* Frontend: Gere o APK/IPA e faça o upload para a Google Play ou App Store.
Testes em Produção:
* Realize testes funcionais (login, API), de performance (com JMeter), e de segurança (com OWASP ZAP).
* Configure ferramentas de monitoramento (ex.: New Relic, Datadog) para garantir a saúde do sistema.
* Esse processo assegura que a aplicação seja implantada corretamente em produção, com alta disponibilidade e segurança

## Testes

[Descreva a estratégia de teste, incluindo os tipos de teste a serem realizados (unitários, integração, carga, etc.) e as ferramentas a serem utilizadas.]

1. Crie casos de teste para cobrir todos os requisitos funcionais e não funcionais da aplicação.
2. Implemente testes unitários para testar unidades individuais de código, como funções e classes.
3. Realize testes de integração para verificar a interação correta entre os componentes da aplicação.
4. Execute testes de carga para avaliar o desempenho da aplicação sob carga significativa.
5. Utilize ferramentas de teste adequadas, como frameworks de teste e ferramentas de automação de teste, para agilizar o processo de teste.

# Referências

Inclua todas as referências (livros, artigos, sites, etc) utilizados no desenvolvimento do trabalho.
