programa
{
	
	funcao inicio()
	{
		inteiro listaDeNumeros[10] = {2,5,1,3,4,9,7,8,10,6}
		inteiro soma=0, media, contador=0

		escreva("Elementos nos Indices Impares \n")
		para(contador = 0; contador <10;contador++){
			soma+=listaDeNumeros[contador]
			se(contador%2!=0){
				escreva(listaDeNumeros[contador],",")
			}
		}
		
		escreva("\nElementos Pares \n")
		para(contador = 0; contador <10;contador++){
			se(listaDeNumeros[contador]%2==0){
				escreva(listaDeNumeros[contador],",")
			}
		}

		media=soma/10
		escreva("\nSoma de Todos os Valores: ", soma)
		escreva("\nMedia dos elementos: ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 608; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */