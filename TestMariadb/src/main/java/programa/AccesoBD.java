package programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class AccesoBD {
	Connection conexion;

	public void conectar() {
		Properties bdProp = new Properties();
		FileInputStream
		try {
			bdProp.load(new FileInputStream("bdProperties.Properties"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			conexion = DriverManager.getConnection("jdbc:mariadb://bd.iesguara.cf:3306/DAM1Alu15_Personas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
