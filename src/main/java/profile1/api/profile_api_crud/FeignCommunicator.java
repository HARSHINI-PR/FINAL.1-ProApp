package profile1.api.profile_api_crud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor", url = "http://localhost:8054/app")
public interface FeignCommunicator {
    @GetMapping("/byProfile/{profileId}")
    public List<Apps> callByProfile(@PathVariable("profileId") int profileId);
}
