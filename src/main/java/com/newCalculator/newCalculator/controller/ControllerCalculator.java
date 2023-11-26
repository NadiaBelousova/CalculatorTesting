package com.newCalculator.newCalculator.controller;

import com.newCalculator.newCalculator.service.NewCalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class ControllerCalculator {
    private final NewCalculatorServiceImpl newCalculatorService;

    public ControllerCalculator(NewCalculatorServiceImpl newCalculatorService) {
        this.newCalculatorService = newCalculatorService;
    }
    @GetMapping
    public String hello() {
        return newCalculatorService.hello();
    }
    @GetMapping (path="/plus")
    public String addition (@RequestParam("num1") int num1, @RequestParam("num2") int num2)  {
        return num1 + "+"+ num2+ "="+newCalculatorService.plus(num1,num2);
    }
    @GetMapping (path="/minus")
    public String minus (@RequestParam("num1") int num1,@RequestParam("num2") int num2)  {
        return num1 + "-"+ num2+ "="+newCalculatorService.minus(num1,num2);
    }
    @GetMapping (path="/multiply")
    public String multiply (@RequestParam(required = true) int num1,@RequestParam(required = true) int num2)  {
        return num1 + "*"+ num2+ "="+newCalculatorService.multiply(num1,num2);
    }
    @GetMapping (path="/divide")
    public String divide (@RequestParam("num1") int num1,@RequestParam("num2") int num2)  {
        return num1 + "/"+ num2+ "="+newCalculatorService.divide(num1,num2);
    }


}
