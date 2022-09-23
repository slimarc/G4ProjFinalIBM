<h2 align="center">
    Desafio Final - Programa If Black Then Code - Gama Academy & IBM
    <br>
    Grupo Panteras Negras
</h2>
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>
<h2 align= "center" >
    API - Hello Bank 
</h2>

<p align="center">
<img align="center" src="https://www.numeroserviceclient.fr/wp-content/uploads/2021/06/numero-service-client-hello-bank.jpg" style="width: 40%;" alt="Capa">
</p>

<p align="center"> Plataforma de gerenciamento de transações bancárias. </p>
    
## 👨🏻‍💻 Sobre o projeto

<p> A proposta deste desafio final é a criação de uma aplicação que realiza transações bancárias. Dessa forma devemos fazer cadastro de novos clientes e de seus dados pessoais e de contato, atrelar ao cadastro do cliente uma conta bancária e registrar todas as transações realizadas entre contas deste sistema.</p>

<h2>🏆 DevTeam: </h2>

<br>

<table>
  <tr>
  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/85911861?v=4" 
  alt="Cássia Leal"/><br /><sub><b>Cássia Leal</b></sub></a><br />
  <a href="https://www.linkedin.com/in/cassia-leal/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://https://www.linkedin.com/in/cassia-leal/"  style= "width:90px;"/>
  </a>

  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/93914935?v=4"
  alt="Ricardo Lima"/><br /><sub><b>Ricardo Lima</b></sub></a><br />
  <a href="https://www.linkedin.com/in/slimarc/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/slimarc/" style= "width:90px;"/>
  </a>

   
  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/69278952?v=4"
  alt="Kyara Cardozo"/><br /><sub><b>Kyara Cardozo</b></sub></a><br />
  <a href="https://www.linkedin.com/in/kyara-cardozo/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/kyara-cardozo/" style= "width:90px;"/>
  </a>
 
  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/109994910?v=4"
  alt="Lucas Gomes"/><br /><sub><b>Lucas Gomes</b></sub></a><br />
  <a href="https://www.linkedin.com/in/lucas-gomesprf/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/lucas-gomesprf/" style= "width:90px;"/>
  </a>
  
  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/84542588?v=4"
  alt="Maryjane Ifunanya"/><br /><sub><b>Maryjane Ifunanya</b></sub></a><br />
  <a href="https://www.linkedin.com/in/maryjane-ifunanya-500287209/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/maryjane-ifunanya-500287209/" style= "width:90px;"/>
  </a>

</table>
   
   
## Metodologias Ágeis

<p> Como método de organização utilizamos o método Kanban através de um quadro no Trello, onde foi feito o backlog das tarefas principais, aplicação de padrão TO DO, DOING e DONE, e ainda definição de datas de entrega, checklists e tags de prioridade.

