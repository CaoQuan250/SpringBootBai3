package com.example.stringboot.Bai3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class Controller {
    @GetMapping("/api/{name}/{num}")
    @ResponseBody
    public String input(@PathVariable String name, @PathVariable int num){
        if (Objects.equals(name, "USD")){
            double usd = num * 23.000;
            return num + " $ = "+usd+" đ";
        } else if (Objects.equals(name, "EUR")){
            double eur = num * 23.783;
            return num + " € = "+eur+" đ";
        } else if (Objects.equals(name, "JPY")){
            double jpy = num * 17.163;
            return num + " ¥ = "+jpy+" đ";
        } else
            return null;
    }
}
