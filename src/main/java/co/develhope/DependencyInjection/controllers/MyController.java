package co.develhope.DependencyInjection.controllers;

import co.develhope.DependencyInjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class MyController {

    private MyService myService;
    @Autowired
    public MyController(MyService myService){
        this.myService = myService;
        System.out.println("MyController constructor");
    }
@GetMapping
    public String welcomeMessage(){
    return "Benvenuto";
}
@GetMapping(value = "/getName")
    public String getName(){
    System.out.println("myService.getName");
        return myService.getName();
}


}
