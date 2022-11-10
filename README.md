# library-project :books:
``Library`` projeta um sistema de uso de uma biblioteca virtual, podendo ser acessada por acessos de administradores ou usuários.

## Sumário

1. [Especificações de Requisitos do Usuário](#Especificações-de-Requisitos-do-Usuário);
2. [Especificações de Requisitos do Administrador](#Especificações-de-Requisitos-do-Administrador).

## Especificações de Requisitos do Usuário

### Autenticação :closed_lock_with_key:
**_Usuário pode efetuar login no sistema utilizando nome de usuário e senha;_**
- O sistema deve notificar login reconhecido ou não.

### Funcionalidades :hammer:
O que usuários podem fazer?
1. Solicitar empréstimo de livro;
2. Solicitar empréstimo de exemplar;
3. Visualizar empréstimos realizados;
4. Visualizar multas;
5. Solicitar renovação de empréstimo;
6. Devolver livro e/ou exemplar.

> 01: Solicitar empréstimo de livro

**_Usuário pode solicitar empréstimo de livro;_**
- O sistema deve verificar a elegibilidade do usuário para empréstimo;
- O usuário deve digitar o código do livro para empréstimo;
- O usuário tem um prazo de 15 dias para realizar a devolução do livro;
- O livro só poderá ser emprestado se possuir uma quantidade maior que 1 no acervo da biblioteca.

> 02: Solicitar empréstimo de exemplar

**_Usuário pode solicitar empréstimo de exemplar;_**
- O sistema deve verificar a elegibilidade do usuário para empréstimo;
- O usuário deve digitar o código do exemplar para empréstimo.

> 03: Visualizar empréstimos realizados

**_Usuário pode visualizar empréstimos realizados com status de cada empréstimo (devolvido, emprestado, atrasado);_**
- O sistema deve mostrar o histórico de realizações de empréstimo do usuário;
- O sistema deve mostrar o status de cada empréstimo realizado;
- O sistema deve mostrar o tipo de documento emprestado - livro ou exemplar;
- O sistema deve mostrar o prazo referente ao status.

> 04: Visualizar multas

_**Usuário pode visualizar multas e sua situação (paga, aberta)**_
- O sistema deve verificar e mostrar o status das multas: se foram pagadas ou não;
- O usuário pode escolher o código da multa que deseja pagar;
- O sistema deve retornar mensagem de "Multa já paga", caso a multa escolhida já esteja paga;
- O sistema deve mostrar métodos de pagamento para efetuar a transferência (GRU, Cartão de Crédito ou Débito)
- O sistema deve pedir o CPF para o caso de pagamento por GRU;
- O sistema deve pedir as informações do Cartão de Crédito, para o caso de pagamento por Cartão de Crédito;
- O sistema deve pedir as informações do Cartão de Débito, para o caso de pagamento por Cartão de Débito;
- O sistema deve modificar o status da multa e informar. ao usuário, o código da multa e o valor que foi descontado.

> 05: Solicitar renovação de empréstimo

**_Usuário pode renovar empréstimo previamente efetuado;_**
- O sistema deve verificar se a data de devolução prevista é equivalente à data atual;
- O sistema deve verificar se o usuário não possui multas ativas em histórico de empréstimos.

> 06: Devolver livro e/ou exemplar

_**Usuário deve retornar o livro e/ou exemplar para o acervo da biblioteca;**_
- O usuário deverá informar o código do livro (ISBN) para devolução ao acervo.
- O usuário terá uma multa de R$ 3,00/dia, caso ultrapasse o prazo de 15 dias para a devolução do livro;
- O sistema deve informar se houver atraso e o valor total da multa.


## Especificações de Requisitos do Administrador

### Autenticação :closed_lock_with_key:
**_Administrador pode efetuar login no sistema utilizando nome de usuário e senha;_**
- O sistema deve notificar login reconhecido ou não.

### Funcionalidades :hammer:
**_Admnistrador pode efetuar as ações de..._**
1. Realizar cadastro de livros;
2. Realizar cadastro de exemplares;
3. Visualizar o perfil do usuário (dados pessoais, histórico de empréstimos e multas);
4. Realizar consultas de livros no acervo da biblioteca;
5. Visualizar livros e exemplares próximos da data de devolução;
6. Cadastrar usuário no sistema.

> 01, 02: Realizar cadastro de livros e exemplares

**_Administrador pode cadastrar livros no sistema enviando os dados de ISBN, titulo, autor/autores, editora, ano, número de páginas e quantidade;_**
- O ISBN será válido se possuir 13 dígitos, para livros atribuído após 1 de Janeiro de 2007, e 10 dígitos se atribuído antes de 2007;
- O ano de registro posterior ao ano atual, não será válido;
- O sistema deve notificar indicando caso o livro de cadastro (com o mesmo código) já conste no sistema;

> 03: Visualizar o perfil do usuário (dados pessoais, histórico de empréstimos e multas)
**_Administrador pode verificar a situação do usuário enviando o nome de usuário;_**
- O administrador pode realizar consultas para verificar a situação do usuário, se ele possui multas e/ou histórico de empréstimos).

> 04: Realizar consultas de livros no acervo da biblioteca
**_Administrador pode realizar consultas de livros no acervo pesquisando pelo ISBN do livro (código);_**
- O sistema deverá notificar o status do livro pesquisado (ativo, emprestado, inativo).

> 05: Visualizar livros e exemplares próximos da data de devolução
**_Administrador pode visualizar todos os livros próximos da data de devolução no período de 5 dias;_**
- O sistema deverá verificar todos os livros com previsão de devolução da data atual a 5 dias e printar as informações do livro e usuário em questão.

> 06: Cadastrar usuário no sistema
**_Administrador pode cadastrar usuário no sistema enviando os dados de nome, nome de usuário, e-mail e senha;_**
- O e-mail de cadastro é válido contendo "." (ponto) e domínios como (gmail.com, hotmail.com, outlook.com);
- A senha de cadastro é válida contendo mais de 5 caracteres;
- O nome é válido contendo um espaço e mais de 5 caraceteres;
- O nome de usuário é válido sem "_" (espaço) e sem letras maiúsculas (ASADOWISGBFVKJXCN);
- O sistema deve notificar indicando para o login caso o e-mail de cadastro já conste no sistema;
- O sistema deve notificar cadastro reconhecido ou não.

## Licença

Esse projeto é licenciado com MIT License.





    








