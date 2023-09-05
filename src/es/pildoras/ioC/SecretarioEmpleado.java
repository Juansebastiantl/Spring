package es.pildoras.ioC;

public class SecretarioEmpleado implements Empleados {

	//Creacion de campo tipo creacionnforme(interfaz)
	private CreacionInformes informeNuevo;
	
	// Creacion de construccion que inyecta la dependencia
	public SecretarioEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director " +informeNuevo.getInforme();
	}
	

}
