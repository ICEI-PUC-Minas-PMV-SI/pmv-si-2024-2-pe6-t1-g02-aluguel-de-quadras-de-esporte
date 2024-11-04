# Front-end Web

### Descrição do Projeto: Aluguel de Quadras Esportivas

O projeto "Aluguel de Quadras Esportivas" tem como objetivo desenvolver uma aplicação web que facilite a busca e o aluguel de quadras esportivas em diversas localidades. Com uma interface amigável e responsiva, o usuário poderá visualizar as quadras disponíveis, acessar detalhes sobre cada uma, realizar reservas e gerenciar suas atividades esportivas de forma simples e eficiente.

### Objetivos do Projeto

1. **Facilitar o Acesso**: Permitir que os usuários encontrem facilmente quadras esportivas disponíveis na sua região.
  
2. **Experiência do Usuário**: Proporcionar uma interface intuitiva e responsiva, que se adapte a diferentes dispositivos, melhorando a navegação e interação.

3. **Gerenciamento de Reservas**: Implementar um sistema que permita aos usuários realizar e gerenciar suas reservas de forma prática.

4. **Informações Detalhadas**: Oferecer informações completas sobre cada quadra, incluindo localização, horários disponíveis e avaliações de outros usuários.

5. **Apoiar a Prática Esportiva**: Incentivar a prática de esportes e a socialização entre usuários, promovendo um estilo de vida ativo.

## Tecnologias Utilizadas
### Tecnologias Utilizadas

- **Front End**: React com TypeScript para criar uma interface interativa e tipada.
- **Estilização**: CSS com foco em design responsivo.
- **Routing**: React Router para gerenciar a navegação entre as diferentes páginas da aplicação.

Esse projeto não só atende à demanda de usuários em busca de atividades esportivas, mas também promove a cultura esportiva, incentivando a utilização de espaços de lazer de forma mais acessível.

## Arquitetura

### Arquitetura da Aplicação Web: Aluguel de Quadras Esportivas

A arquitetura da aplicação é baseada em uma estrutura modular e em componentes, utilizando React para a construção da interface do usuário. Abaixo, estão descritos os principais componentes da aplicação, suas responsabilidades e interações.

#### 1. Estrutura Geral

A aplicação é dividida em três camadas principais:

- **Camada de Apresentação**: Responsável pela interface do usuário, composta por componentes React.
- **Camada de Roteamento**: Gerencia a navegação entre diferentes páginas da aplicação.
- **Camada de Estado**: Gerencia o estado da aplicação (seja com hooks do React ou um gerenciador de estado global como Redux, se necessário).

#### 2. Componentes Principais

- **App.tsx**
  - **Responsabilidade**: Componente raiz que encapsula a aplicação, incluindo o roteamento e a disposição dos componentes de layout.
  - **Interações**: Gerencia as rotas e renderiza os componentes filhos de acordo com a URL.

- **Header.tsx**
  - **Responsabilidade**: Exibe o cabeçalho da aplicação, incluindo o título e links de navegação.
  - **Interações**: Não possui estado próprio; interage com a camada de roteamento.

- **Footer.tsx**
  - **Responsabilidade**: Exibe informações de copyright e links adicionais.
  - **Interações**: Sem interações complexas; serve apenas como área de informação.

- **Pages (Home.tsx, CourtDetails.tsx, Booking.tsx)**
  - **Home.tsx**
    - **Responsabilidade**: Exibe uma lista de quadras disponíveis usando o componente `CourtList`.
    - **Interações**: Carrega os dados das quadras e os passa para o `CourtList`.
    
  - **CourtDetails.tsx**
    - **Responsabilidade**: Exibe informações detalhadas sobre uma quadra específica, incluindo imagens, horários disponíveis e botões para reserva.
    - **Interações**: Recebe os dados da quadra através de parâmetros da URL e pode interagir com a camada de estado para gerenciar reservas.
  
  - **Booking.tsx**
    - **Responsabilidade**: Permite ao usuário confirmar a reserva de uma quadra.
    - **Interações**: Recebe informações sobre a quadra e o horário desejado, processa a reserva e atualiza o estado da aplicação.

- **CourtList.tsx**
  - **Responsabilidade**: Componente que renderiza uma lista de quadras usando o `CourtCard`.
  - **Interações**: Recebe uma lista de quadras e renderiza um `CourtCard` para cada uma.

