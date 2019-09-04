package org.example.appengine.hello;

import org.example.appengine.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
public class Runner {

    @Autowired
    public Person testPerson;

    @Autowired
    private WebApplicationContext webApplicationContext;


    public void run() {
    }

    public void checkContext() {


        if (webApplicationContext != null) {
            System.out.println("Sprint Context is OK");
        } else {
            System.out.println("Spring Context has not been initialized");
        }

        if (testPerson == null) {
            System.out.println("Person is null!");
        } else {
            System.out.println(testPerson.getName());
        }

    }

    public Person getTestPerson() {
        return testPerson;
    }

    public void setTestPerson(Person testPerson) {
        this.testPerson = testPerson;
    }

    public WebApplicationContext getWebApplicationContext() {
        return webApplicationContext;
    }

    public void setWebApplicationContext(WebApplicationContext webApplicationContext) {
        this.webApplicationContext = webApplicationContext;
    }
}
