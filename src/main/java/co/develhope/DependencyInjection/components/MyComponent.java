package co.develhope.DependencyInjection.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;
        public MyComponent(){
        this.myComponentName = "Luca";
        System.out.println("MyComponent constructor");

    }
    public String getMyComponentName(){
        System.out.println("getMyComponentName");
        return myComponentName;
    }
}
