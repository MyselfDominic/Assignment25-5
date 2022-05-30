package Assignment.Department.Service;

import Assignment.Department.Entity.DepEntity;
import Assignment.Department.Repository.DepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DepService {

    @Autowired
    DepRepo depRepo;


    public DepEntity get(Long id) {
        return depRepo.findById(id).orElse(null);
    }


    public DepEntity  getbyname(String name) {
        List<DepEntity > list = depRepo.findByName(name);
        if(list.isEmpty()){
            DepEntity  d = new DepEntity ();
            d.setName(name);
            return d;
        } else {
            return list.get(0);
        }
    }

    public DepEntity  save(DepEntity  department) {
        depRepo.save(department);
        return department;
    }

    public DepEntity  put(DepEntity  department) {
        depRepo.save(department);
        return department;
    }

    public String delete(Long id) {
        depRepo.deleteAllById(Arrays.asList(id));
        return "deleted";
    }

}
