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
[Descreva a modelagem da aplicação, incluindo a estrutura de dados, diagramas de classes ou entidades, e outras representações visuais relevantes.]

![Fluxograma (1)](https://github.com/user-attachments/assets/37e253b9-2710-4deb-a51a-f163de9d5770)

### A imagem mostra o diagrama de um banco de dados para um sistema de aluguel de quadras esportivas.

### Existem três tabelas:

Usuários Cadastro: Armazena informações sobre os usuários do sistema, como nome, CPF, data de criação, etc. Também define os tipos de usuários: "cliente" ou "administrador". Os administradores têm acesso a funcionalidades adicionais, como gerenciar quadras e usuários.

Quadra: Armazena informações sobre as quadras esportivas disponíveis para aluguel, como nome, tipo, localização, descrição, e se está disponível. Além disso, define as funções "verificarDisponibilidade" e "reservar".

Reserva: Armazena informações sobre as reservas feitas pelos usuários, como data da reserva, usuário que fez a reserva, quadra reservada, localização da reserva, e se está disponível para o usuário. Também define as funções "confirmar" e "cancelar".

As linhas que conectam as tabelas representam relacionamentos entre elas. Por exemplo, a tabela "Usuários Cadastro" tem uma relação com a tabela "Reserva" através do atributo "usuario".

As operações definidas para cada tabela permitem a manipulação dos dados do sistema. As operações "verificarDisponibilidade" e "reservar" na tabela "Quadra" permitem controlar a disponibilidade das quadras, enquanto as operações "confirmar" e "cancelar" na tabela "Reserva" permitem gerenciar as reservas.


![Diagrama de caso de uso (3)](https://github.com/user-attachments/assets/e821c5e2-ccd1-4865-af59-05eb631e4268)

O diagrama apresentado utiliza a notação Mermaid para descrever a estrutura de um sistema de gerenciamento de usuários e reservas de quadras esportivas. Aqui está uma explicação detalhada de cada componente:

Entidades

1. Usuários
Atributos:
id-usuario, cnpj, cpf, estado, nome, telefone, email, senha, dataCriacao, dataUltimaAtualizacao, dataDelecao.
Tipos: Clientes e administradores.
Métodos: cadastrar(), autenticar(), atualizarPerfil().
2. Quadras
Atributos:
id-quadra, nome, tipo, descricao, localizacao, disponibilidade.
Métodos: verificarDisponibilidade(), reservar().
3. Reservas
Atributos:
id-reserva, data, usuario, quadra, localizacao, disponibilidade.
Métodos: confirmar(), cancelar().
Relacionamentos
Usuários realizam várias reservas.
Usuários podem reservar várias quadras.
Cada reserva está ligada a uma quadra específica.
### Conclusão
Este modelo ilustra a interação entre usuários, quadras e reservas, servindo como base para o desenvolvimento do sistema.


## Projeto da Interface Web
[Descreva o projeto da interface Web da aplicação, incluindo o design visual, layout das páginas, interações do usuário e outros aspectos relevantes.]


### Wireframes
[Inclua os wireframes das páginas principais da interface, mostrando a disposição dos elementos na página.]

### Design Visual
[Descreva o estilo visual da interface, incluindo paleta de cores, tipografia, ícones e outros elementos gráficos.]

### Layout Responsivo
[Discuta como a interface será adaptada para diferentes tamanhos de tela e dispositivos.]

### Interações do Usuário
[Descreva as interações do usuário na interface, como animações, transições entre páginas e outras interações.]

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
