import com.caijia.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Blog blog = context.getBean("blog", Blog.class);
        System.out.println(blog.toString());

        MakeBlog makeBlog = context.getBean("makeBlog", MakeBlog.class);
        makeBlog.printBlog();

        ComplexAssembly assembly = context.getBean("complexAssembly", ComplexAssembly.class);
        System.out.println(assembly.toString());

        ApplicationContext context1 = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = context1.getBean("student", Student.class);
        System.out.println(student.toString());
    }
}
