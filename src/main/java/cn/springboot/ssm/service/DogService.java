package cn.springboot.ssm.service;

import cn.springboot.ssm.mapper.DogMapper;
import cn.springboot.ssm.pojo.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService implements DogMapper {


    @Autowired
    private DogMapper mapper;

    @Override
    public List<Dog> getAllDog() {
        return mapper.getAllDog();
    }

    @Override
    public Dog findById(Integer id) {
        return mapper.findById(1);
    }
}
