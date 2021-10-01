package com.springbootApi.springbootApi;

import com.springbootApi.springbootApi.bean.MyBean;
import com.springbootApi.springbootApi.bean.MyBeanWithDependency;
import com.springbootApi.springbootApi.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApiApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	/*Cuando se tienen dos implementaciones en 2 clases y se pretende
	*  inyectar, se debe especificar cual se inyectara, mediante
	* el uso de Qualifier y el nombre de la clase en miniscula la primera letra*/
	public SpringBootApiApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
									MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;

	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiApplication.class, args);
	}

	/*El metodo run permite ejecutar codigo*/
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
