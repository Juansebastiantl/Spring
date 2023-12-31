package es.pildoras.ioC;

public class SecretarioEmpleado implements Empleados {

	//Creacion de campo tipo creacionnforme(interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	private String nombreEmpresa;
	
	// Creacion de construccion que inyecta la dependencia
	// Recordar que el le insertamos informe en el archivo XML
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
		return "Informe creado por el Secretario " +informeNuevo.getInforme();
	}
	

}
