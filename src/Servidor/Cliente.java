package Servidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		Socket socket;
		Scanner teclado = new Scanner(System.in);
		try {
			socket = new Socket("192.168.15.8", 8798);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			System.out.println("Digite uma frase para ser traduzido em Codigo Morse");
			String frase = teclado.nextLine();
			
			out.println(frase);
			out.flush();
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
