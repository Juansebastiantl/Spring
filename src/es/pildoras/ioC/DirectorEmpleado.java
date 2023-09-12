package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionnforme(interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director " + informeNuevo.getInforme();
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

	// metodo init. Ejecutar tareas antes de que el bean este disponible
	
	public void metodoInicial() {
		System.out.println("Dentro del metodo init, tareas a ejecutar antes de que"+
	"el bean este listo");
	}
	
	// metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy, tareas a ejecutar despues de"+
	"utilizar el bean");
	}
	//Property del bean
	//La particularidad del bean es que se debe llamar setInformeNuevo pero sin el 
	//set y con InformeNuevo en minuscula asi: informeNuevo =  Asi quedara en el bean
	public void setInformeNuevo(CreacionInformes informeNuevo) {
			this.informeNuevo = informeNuevo;
		}

	


}
