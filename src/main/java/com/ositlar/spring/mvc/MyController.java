package com.ositlar.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "askEmpDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails() {
        return "showEmpDetails";
    }
}
