package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisorE {
	public static void main(String[] args) {
		TelevisorEncapsulado tv = new TelevisorEncapsulado();
		
		int canal, volume, escolha;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Escolha seu canal de TV");
			canal = scan.nextInt();
			System.out.println("Escolha o nível do volume");
			volume = scan.nextInt();
			// atribuir os valores das variáveis ao atributo do obj
			tv.setCanal(canal);
			tv.setVolume(volume);
			// Menu de escolhas
			System.out.println("Faça sua escolha: "
					+ "\n(1) Escolher novo canal"
					+ "\n(2) Escolher novo volume"
					+ "\n(3) Aumentar volume"
					+ "\n(4) Diminuir volume"
					);
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Escolha novo canal de TV");
				canal = scan.nextInt();
				tv.setCanal(canal);
			} else if (escolha == 2) {
				System.out.println("Escolha novo volume");
				volume = scan.nextInt();
				tv.setVolume(volume);
			} else if (escolha==3) {
				System.out.println("Aumentando o volume...");
				tv.aumentarVolume();
			} else if (escolha==4) {
				System.out.println("Diminuindo o volume...");
				tv.diminuirVolume();
			} else {
				System.out.println("Escolha inválida (1-4)");
			}
			
			tv.mostrar();
		} catch (Exception e) {
			System.out.println("Formato incorreto.");
		}
	}
}
