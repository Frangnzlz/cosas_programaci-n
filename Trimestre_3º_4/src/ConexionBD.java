import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
	private static final String url = "jdbc:mysql://localhost:3306/Empresa";
	private static final String usuario = "root";
	private static final String contraseña = "";
	
	
	public static void main(String[] Args) {
		Connection conexion = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conexion = DriverManager.getConnection(url,usuario,contraseña);
			if(conexion!=null) {
				 System.out.println("Conexion exitosa a la base de datos");
			}
			
		}catch(Exception e) {
			
		}
		
	}
	
	
	
}
