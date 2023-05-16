programa
{
	
	funcao inicio()
	{
		inteiro listaDeNumeros[10] = {2,5,1,3,4,9,7,8,10,6}
		inteiro contadorInterno, contadorExterno, troca = 0

		para(contadorExterno = 0; contadorExterno<10;contadorExterno++)
		{
			para(contadorInterno = 0; contadorInterno<9;contadorInterno++){
				escreva("comparando",listaDeNumeros[contadorInterno], " X ", listaDeNumeros[contadorInterno+1], "\n")
				se(listaDeNumeros[contadorInterno]<listaDeNumeros[contadorInterno+1]){
					troca = listaDeNumeros[contadorInterno]
					listaDeNumeros[contadorInterno] = listaDeNumeros[contadorInterno+1]
					listaDeNumeros[contadorInterno+1] = troca
				}
			}
		}
		para(contadorExterno = 0;contadorExterno<10;contadorExterno++){
		escreva(listaDeNumeros[contadorExterno], ",")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
