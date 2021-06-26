package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaTarefas = new ArrayList<>();
		String tarefa ="";
		int pontosTarefa = 0;
		boolean condicao = true;
		double valorTotalTarefa = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Digite sua tarefa:  ");
		tarefa = scan.next();
		
		System.out.println("Digite a pontuacao da tarefa:  ");
		pontosTarefa = scan.nextInt();
		
		
		
		valorTotalTarefa+= pontosTarefa; 
		
		String tarefafinal = " Nome: " +tarefa + "Qtdd";
		
		
		
		listaTarefas.add(tarefa);
		
		System.out.println("Deseja adicionar Tarefa ? S/N");
			String resposta = scan.next();
			if("N".equalsIgnoreCase(resposta))
				break;  
			
		}while(condicao);
		
		
		for(String tar: listaTarefas) {
			System.out.println(tar);
			}
//	
		
//		}
		
		System.out.println("Fechamento do dia  ? S/N");
		String resposta = scan.next();
		
		if("N".equalsIgnoreCase(resposta)) {
			System.out.println("Pontuacao das tarefas sao :" +valorTotalTarefa );
			
		}
		else {
				
				
			System.out.println("Pontuacao das tarefas sao :" +valorTotalTarefa );
		
		}
	

	}

}