- **CourtCard.tsx**
  - **Responsabilidade**: Exibe informações básicas de uma quadra, como nome e localização, e fornece um link para mais detalhes.
  - **Interações**: Não possui estado; redireciona o usuário para a página de detalhes da quadra.

#### 3. Fluxo de Dados

1. **Carregamento de Dados**: A página inicial (`Home.tsx`) carrega uma lista de quadras a partir de uma API ou de dados locais e passa essas informações para o `CourtList.tsx`.

2. **Navegação**: O usuário pode clicar em um `CourtCard` para ser redirecionado para `CourtDetails.tsx`, onde detalhes adicionais são exibidos.

3. **Reserva**: Ao optar por reservar uma quadra, o usuário é redirecionado para `Booking.tsx`, onde pode confirmar a reserva. Os dados da reserva são gerenciados na camada de estado.

4. **Atualização de Estado**: Após a confirmação da reserva, a aplicação pode atualizar a lista de quadras disponíveis, refletindo a nova disponibilidade.

### Considerações Finais

Essa arquitetura modular e baseada em componentes permite uma manutenção e escalabilidade facilitadas. Cada componente possui uma responsabilidade clara, o que torna o código mais fácil de entender e modificar. Além disso, a separação da lógica de apresentação e gerenciamento de estado promove um desenvolvimento mais organizado e eficiente.
## Modelagem da Aplicação

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

As operações definidas para cada tabela permitem a manipulação dos dados do sistema. As operações "verificarDisponibilidade" e "reservar" na tabela "Quadra" permitem controlar a disponibilidade das quadras, enquanto as operações "confirmar" e "cancelar" na tabela "Reserva" permitem gerenciar as reservas.

### A imagem mostra um diagrama de fluxo para um sistema de agendamento online.

