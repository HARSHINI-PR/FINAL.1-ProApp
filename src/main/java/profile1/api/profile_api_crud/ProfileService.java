package profile1.api.profile_api_crud;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRemote remote;

    @Autowired
  private FeignCommunicator feignCommunicator;

    public Profile implementFindById(int id){
        Profile obj = remote.findById(id).orElse(new Profile());
        if(obj!=null){
            obj.setMyApps(feignCommunicator.callByProfile(obj.getProfileId()));
        }
        return obj;
    }
    public List<Profile> implementFindAll(){
        return remote.findAll();
    }
    public Profile implementSave(Profile profile){
        return remote.save(profile);
    }
    public Profile readId( int id){
        return remote.findById(id).orElse(new Profile());
    }
    public void implementDelete(int id) {
        remote.deleteById(id);
    }
}