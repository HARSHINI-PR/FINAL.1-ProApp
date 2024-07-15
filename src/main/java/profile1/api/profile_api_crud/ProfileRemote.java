package profile1.api.profile_api_crud;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRemote extends JpaRepository<Profile,Integer> {
}