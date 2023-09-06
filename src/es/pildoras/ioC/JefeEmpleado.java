package es.pildoras.ioC;

public class JefeEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	// Creacion de construccion que inyecta la dependencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		
		return "Gestiona las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Jefe " +informeNuevo.getInforme();
	}
}