package springque_8;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotion.Required;
//import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Controller;


//@Service
//@Repository
//@Controller
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Resource
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String  toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @PostConstruct
    public void afterPropertiesSet() {
        System.out.println("init called");
    }
  @PreDestroy
    public void destroy() {
        System.out.println("destroying bean");
    }

}