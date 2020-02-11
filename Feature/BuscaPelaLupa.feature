#language:pt
#coding: utf-8

Funcionalidade: Buscar produto por texto no aplicativo

Contexto: 
Dado que o usuario esteja na pagina inicial

@BuscaPelaLupa @Valido
Cenario: Buscar produto por texto valido 
Quando usuario buscar na barra de pesquisa por produto valido
E usuario clica no produto 
Entao o produto sera exibido na tela

@BuscaPelaLupa @Invalido
Cenario: Buscar produto por texto invalido
Quando usuario buscar na barra de pesquisa por produto invalido
Entao Nenhum resultado sera exibido
