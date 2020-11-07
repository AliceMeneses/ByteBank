package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Alice");
		cliente.setCpf("8798454");
		cliente.setProfissao("dev");
		
		ContaCorrente cc = new ContaCorrente(4597,8975);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contacorrente.bin"));
		oos.writeObject(cc);
		
		oos.close();
	}

}
