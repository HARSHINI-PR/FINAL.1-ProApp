package app1.api.app_api_crud;

import jakarta.annotation.PostConstruct;
import org.slf4j.IMarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app")
public class AppsMapping {
    @Autowired
    private AppsService service;

    @GetMapping("/byProfile/{profileId}")
    public List<Apps> callByProfile(@PathVariable("profileId") int profileId){
        return service.implementFindProfile(profileId);
    }

    @GetMapping("/{id}")
    public Apps fetchOne(@PathVariable("id") int id){
        return service.implementFindById(id);
    }

    @PutMapping("/")
    public Apps progress(@RequestBody Apps apps){
        return service.implementSave(apps);
    }

    @DeleteMapping("/{id}")
    public String discharge(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }

    @GetMapping("/")
    public List<Apps> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/add")
    public Apps ab(@RequestBody Apps apps){
        return service.implementSave(apps);
    }
}