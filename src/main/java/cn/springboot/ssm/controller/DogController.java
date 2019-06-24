package cn.springboot.ssm.controller;

import cn.springboot.ssm.pojo.Dog;
import cn.springboot.ssm.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @RequestMapping("/getAllDog")
    public List<Dog> getAllDog() {
        List<Dog> allDog = dogService.getAllDog();
        System.out.println("ceshi git 1");
        System.out.println("ceshi git 1");
        System.out.println("add host_fix 1");
        return allDog;
    }

    @RequestMapping("/find")
    public Dog findById() {
        Dog gog = dogService.findById(1);
        return gog;
    }
}
