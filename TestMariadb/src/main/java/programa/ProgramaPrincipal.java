package programa;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.mariadb.jdbc.Connection;

public class ProgramaPrincipal {
	public static void main(String[] args) throws SQLException {
		Connection conexion = (Connection) DriverManager
				.getConnection("jdbc:mariadb://bd.iesguara.cf:3306/DAM1Alu15_Personas?user=DAM1Alu15&password=nt2e4p");
		System.out.println(conexion.getCatalog());
		System.out.println("");
		Statement statement = conexion.createStatement();
		ResultSet resultado = statement.executeQuery("show tables");
		while (resultado.next()) {
			System.out.println(resultado.getString(1));
		}
		conexion.close();
	}
}
