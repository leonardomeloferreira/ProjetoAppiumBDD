#language: pt
#coding: utf-8

Funcionalidade: Registar usuario no aplicativo

Contexto: 
Dado que o usuario esteja na pagina inicial
Quando usuario navegar para a pagina de registro

@TesteDeRegistro @Valido
Cenario: Registra usuario valido 
E usuario preencher os campos com dados validos
E clicar no botao registrar
Entao usuario sera registrado com sucesso

@TesteDeRegistro @Invalido
Cenario: Nao registrar usuario com dados invalidos
E usuario preencher os campos com dados invalidos
Entao botao registrar estara indisponivel

