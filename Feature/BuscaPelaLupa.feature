#language:pt
#coding: utf-8

Funcionalidade: Buscar produto por texto no aplicativo

Contexto: 
Dado que o usuario esteja na pagina inicial
Quando usuario clicar na caixa de texto

@BuscaPelaLupa @Valido
Cenario: Buscar produto por texto valido 
E usuario buscar por um produto valido
E usuario clica no produto 
Entao o produto sera exibido na tela

@BuscaPelaLupa @Invalido
Cenario: Buscar produto por texto invalido
E usuario buscar por produto invalido
Entao Nenhum resultado sera exibido
