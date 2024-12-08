# Front-end Móvel

Front-end Móvel para Aplicação de Aluguel de Quadras Esportivas

 O projeto consiste no desenvolvimento do front-end de uma aplicação móvel que conecta usuários a quadras esportivas disponíveis para aluguel.
 O objetivo principal é criar uma interface intuitiva e responsiva, que facilite a busca e reserva de quadras esportivas para prática de diversas modalidades, como futebol, basquete e vôlei.

### Objetivos do Projeto
* Gestão de usuários: cadastros de usuários pelo app.
* Facilidade de uso: Proporcionar uma experiência fluida com navegação intuitiva e design amigável.
* Busca eficiente: Implementar filtros para localização, horários e tipos de quadra.
* Reservas rápidas: Permitir que usuários visualizem a disponibilidade e realizem reservas em poucos passos.
* Gestão de quadras: Facilitar o cadastro e a gestão de horários para proprietários de quadras.


## Tecnologias Utilizadas
* React Native: Base do desenvolvimento mobile.
* react-navigation: Gerenciamento de rotas e navegação.
* react-native-toast-message: Exibição de notificações de erro, sucesso ou informações.
* fetch: Para realizar chamadas à API.
* styled-components: Para estilização.
* react-hook-form: Para gerenciamento de formulários.
* yup: Validação de formulários.

## Arquitetura
A aplicação segue uma arquitetura modularizada, organizada em camadas para separar responsabilidades e facilitar a manutenção. Principais componentes:

#### Interface do Usuário
* Componentes reutilizáveis (botões, inputs, etc.) estilizados com styled-components.
* Telas organizadas por funcionalidades (ex.: Login, Cadastro, Home, Gerenciamento de Quadras).
* Navegação configurada com React Navigation (Stack, Tab e Drawer Navigation).

#### Lógica de Apresentação
* Uso de React Hooks para controle de estado local e efeitos.
* Validação de formulários com react-hook-form e yup.

#### Serviços
* Chamadas à API implementadas com fetch.

#### Persistência de Dados (Data Layer):
* Armazenamento local com AsyncStorage para informações leves (ex.: tokens).
* Integração com APIs RESTful para sincronização de dados com o backend.

## Modelagem da Aplicação
A imagem mostra o diagrama de um banco de dados do sistema de aluguel de quadras esportivas.
![Fluxograma (1)](https://github.com/user-attachments/assets/37e253b9-2710-4deb-a51a-f163de9d5770)

- Usuários Cadastro: Armazena informações sobre os usuários do sistema, como nome, CPF, data de criação, etc. Também define os tipos de usuários: "cliente" ou "administrador".
- Os administradores têm acesso a funcionalidades adicionais, como gerenciar quadras e usuários.
- Quadra: Armazena informações sobre as quadras esportivas disponíveis para aluguel, como nome, tipo, localização, descrição, e se está disponível.
- Além disso, define as funções "verificarDisponibilidade" e "reservar".
- Reserva: Armazena informações sobre as reservas feitas pelos usuários, como data da reserva, usuário que fez a reserva, quadra reservada, localização da reserva, e se está disponível para o usuário.
- Também define as funções "confirmar" e "cancelar".
- As linhas que conectam as tabelas representam relacionamentos entre elas.
- Por exemplo, a tabela "Usuários Cadastro" tem uma relação com a tabela "Reserva" através do atributo "usuario".

## Projeto da Interface
A interface móvel foi projetada com foco em uma experiência de usuário (UX) intuitiva e acessível, alinhada ao Material Design para garantir consistência visual e interatividade eficiente.

#### Design Visual
* Tema: Interface com estilo moderno e minimalista, usando cores escuras como fundo (dark mode) para destacar os elementos principais e proporcionar conforto visual.
 Paleta de cores:
* Fundo: Preto/Antracite.
* Botão principal: Azul vibrante (#007BFF), para chamar a atenção para ações importantes.
* Textos: Branco para legibilidade em contraste com o fundo escuro.
* Tipografia: Uso de fonte serifada elegante para o título (“QUADDRA”), contrastando com fontes sans-serif para textos secundários e botões.
  
### Layout das Páginas
#### Tela Inicial
* Logo e título: Nome da aplicação destacado na parte superior da tela.
* Mensagem de boas-vindas: Texto centralizado que indica a funcionalidade principal (“Gerencie suas quadras de qualquer lugar!”) e um subtítulo menor (“Faça login para começar”).
* Botão de ação: Botão grande e centralizado, com label "Acessar", projetado para facilitar a navegação para a tela de login.
  
![Captura de tela 2024-12-08 154801](https://github.com/user-attachments/assets/ef591c4a-6e46-4d26-8113-9187a164f0ed)

#### Tela de Login
* Campos para entrada de e-mail e senha com validação visual de erros.
* Botão de “Cadastrar” para novos usuários.
  
![login](https://github.com/user-attachments/assets/64970f49-e011-4353-be45-6dbb58355ad5)

#### Tela de cadastro
* Redirecionamento para tela de login após fazer cadastro.
* Validação dos campos de input

![cadastro](https://github.com/user-attachments/assets/9a957e87-6fb0-46b8-9a5c-1609007641ac)

#### Home
* Acessar agendamentos.
* Acessar perfil.

![home](https://github.com/user-attachments/assets/a0871ac7-5816-45ae-b84a-398740e88ffb)

#### Atualizar perfil
* Recuperação de informações.
* Validação de senha.

![atualizar perfil](https://github.com/user-attachments/assets/37550848-95c2-4fd1-b0af-ed0e366e3128)

#### Agendamentos
* Gestão de agendamentos.
* Alterar data e hora.
* Cancelar agendamento.

![agendamentos](https://github.com/user-attachments/assets/ebf2b4ba-c305-450e-bb19-27c3df3a013b)

## Fluxo de Dados
#### 1. Entrada de Dados
Usuário insere informações via interface:
Exemplo: Formulários de login, perfil e cadastro.
Os dados inseridos são validados localmente usando bibliotecas como react-hook-form e yup.

#### 2. Processamento e Envio para o Backend
Após a validação, os dados são enviados ao backend via chamadas HTTP.
fetch para requisições assíncronas (ex.: POST /login, POST /agendamento).
Estrutura JSON para envio e recebimento de dados.

#### 3. Processamento no Backend
O backend, implementado em Java/Spring Boot, processa os dados recebidos:
Autenticação de usuários.
Armazenamento e consulta em banco de dados.
Respostas formatadas em JSON para o app.

#### 4. Resposta e Atualização da Interface
O backend retorna uma resposta HTTP com o status da operação:
200 OK: Dados válidos e operação concluída.
400 Bad Request: Erro de validação ou entrada inválida.
O app processa a resposta e atualiza o estado da aplicação usando React Hooks, refletindo as alterações na interface.

#### 5. Persistência de Dados Local
Alguns dados são armazenados localmente para melhorar a experiência do usuário, como:
Tokens de autenticação em AsyncStorage.

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

### Métodologias Adotadas
- Testes de Integração: Garantir que diferentes módulos funcionem bem juntos
- Testes Funcionais: Verificar se o sistema atende aos requisitos funcionais
- Testes de Interface do Usuário (UI): Avaliar a funcionalidade e usabilidade dos elementos visuais para uma boa experiência do usuário


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

