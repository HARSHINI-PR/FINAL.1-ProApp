package app1.api.app_api_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppsRemote extends JpaRepository<Apps,Integer> {
    List<Apps> findAllByProfileId(int profileId);

}
