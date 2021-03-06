package carmelo.spring.introduccion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Introduccion {

    public static void main(String[] args) {

        // configuracion con archivo XML
        //AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springXMLConfig.xml");
        
        // configuracion con codigo java
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
        HelloService saluda = ctx.getBean("saludaService", HelloService.class);
        saluda.saludar();
        
        ctx.close();      
    }
}
