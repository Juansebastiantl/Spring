package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {
	// Aca vamos a aprender el metodo Singleton y prototype
	//Si en el applicationContext le ponemos al Scope Singleton o prototype
	public static void main(String[] args) {
		// Carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		//peticion de beans al contenedor Spring
		DirectorEmpleado Luis = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		DirectorEmpleado Maria = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		DirectorEmpleado Manolo = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		DirectorEmpleado Juan = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		System.out.println(Maria);
		System.out.println(Luis);
		System.out.println(Manolo);
		System.out.println(Juan);
		if(Maria==Luis)System.out.println("Apuntan al mismo objeto");
		else System.out.println("No apuntan al mismo objeto");
	}

}
