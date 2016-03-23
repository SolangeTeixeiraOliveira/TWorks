package TWorks;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;

public class Main {
//	public static void main(String[] args){

		// PRIMEIRA ETAPA
		//	ler linha
		//	quebrar linha por : [posicao 0 sera tipo consumidor, posicao 1 dias da semana]
		//	identifica tipo consumudor
		//	quebrar dias da semana por , [cada posicao é um dia da semana]
	
		//Read file
	private void main() throws Exception
	{
		try
		{
			FileReader file = new FileReader("data.txt");
			BufferedReader readFile = new BufferedReader(file);
			String line = readFile.readLine();//read firstline
			String[] fields;

			fields = line.split(";");
			String customerType;
			fields = line.split(",");
			Date date;

			while(line != null){
				System.out.printf("%s\n", line);
				line = readFile.readLine();//read until end the line
			}
			file.close();
		}catch (IOException e){
			System.out.printf("error to open file:%s.\n", e.getMessage());
		}
		System.out.println();

	}
}

//> main
//cria uma lista hoteis
//cria uma lista de inputs
//chama o metodo adicionarHoteis
//chama o metodo lerArquivo
//chama o metodo calculaMelhor
//chama o metodo exibirResultados
//
//> metodo adicionarHoteis
//adiciona cada hotel à lista lista.add(new Hotel(parametros));
//
//> metodo lerArquivo
//- ler cada linha do arquivo
//- adiciona cada customer na lista de customer com suas quantidades de dias
//
//> metodo calcularMelhor
//- faz o calculo do melhor para cada customer e coloca os valores de preco e nome do hotel
//
//> metodo exibirResultados
//- faz a exportação (output) de resultados
