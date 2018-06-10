import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.spring.scopedemo.bean.DisplayInfo;

public class SpringScopeDemo1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
		
		DisplayInfo d1 = context.getBean("m1",DisplayInfo.class);
		d1.display();
		
		DisplayInfo d2 = context.getBean("m1",DisplayInfo.class);
		d2.display();
		
		DisplayInfo d3 = context.getBean("m2",DisplayInfo.class);
		d1.display();
		
		DisplayInfo d4 = context.getBean("m2",DisplayInfo.class);
		d1.display();
		
	}

}
