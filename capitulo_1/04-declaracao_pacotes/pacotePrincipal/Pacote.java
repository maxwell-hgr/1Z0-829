package pacotePrincipal;


import java.util.*; // Import usando curinga
import java.sql.Date; // Import específico de Date, 'sobrepõe' o import do Date pelo curinga do pacote java.util

import pacoteSecundario.Leao; // Import do pacote criado por mim, seguindo estrutura de diretórios compatível

public class Pacote{
	private String campo; // Campo deve estar dentro de uma classe

	public String getCampo(){ // Método também deve estar dentro de uma classe
		return campo;
	}


	// Para compilar - javac pacotePrincipal/Pacote.java pacoteSecundario/Leao.java
	// Para rodar - java pacotePrincipal/Pacote

	// Para compilar e armazenar os arquivos .class em um diretório específico - javac -d classes pacotePrincipal/Pacote.java pacoteSecundario/Leao.java
	public static void main(String[] args){
		Leao leao = new Leao();

		System.out.println(leao.getNome()); // Executa o método público getNome da classe leão
	}
}