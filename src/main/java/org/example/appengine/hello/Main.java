package org.example.appengine.hello;

import org.example.appengine.config.AppConfig;
import org.example.appengine.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        //AnnotationsBasedApplicationInitializer annotationsBasedApplicationInitializer = new AnnotationsBasedApplicationInitializer();
       // annotationsBasedApplicationInitializer.onStartup(null);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = (Person) ctx.getBean("testPerson");
        System.out.println(person.getName());

        System.out.println(HelloInfo.getInfo());


      Runner runner = new Runner();
      runner.checkContext();

    }
}
