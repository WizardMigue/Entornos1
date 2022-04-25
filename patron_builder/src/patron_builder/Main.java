package patron_builder;

public class Main {

	public static void main(String[] args) {
		Usuario usu = new UsuarioBuilder()
				.email("hola@esViernes.com")
				.nombre("Juan", "Gonzalez")
				.direccion("Calle Perena, 25")
				.build();
		System.out.println(usu);

	}

}
