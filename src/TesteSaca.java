
public class TesteSaca {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(122, 1234);
		conta.deposita(100.0);
		try {
			conta.saca(120.0);
		}
		catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
	}	
}
