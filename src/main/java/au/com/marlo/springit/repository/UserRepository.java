package au.com.marlo.springit.repository;

import au.com.marlo.springit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
