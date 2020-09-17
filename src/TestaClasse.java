
public class TestaClasse {
	
	public static void main(String[] args) {
		Cliente alice = new Cliente();
		alice.setNome("Alice");
		alice.setCpf("22.222.222-22");
		alice.setProfissao("Desenvolvedora Java");
		
		Conta contaDaAlice = new Conta(1237, 59687);
		contaDaAlice.setTitular(alice);
		
		System.out.println(contaDaAlice.getTitular().getNome());
		
		Conta conta2 = new Conta(789,456);
		Conta conta3 = new Conta(78984, 45613);
		
		ContaCorrente cc = new ContaCorrente(459,789);
		cc.deposita(100);
		cc.transfere(10, contaDaAlice);
		System.out.println(cc.getSaldo());
		System.out.println(contaDaAlice.getSaldo());

				
	}
	
}
