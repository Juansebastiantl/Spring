package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		// Obtencion del bean
		Empleados Juan = contexto.getBean("miDirectorEmpleado", Empleados.class);
		System.out.println(Juan.getInforme());
		contexto.close();
	}

}