![image](https://github.com/user-attachments/assets/b869596a-c41f-420b-836b-02961454ac98)

- O usuário começa acessando a página inicial, onde pode fazer login ou criar uma conta. 
- Após o login, o usuário pode visualizar seus agendamentos, agendar novos, visualizar o catálogo de quadras ou alterar ou cancelar agendamentos existentes. 
- A imagem também mostra os pontos finais da API usados pelo sistema.


## Projeto da Interface Web
![Captura de tela 2024-11-03 194227](https://github.com/user-attachments/assets/e50fe27a-9f4a-410d-a885-5c4d0abfe321)
A interface da Web apresenta um design clean e moderno, com foco na simplicidade e usabilidade. As cores claras e o uso de imagens minimalistas criam uma experiência visual agradável e intuitiva.

Layout das Páginas:

Página Inicial: A página inicial apresenta um título chamativo "Simplifique o gerenciamento de suas quadras", seguido de uma breve descrição dos benefícios da plataforma. Um botão de destaque "Comece agora" convida o usuário a iniciar o processo de cadastro ou login.
Funcionalidades: Uma seção dedicada a apresentar as funcionalidades da plataforma, divididas em cards com ícones representativos, título e breve descrição de cada funcionalidade.
Outras Páginas: A interface provavelmente inclui outras páginas como login/cadastro, perfil do usuário, administração de quadras, agendamento, etc. O layout dessas páginas deve manter a mesma estética e organização da página inicial.
Interações do Usuário:

Navegação: A navegação da interface é intuitiva, com menus simples e botões claros para acesso às diferentes áreas da plataforma.
Formulários: Os formulários para cadastro, login e agendamento são simples e diretos, com campos intuitivos e mensagens de erro claras.
Busca: A interface provavelmente inclui uma funcionalidade de busca para facilitar a localização de quadras e informações relevantes.
Outros Aspectos:

Responsividade: A interface é responsiva, adaptando-se automaticamente a diferentes tamanhos de tela, garantindo uma experiência otimizada em desktops, tablets e smartphones.
Segurança: A plataforma deve garantir a segurança dos dados dos usuários, implementando medidas de proteção como criptografia de dados e autenticação de dois fatores.
Em resumo:

A interface da Web é bem projetada, com foco na simplicidade, usabilidade e segurança. A organização do conteúdo, o design visual e a interação intuitiva garantem uma experiência positiva para o usuário, facilitando o gerenciamento de suas quadras.

### Wireframes

 ### Tela Inicial
 Este é um website para um sistema de gerenciamento de quadras esportivas. 
 Ele oferece uma solução completa para gerenciar e alugar quadras, com funcionalidades como reserva online, acesso 24 horas e gerenciamento de múltiplos usuários. 
 O website se destaca por sua interface simples e intuitiva, e por oferecer uma solução completa para as necessidades das quadras esportivas.

 
![Captura de tela 2024-11-03 194227](https://github.com/user-attachments/assets/2663d593-144b-4111-a316-905255db46cb)

### Tela Login
A imagem mostra uma tela de login para um aplicativo chamado "Gestão de quadras esportivas". 
O aplicativo permite que os usuários gerenciem seus horários com facilidade. A tela de login solicita o email e a senha do usuário. 
Os usuários podem entrar ou criar uma nova conta.


![Captura de tela 2024-11-03 195354](https://github.com/user-attachments/assets/813df6cf-c207-4c3e-87b2-3795dbc5c0ef)

### Tela Cadastro de Usuário
A imagem mostra um formulário de cadastro de usuário em português, com campos para inserir nome, telefone, email, senha, confirmar senha, tipo de documento (CPF ou CNPJ) e número de CPF.
No final, tem um botão "Cadastrar".

![Captura de tela 2024-11-03 195410](https://github.com/user-attachments/assets/5ac9a8d0-526d-4d28-9852-21397c008041)

### Tela Agendamentos
A imagem mostra a tela de agendamentos do sistema Quaddra. A tela exibe duas quadras agendadas para o dia 23/08/2024, ambas na Penha. 
A primeira está com status "AGENDADO" e a segunda com status "CANCELADO". O usuário pode editar ou cancelar as agendamentos clicando nos ícones de lápis e lixo, respectivamente.
Também é possível agendar novas quadras clicando no botão "Escolha uma quadra".

![Captura de tela 2024-11-03 195511](https://github.com/user-attachments/assets/c4a7815c-e7e9-46af-95e5-65db4cee6c42)

### Tela Catálago de quadras
A imagem mostra um site de um local que aluga quadras para esporte. 
A tela mostra seis quadras diferentes, com informações sobre localização, tipo de esporte, preço por hora e botão de reservar.

![Captura de tela 2024-11-03 195721](https://github.com/user-attachments/assets/9025516d-14d2-4273-8cfe-f59b24378a23)

### Tela Alterar Perfil

- Esta é uma tela de atualização de perfil onde você pode atualizar suas informações pessoais, incluindo seu nome, telefone e senha.
-  Depois de atualizar suas informações, você clica em "Atualizar perfil" e recebe a mensagem "Sucesso" para confirmar que seu perfil foi atualizado com sucesso.

  
![Captura de tela 2024-11-03 202816](https://github.com/user-attachments/assets/fac2b720-0839-446d-9b40-7e67933cdc7f)


### Design Visual
A interface é organizada e limpa, com um estilo minimalista e profissional. 
A paleta de cores é neutra, predominando o branco e o preto, com detalhes em azul. 
A tipografia é sans-serif, legível e fácil de ler. Os ícones são simples e intuitivos, representando claramente suas funções.
A disposição das informações é organizada e lógica, facilitando a navegação. A interface prioriza a funcionalidade e a clareza, proporcionando uma experiência de usuário agradável e eficiente.

### Layout Responsivo

Resumo da Responsividade da Interface
Layout Flexível:

O layout se ajusta automaticamente ao tamanho da tela, reorganizando texto, imagens e botões de forma inteligente.
Media Queries:

Implementação de media queries no CSS para otimizar o estilo em dispositivos móveis, tablets e desktops.
Imagens Responsivas:

Uso do atributo "srcset" para carregar versões adequadas das imagens conforme o tamanho da tela, evitando arquivos muito grandes em dispositivos menores.
Navegação:

Menu Hambúrguer: Menu de navegação principal substituído por um menu suspenso em telas menores.
Botões de Ação: Posicionados estrategicamente para fácil acesso.
Gestão de Toque: Interface otimizada para interação por toque, com elementos suficientemente grandes.
Conteúdo:

Texto conciso e legível em diferentes tamanhos de tela, com uso estratégico de elementos visuais.
Testes:

Testes realizados em diversos dispositivos e navegadores para garantir compatibilidade e funcionalidade.
Conclusão
Essas adaptações garantem uma interface responsiva e fácil de usar, proporcionando uma experiência consistente e agradável em todos os dispositivos.

### Interações do Usuário
Para melhorar a experiência do usuário, as seguintes interações:

Login e Autenticação:
- Animação de Transição: Ao enviar as credenciais, a tela de login pode desvanecer, revelando uma tela de carregamento.
- Feedback Visual: Um spinner ou indicador de progresso é exibido enquanto a autenticação está em processo.
  
Navegação entre Páginas:
- Transições Suaves: Ao navegar entre páginas, como de "Reservas" para "Perfil", utiliza-se animações de deslizamento ou desvanecimento para uma experiência fluida.
- Barra de Navegação: A página atual é destacada com uma animação de mudança de cor ou um efeito de sublinhado, facilitando a navegação.
  
Formulários e Validação:
- Validação em Tempo Real: Campos de entrada mostram animações ao interagir, com bordas vermelhas para erros e bordas verdes para sucesso.
- Transições de Sucesso: Após o envio de um formulário, uma animação de confirmação, como um "check" animado, aparece para indicar que a ação foi bem-sucedida.
  
Interações com Listagens:
- Efeitos de Hover: Itens na lista de quadras (como disponibilidade e preços) têm animações de destaque ao passar o mouse, como leve aumento ou mudança de cor.
- Expansão de Detalhes: Ao clicar em uma quadra, detalhes adicionais são exibidos com uma animação suave de expansão.
  
Feedback de Ações:
- Notificações: Mensagens de sucesso ou erro (por exemplo, reserva confirmada ou cancelada) aparecem como notificações animadas no canto da tela.
- Animações de Carregamento: Ao realizar ações que demandam tempo, como salvar uma reserva, uma animação de carregamento é exibida.
  
Responsividade:
- Adaptação de Layout: Ao redimensionar a tela, animações ajustam o layout, reorganizando elementos de forma suave.
- Menu Hambúrguer: Em dispositivos móveis, um menu hambúrguer é utilizado, com animação de deslizamento ao abrir.
  
Logout:
- Animação de Saída: Ao clicar em logout, a interface utiliza uma animação de desvanecimento, retornando à tela de login.
  
Conclusão

Essas interações e animações melhoram a experiência do usuário, tornando a aplicação mais envolvente e intuitiva, guiando o usuário de maneira clara durante o processo de reserva de quadras esportivas.


## Fluxo de Dados

Fluxo de Autenticação e Acesso a Recursos
Usuário Interage com o Front-End:

O usuário acessa a aplicação via navegador ou app móvel e insere suas credenciais para login.
Autenticação e Geração de Token:

O front-end envia as credenciais para a API de autenticação.
O back-end valida as credenciais e, se corretas, gera um token JWT, que é enviado de volta e armazenado de forma segura (preferencialmente em um cookie).
Acesso a Recursos Protegidos:

O front-end inclui o token JWT nas requisições subsequentes para acessar recursos protegidos.
Processamento de Requisições no Back-End:

O back-end valida o token e, se válido, executa operações (como criar, ler, atualizar ou excluir dados) interagindo com o banco de dados.
Resposta ao Front-End:

O back-end retorna os dados solicitados ou confirmações de operações realizadas.
Exibição de Dados no Front-End:

O front-end recebe e exibe os dados ao usuário, atualizando a interface.
Monitoramento e Logs:

O back-end registra eventos e erros para monitoramento e auditoria, incluindo logs de acesso e tentativas de autenticação.
Gerenciamento de Sessões e Logout:

O usuário pode solicitar logout, removendo o token e invalidando a sessão no back-end, se necessário.
Conclusão
Esse fluxo detalha como as informações circulam entre o usuário, front-end, back-end e banco de dados, enfatizando a importância da autenticação, autorização e validação em cada etapa. 




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


Para garantir a segurança de uma aplicação distribuída no front-end, siga estas recomendações:

-  Autenticação Segura: Armazene tokens JWT em cookies seguros (HttpOnly e Secure) e implemente expiração de tokens.
-  Proteção Contra XSS: Use bibliotecas como DOMPurify para sanitizar entradas e saídas, e implemente uma política de segurança de conteúdo (CSP).
-  Comunicação Segura: Utilize HTTPS para proteger dados em trânsito.
-  Validação de Dados: Valide dados no front-end e no servidor.
- Gerenciamento de Sessões: Implemente timeout de sessão para desconectar usuários inativos.
-  Controle de Acesso: Aplique o princípio do menor privilégio nas exibições de informações e funcionalidades.
- Proteção Contra Clickjacking: Use cabeçalhos HTTP como X-Frame-Options.
- Segurança de APIs: Configure CORS de maneira restritiva para permitir apenas origens confiáveis.

## Implantação
### 1. Definir os Requisitos de Hardware e Software:
### Hardware:

#### Aplicação Web e Mobile:
Serviços de front-end podem ser hospedados em servidores web com capacidade suficiente para suportar a carga esperada de usuários. Requisitos típicos:
2 a 4 vCPUs.
4 a 8 GB de RAM.
Armazenamento SSD de alta performance para servir rapidamente os arquivos de front-end (TypeScript, CSS, JS).

#### ECS (Serviços Backend):

#### Servidores para os serviços ECS:
Pelo menos 4 vCPUs e 8 GB de RAM para cada serviço Java (gestão de quadras, agendamento de quadras, gestão de usuários).
Auto scaling habilitado para ajustar o número de instâncias conforme a demanda.

### RDS (Banco de Dados):

#### PostgreSQL rodando no RDS:
2 a 4 vCPUs com 8 a 16 GB de RAM (dependendo do volume de dados e consultas).
Armazenamento provisionado de alta performance (IOPS) para garantir baixo tempo de resposta nas transações.

#### Software:

#### Frontend (Aplicação Mobile e Web):
React Native (mobile) e tecnologias web padrão React com TypeScript.
Ferramentas de build para empacotar o app e prepará-lo para produção.

#### Backend (ECS):
Serviços Java rodando em contêineres Docker.
AWS ECS para orquestração de contêineres.

#### Banco de Dados:
PostgreSQL rodando em instâncias RDS da AWS.

### 2. Escolher uma Plataforma de Hospedagem:

#### AWS Cloud:
Utilizar AWS Elastic Beanstalk ou Amazon ECS para gerenciar a aplicação backend, aproveitando a integração com o RDS e serviços gerenciados da AWS.
Amazon API Gateway para servir de ponto de entrada para todas as requisições entre o front-end e os serviços backend.
Amazon S3 para armazenar o front-end estático da aplicação web.
RDS PostgreSQL para banco de dados, aproveitando a alta disponibilidade, backup automático e escalabilidade.
AWS CloudFront para cache e distribuição global de conteúdo.

### 3. Configurar o Ambiente de Implantação:

##### Instalar Dependências (ECS):
Configurar as imagens Docker dos serviços Java para serem construídas automaticamente a partir de um repositório Git (usando um CI/CD como AWS CodePipeline ou Jenkins).
Instalar as dependências Java e bibliotecas utilizadas pelos microserviços.
Configurar e definir os recursos no ECS, especificando o cluster de instâncias EC2 ou usar Fargate para contêineres serverless.

#### Configurar Variáveis de Ambiente:
Definir variáveis de ambiente para conectar aos serviços RDS (credenciais de banco de dados, URL de conexão, etc.).
Usar AWS Secrets Manager para gerenciar e proteger variáveis sensíveis, como chaves de API, credenciais e senhas.

#### Configurar o API Gateway:
Configurar roteamento e mapeamento de endpoints da API.
Habilitar autenticação e throttling para controle de requisições.

### 4. Fazer o Deploy da Aplicação:

#### Frontend (Web/Mobile):
Publicar a aplicação web estática no S3 e configurar o CloudFront para distribuição.
Compilar a aplicação mobile (React Native) para iOS/Android e publicá-la.

#### Backend (Microserviços):
Utilizar o AWS ECS para fazer o deploy dos contêineres backend, garantindo que cada serviço Java esteja devidamente escalado e monitorado.
Verificar se os contêineres têm comunicação com o RDS e que as instâncias de banco estão configuradas corretamente.

### 5. Testes no Ambiente de Produção:
#### Testes de Funcionalidade:
Realizar testes manuais e automáticos para garantir que as funcionalidades (gestão de quadras, agendamentos, gestão de usuários) estão funcionando como esperado.

#### Testes de Carga e Desempenho:
Usar ferramentas como Apache JMeter ou Locust para simular uma alta carga e verificar como os serviços backend (ECS) e o banco de dados (RDS) lidam com o aumento do tráfego.
Monitoramento:
Configurar AWS CloudWatch para monitorar o desempenho dos serviços, verificar logs de erros e métricas de consumo de recursos (CPU, memória, IOPS).
Configurar alertas para detectar problemas em tempo real.

## Testes
### Métodologias Adotadas
- Testes Unitários: Validar o funcionamento correto de funções e métodos isolados
- Testes de Integração: Garantir que diferentes módulos funcionem bem juntos
- Testes Funcionais: Verificar se o sistema atende aos requisitos funcionais
- Testes de Interface do Usuário (UI): Avaliar a funcionalidade e usabilidade dos elementos visuais para uma boa experiência do usuário

### Histórias SMART

1. **Cadastro de Usuário**  
   Como um novo usuário do sistema, desejo me cadastrar preenchendo todas as informações obrigatórias, para que eu possa acessar a plataforma e realizar agendamentos de quadras.

2. **Login**  
   Como um usuário registrado, desejo fazer login no sistema usando meu e-mail e senha, para acessar minha conta e gerenciar meus agendamentos.

3. **Agendamento de Quadra**  
   Como um usuário autenticado, desejo agendar uma quadra em uma data e horário específicos, para garantir o uso exclusivo da quadra no período selecionado.

4. **Cancelamento de Agendamento**  
   Como um usuário autenticado, desejo cancelar um agendamento previamente feito, para liberar o horário e evitar cobranças desnecessárias.

5. **Reagendamento de Quadra**  
   Como um usuário autenticado, desejo reagendar um horário para uma quadra reservada, para ajustar a reserva de acordo com minha disponibilidade.

6. **Consulta de Quadras Disponíveis**  
   Como um usuário do sistema, desejo consultar quadras disponíveis filtrando por localidade e tipo, para escolher uma quadra que melhor atenda às minhas necessidades.

7. **Testes de Interface**  
   Como um usuário, desejo que os elementos de interface funcionem corretamente, para navegar e utilizar a aplicação sem dificuldades.

8. **Testes de Desempenho**  
   Como administrador do sistema, desejo que a aplicação suporte múltiplos acessos simultâneos, para garantir a estabilidade do sistema em horários de pico.

### Casos de Teste

1. **Cadastro de Usuário**
   - **Dado** que estou na tela de cadastro de usuário,  
     **Quando** eu preencho todos os campos obrigatórios corretamente e clico em "Cadastrar",  
     **Então** o sistema deve exibir uma mensagem de sucesso e criar minha conta.

   - **Dado** que estou na tela de cadastro de usuário,  
     **Quando** eu deixo algum campo obrigatório vazio ou insiro informações inválidas,  
     **Então** o sistema deve exibir mensagens de erro indicando os campos que precisam ser corrigidos.

2. **Login**
   - **Dado** que estou na tela de login,  
     **Quando** eu insiro credenciais válidas e clico em "Entrar",  
     **Então** o sistema deve me redirecionar para a página inicial da minha conta.

   - **Dado** que estou na tela de login,  
     **Quando** eu insiro credenciais inválidas e clico em "Entrar",  
     **Então** o sistema deve exibir uma mensagem de erro indicando que as credenciais estão incorretas.

3. **Agendamento de Quadra**
   - **Dado** que estou logado e na página de quadras disponíveis,  
     **Quando** seleciono uma quadra, escolho uma data e horário disponíveis e clico em "Confirmar",  
     **Então** o sistema deve exibir uma mensagem de confirmação e registrar o agendamento.

   - **Dado** que estou logado e na página de quadras disponíveis,  
     **Quando** tento agendar uma quadra em um horário já reservado,  
     **Então** o sistema deve exibir uma mensagem de erro indicando indisponibilidade.

4. **Cancelamento de Agendamento**
   - **Dado** que estou logado e na página de meus agendamentos,  
     **Quando** seleciono um agendamento existente e clico em "Cancelar",  
     **Então** o sistema deve exibir uma mensagem de confirmação e atualizar o status do agendamento para "CANCELADO".

5. **Reagendamento de Quadra**
   - **Dado** que estou logado e na página de meus agendamentos,  
     **Quando** escolho um agendamento e modifico a data e horário para uma nova disponibilidade,  
     **Então** o sistema deve salvar as alterações e exibir uma mensagem de confirmação de reagendamento.

6. **Consulta de Quadras Disponíveis**
   - **Dado** que estou na página de consulta de quadras,  
     **Quando** seleciono filtros de localidade e tipo e clico em "Buscar",  
     **Então** o sistema deve exibir uma lista de quadras disponíveis que correspondam aos critérios selecionados.

7. **Testes de Interface**
   - **Dado** que estou navegando na aplicação,  
     **Quando** clico em botões e links e interajo com os campos,  
     **Então** todos os elementos da interface devem responder conforme esperado, sem erros de navegação ou carregamento.

8. **Testes de Desempenho**
   - **Dado** que o sistema está em um ambiente de testes de carga,  
     **Quando** simulo acessos simultâneos de múltiplos usuários realizando login e agendamentos,  
     **Então** o sistema deve responder dentro de um tempo aceitável e manter a estabilidade sem falhas.

