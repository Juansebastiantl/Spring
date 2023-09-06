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
		Empleados Maria = contexto.getBean("miDirectorEmpleado", Empleados.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		
		contexto.close();
	}

}
