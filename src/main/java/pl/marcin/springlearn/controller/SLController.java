package pl.marcin.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marcin.springlearn.service.SLService;

@RestController
@RequestMapping("/")
public class SLController {

    @Autowired
    SLService slService;

    @GetMapping
    public String hello() {
        return slService.hello();
    }

}
