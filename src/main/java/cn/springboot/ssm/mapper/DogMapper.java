package cn.springboot.ssm.mapper;

import cn.springboot.ssm.pojo.Dog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DogMapper {

    public List<Dog> getAllDog();

    public Dog findById(Integer id);
}
