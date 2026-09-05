package org.tnsif.acc.c2tc.springautowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("Beans-autowiring.xml");
        Student st = (Student) c.getBean("student");
        st.display();
    }
}
