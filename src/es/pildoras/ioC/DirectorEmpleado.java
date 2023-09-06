package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionnforme(interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director " +informeNuevo.getInforme();
	}
	
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


	//Property del bean
	//La particularidad del bean es que se debe llamar setInformeNuevo pero sin el 
	//set y con InformeNuevo en minuscula asi: informeNuevo =  Asi quedara en el bean
	public void setInformeNuevo(CreacionInformes informeNuevo) {
			this.informeNuevo = informeNuevo;
		}

	


}
