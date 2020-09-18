
public class TestaConexao {
	
	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()){
			con.leDados();
		}
		catch(IllegalStateException ex){
			System.out.println("Falha na conex�o");
		}
		
		/*Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Falha na conex�o");
		} finally {
			con.fecha();
		}*/		
	}	
}