- [Trello](https://trello.com/invite/b/8Iur712m/2e336a9794f586b869820f1fe37ac065/proj-final-ibm-grupo-04)

</p>

## Back-end

<p>Nosso back-end é formado por um banco de dados para o armazenamento de cadastro de clientes e seus respectivos dados pessoais e de conta bancária, 
e uma API para cadastro, atualização, listagem e exclusão de clientes e/ou contas, bem como armazenamento do histórico de transações entre contas e extrato de conta. </p>

### 🚀 Tecnologias

- [JAVA](https://www.java.com)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)

### ⚙️ Funcionalidades
- Criação de conta bancária;
- Operações de depósito, saque e transferência entre contas;
- Resumo de transações entre contas bancárias;
- Extrato da conta;

## Deploy

<p>Nosso deploy foi feito localmente.</p>

### 🚀 Tecnologias

- [Jenkins](https://www.jenkins.io/)
- [Docker](https://hub.docker.com/)

## Como executar?

### Clonar o repositório:
<p>Para executar o projeto, basta realizar o clone do repositório utilizando o comando:</p>
    
``` 
./run.sh
```


## Endpoints

<p> Para acessar a página de documentação dos endpoints com mais detalhes, <a href="https://documenter.getpostman.com/view/22864114/2s7ZE2r5DL" target="_blank"> clique aqui </a>.
</p>

## Clientes
    
<p> Cadastrar Cliente (POST)
  
    localhost:8080/cliente/create
    
O modelo Json para este método é:

    {
        "nome": "Teste new", 
        "cpf": "994.513.560-02",
        "rg":"30.315.318-0",
        "telefone":"(71)98222-2222",
        "email":"testenew@gmail.com"
    }
  
Listar Cliente (GET)

    localhost:8080/cliente/lista
    
Listar Cliente pelo ID (GET)

    localhost:8080/cliente/{contaId}
          
Excluir Cliente (DELETE)
   
    localhost:8080/cliente/{clienteId}
    

Alterar Cliente (PUT)

    localhost:8080/cliente/update/{contaId}

O modelo Json para este método é:

    {
        "nome": "Ricardo Lima", 
        "cpf": "983.101.240-23",
        "rg":"32.187.806-1",
        "telefone":"(71)98000-0000",
        "email":"ricardoteste@gmail.com"
    }
          
      
## Operações Bancárias

Despósito (POST)
        
    localhost:8080/operacao/deposito
 
O modelo Json para este método é:

    {
        "contaId": 2,
        "valor": 800
    }

Nova Transferência (POST)
 
    localhost:8080/operacao/transferencia

O modelo Json para este método é:

    {
        "saidaContaId": 2, 
        "recebeContaId": 5, 
        "valor": 350.00
    }
    
Novo Saque (POST)

    localhost:8080/operacao/saque

O modelo Json para este método é:

    {
        "contaId": 5,
        "valor": 50
    }
    
Listar Saldo da Conta (GET)
    
    localhost:8080/operacao/saldo/{contaId}
         
   
Listar Trasanções entre Contas (GET)
  
    localhost:8080/operacao/contaTransacoes/{contaId}


## Endereço
 
Cadastrar Endereço (POST)

    localhost:8080/enderecos/create

O modelo Json para este método é:

    {   
        "logradouro":"Logradouro teste",
        "numero":"74C",
        "bairro":"Bairo teste",
        "cidade":"Recife",
        "uf":"PE",
        "cep":"00000-000",
        "cliente": {
            "id": 2
            }
    }

Listar Endereços (GET)

    localhost:8080/enderecos
    
    
Listar Endereços por CEP (GET)

    localhost:8080/enderecos/{cep}

Alterando o  Endereço (PUT)
   
    localhost:8080/enderecos/update/{enderecoId}

O modelo Json para este método é:

    {
        "idEndereco": 18,
        "logradouro": "rua teste 1887",
        "numero": "31E",
        "bairro": "Bairro teste",
        "uf": "PE",
        "cep": "00000-000",
        "cliente": {
            "id": 5
            }
    }
        
Excluir Endereço (DELETE)
    
    localhost:8080/enderecos/delete/{enderecoId}
    
 ## Pipeline Jenkins
 
 <p>
    A pipeline foi desenvolvida com Jenkins rodando no localhost. 
    
    
    pipeline {
        agent any

        stages {
            stage('Git-Clone') {
                steps {
                    git url: "https://github.com/slimarc/G4ProjFinalIBM.git"
                }
            }

            stage('Clean') {
                steps {
                    bat "mvn clean"
                }
            }

            stage('Build') {
                steps {
                    bat "mvn package -Dmaven.test.skip"
                }
            }

            stage('Test') {
                steps {
                    bat "mvn test"
                }
            }

            stage('Prepara-Dockerfile'){
                steps{
                    bat "echo FROM openjdk:11-jdk > Dockerfile"
                    bat "echo COPY target/*.jar app.jar >> Dockerfile"
                    bat "echo ENTRYPOINT [\"java\",\"-jar\",\"/app.jar\"] >> Dockerfile"
                }
            }
            stage('Build-docker'){
                steps{
                    bat "docker build -t api-hellobank ."
                }
            }
            stage('Deploy'){
                steps{
                    bat "docker rm api-hellobank --force"
                    bat "docker run -d --net=host --env USER=ROOT --env PASSWORD=mysql --env HOST=172.27.208.1 --env DATABASE=hellobank -p 8080:8080 --name api-hellobank api-hellobank"
                }
            }

        }
    }
 </p>

![](.pipeline.png)

 <br>
 <h2>🎁 Agradecimentos </h2>
  <h4>Os Panteras Negras gostariam de agradeçer profundamente à IBM pela oportunidade gigante de fazermos parte deste lindo programa de treinamento, o If Black, Then Code. E que deu chance para nós, estudantes pretos(as) e pardos(as), de ampliarmos nossas habilidades, hard skills e soft skills, e assim nos qualificarmos na área de desenvolvimento Back End e DevOps (Java).
      Agradeçemos também à Gama Academy e seus Yellow Belts pelo apoio e atenção ao longo dessas 8 semanas de treinamento, e aos professores Isidro em suas espetaculares aulas assíncronas, Ricardo Alexandre Bontempo em suas suuuuper monitorias, e ao professor Danilo Aparecido pelas aulas incríveis de DevOps e suas dicas essenciais de mercado de trabalho. Todos foram incríveis!
  <h4>
    
<br>

<p align="center">
<img src="https://burnbook.b-cdn.net/wp-content/uploads/2022/03/uhdpaper.com-download-hd-7.2713-@9082647187720256697-1.jpg" style="width: 60%;" alt="Agradecimento"/>
</p>
 
<h4 align="center">
            Agora está na hora de mostrar ao mundo quem nós somos! - Pantera Negra, filme.
</h4>

