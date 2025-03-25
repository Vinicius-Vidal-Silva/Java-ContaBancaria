package banco;

import java.util.Scanner;

public class ContaTerminal {
	static Scanner sc = new Scanner(System.in);
	
	static Integer pegarNumero(Integer numero) {
		System.out.println("Entre com o numero da conta:");
		numero = sc.nextInt();
		return numero;
	}
	
	static String pegarAgencia(String agencia) {
		System.out.println("Entre com o numero da agencia:");
		agencia = sc.next();
		return agencia;
	}
	
	static String pegarNome(String nomeCliente) {
		System.out.println("Entre com o seu nome: ");
		nomeCliente = sc.next();
		return nomeCliente;
	}
	
	static Float pegarSaldo(Float saldo) {
		System.out.println("Entre com o saldo: ");
		saldo = sc.nextFloat();
		return saldo;
	}
	
	public static void main(String[] args) {
		Integer numero = 0;
		String agencia = "";
		String nomeCliente = "";
		Float saldo =  0.0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao banco quero-tudo-o-que-é-seu!");
		numero = ContaTerminal.pegarNumero(numero);
		agencia = ContaTerminal.pegarAgencia(agencia);
		nomeCliente = ContaTerminal.pegarNome(nomeCliente);
		saldo = ContaTerminal.pegarSaldo(saldo);
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
	}
	
}

