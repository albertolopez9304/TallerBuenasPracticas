public class Cliente {
	
	List<Compras> compras;
		public Cliente () {
			imprimirInformacionPersonal();
	
			System.out.println("Informacion Familiar");
			System.out.println("Estado civil: " + "Casado");
			System.out.println("Cantidad de hijos: " + "3");
			System.out.println("Cantidad de hermanos: " + "4");
			System.out.println("Nombre del padre: " + "Jesus Zapata");
			System.out.println("Nombre de la madre: " + "Patricia Restrepo");
		}
}	


public void imprimirInformacionPersonal(){
	Persona persona = new Persona();
	String nombre = persona.getNombre();
	String apellido1 = persona.getPrimeroApellido();
	String apellido2 = persona.getSegundoApellido();
	String numeroDocumento = Integer.toString(persona.getNumeroDeDocumento());
	
	System.out.println("Informacion Personal");
	System.out.println("Nombre: " + getNombre);  //se hace un inline
	System.out.println("Apellido 1: " + getPrimeroApellido); //se hace un inline
	System.out.println("Apellido 2: " + getSegundoApellido); //se hace un inline
	System.out.println("Numero de documento " + getNumeroDeDocumento); //se hace un inline
}

public void imprimirTodaInformacionPersonal(){
	imprimirInformacionPersonal();   //Introduciendo Metodo
		
	for(Compras comprasLocal : compras)
			System.out.println("Nombre: " + "Antonio")
}
