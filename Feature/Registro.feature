#language: pt
#coding: utf-8

Funcionalidade: Registar usuario no aplicativo

Contexto: 
Dado que o usuario esteja na pagina inicial
Quando usuario navegar para a pagina de registro

@RegisterTest @Valido
Cenario: Registra usuario valido 
E usuario preencher os campos com dados validos
E clicar no botao registrar
Entao usuario sera registrado com sucesso



