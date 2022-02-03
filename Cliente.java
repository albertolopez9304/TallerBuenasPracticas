public class Cliente {
	
	List<Compras> compras; // Se cambia el nombre cmp por compras. Era una abreviatura que no se entendia.

	public void imprimirInformacionPersonal() { // Cambie a imprimirInformacionPersonal porque el metodo no era pronunciable debido al uso de abreviatura. 
		System.out.println("Nombre: " + "Antonio");
		System.out.println("Apellido 1: " + "Zapata");
		System.out.println("Apellido 2: " + "Restrepo");
		System.out.println("Numero de documento: " + "123456789");
	}
	
	public void imprimirTodaInformacion() { //Cambie a imprimirInformacionPersonal porque el metodo no era pronunciable debido al uso de abreviatura y describe un proposito.
		
		System.out.println("Nombre: " + "Antonio");
		System.out.println("Apellido 1: " + "Zapata");
		System.out.println("Apellido 2: " + "Restrepo");
		System.out.println("Numero de documento: " + "123456789");
		
		for(Compras comprasLocal : compras) { // Se cambie cmpLocal por comprasLocal para que sea un nombre con sentido.
			System.out.println("Nombre: " + "Antonio");
		}
	}
}