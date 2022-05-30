package Assignment.Department.Controller;

import Assignment.Department.Entity.DepEntity;
import Assignment.Department.Service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepController {

    @Autowired
    DepService depService;

    @RequestMapping(value = "/department/{id}" , method = RequestMethod.GET)
    public DepEntity get(@RequestParam("id") Long id){
        return depService.get(id);
    }

    @RequestMapping(value = "/department/getbyname/{name}" , method = RequestMethod.GET)
    public DepEntity getbyname(@RequestParam("name") String name){
        return depService.getbyname(name);
    }

    @RequestMapping(value = "/department/" , method = RequestMethod.POST)
    public DepEntity save(@RequestBody DepEntity department){
        return depService.save(department);
    }


    @RequestMapping(value = "/department/{id}" , method = RequestMethod.DELETE)
    public String delete(@RequestParam("id") Long id){
        return depService.delete(id);
    }

    @RequestMapping(value = "/department/" , method = RequestMethod.PUT)
    public DepEntity put(@RequestBody DepEntity department){
        return depService.put(department);
    }


}
