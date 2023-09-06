package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionnforme(interfaz)
	private CreacionInformes informeNuevo;
	
	//Property del bean
	//La particularidad del bean es que se debe llamar setInformeNuevo pero sin el 
	//set y con InformeNuevo en minuscula asi: informeNuevo =  Asi quedara en el bean
	public void setInformeNuevo(CreacionInformes informeNuevo) {
			this.informeNuevo = informeNuevo;
		}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director " +informeNuevo.getInforme();
	}

}
