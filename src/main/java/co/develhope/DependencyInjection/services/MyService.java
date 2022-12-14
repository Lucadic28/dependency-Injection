package co.develhope.DependencyInjection.services;

import co.develhope.DependencyInjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {
    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println("MyService constructor");
    }

    public String getName() {

        return myComponent.getMyComponentName();
    }


}

