#language:pt
#coding: utf-8

Funcionalidade: Buscar produto pela tela inicial no aplicativo

Contexto: 
Dado que o usuario esteja na pagina inicial

@BuscaPelaHome @Valido
Cenario: Busca produto pela tela inicial valido
Quando usuario clicar na categoria desejada
E usuario clicar no produto desejado
Entao A pagina do produto escolhido sera exibida na tela

@BuscaPelaHome @Invalido
Cenario: Busca produto pela tela inicial invalido
Quando usuario clicar na categoria escolhida
E filtrar a busca 
Entao Nenhum produto sera exibido

