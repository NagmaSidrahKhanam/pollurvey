import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Actor actor = (Actor)context.getBean("actor",Actor.class);
        actor.display();
    }
}
