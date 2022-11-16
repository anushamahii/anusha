package bhanu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class nani {

	public static void main(String[] args) {
	
		Resource rs = new ClassPathResource("Application context.xml");
		BeanFactory bn = new  XmlBeanFactory(rs);
		customer ct=(customer)bn.getBean("customer");
ct.display();

	}

}
