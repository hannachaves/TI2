import java.sql.Connection;

class classX {
	private DAO[] array; 
	private int n;
	private String usuario;
	public classX(int cont) {
		array = new DAO[cont];
		n = 0;
	}
}

public class DAO {
	private Connection pessoa;
	
	public DAO() {
		pessoa = null;
	}
}