
public class TestaConexao {
	
	public static void main(String[] args) {
				
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Falha na conex�o");
		} finally {
			con.fecha();
		}		
	}	
}
