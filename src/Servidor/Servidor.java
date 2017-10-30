package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8798);
		String receptor = null;
		
		try {
			System.out.println("Aguardando conexão na porta 8798");
			Socket cliente = serverSocket.accept();
			
			traduz(cliente);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void traduz(Socket cliente) {
		new Thread() {
			
			public void run() {
				try {
				
					Scanner entrada = new Scanner(cliente.getInputStream());
					String linha = entrada.nextLine();
					linha = linha.toLowerCase().toString();
					System.out.println("Requisição recebida "+linha);
					
					char[] letras = linha.toCharArray();					
					
					for (int i = 0; i < letras.length; i++) {
						switch (letras[i]) {
						case 'a':
							System.out.print(".- ");
						case 'b':
							System.out.print("-... ");
							break;
						case 'c':
							System.out.print("-.-. ");
							break;
						case 'd':
							System.out.print("-.. ");
							break;
						case 'e':
							System.out.print(". ");
							break;
						case 'f':
							System.out.print("..-. ");
							break;
						case 'g':
							System.out.print("--. ");
							break;
						case 'h':
							System.out.print(".... ");
							break;
						case 'i':
							System.out.print(".. ");
							break;
						case 'j':
							System.out.print(".--- ");
							break;
						case 'k':
							System.out.print("-.- ");
							break;
						case 'l':
							System.out.print(".-.. ");
							break;
						case 'm':
							System.out.print("-- ");
							break;
						case 'n':
							System.out.print("-. ");
							break;
						case 'o':
							System.out.print("--- ");
							break;
						case 'p':
							System.out.print(".--. ");
							break;
						case 'q':
							System.out.print("--.- ");
							break;
						case 'r':
							System.out.print(".-. ");
							break;
						case 's':
							System.out.print("... ");
							break;
						case 't':
							System.out.print("- ");
							break;
						case 'u':
							System.out.print("..- ");
							break;
						case 'v':
							System.out.print("...- ");
							break;
						case 'w':
							System.out.print(".-- ");
							break;
						case 'x':
							System.out.print("-..- ");
							break;
						case 'y':
							System.out.print("-.-- ");
							break;
						case 'z':
							System.out.print("--.. ");
							break;
						default:
							break;
						}
						//SEPARA AS PALAVRAS
						if (letras[i] == ' ') {
							System.out.print("   ");
						}
					}
				
				} catch (IOException e) {					
					e.printStackTrace();
				}
			};
		}.start();
	}

}
