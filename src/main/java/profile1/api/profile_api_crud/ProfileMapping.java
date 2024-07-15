package profile1.api.profile_api_crud;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfileMapping {
    @Autowired
    private ProfileService service;

    @PostMapping("/add")
    public Profile callSave(@RequestBody Profile profile){
        return service.implementSave(profile);
    }

    @GetMapping("/getId/{id}")
    public Profile getId (@PathVariable("id") int id){
        return service.implementFindById(id);
    }


    @GetMapping("/")
    public List<Profile> callFetch(){
        return service.implementFindAll();
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }
}
