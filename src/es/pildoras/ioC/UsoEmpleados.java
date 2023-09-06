package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Empleados Empleado1 = new SecretarioEmpleado();
		//System.out.println(Empleado1.getTareas());
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		//System.out.println(Juan.getTareas());
		//System.out.println(Juan.getInforme());
	//Aca utilizamos inyeccion de dependencias con setter
		//Empleados Maria = contexto.getBean("miDirectorEmpleado", Empleados.class);
		//System.out.println(Maria.getTareas());
		//System.out.println(Maria.getInforme());
		
	//Aca utilizamos inyeccion de dependencias con setter
	//Pero aca necesitamos un bean que no esta en empleados sino Director
		DirectorEmpleado Luis = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		System.out.println(Luis.getTareas());
		System.out.println(Luis.getInforme());
		System.out.println(Luis.getEmail());
		System.out.println(Luis.getNombreEmpresa());
		
		SecretarioEmpleado Juan = contexto.getBean("miEmpleado", SecretarioEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		
		contexto.close();
	}

}
