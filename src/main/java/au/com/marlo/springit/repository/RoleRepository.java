package au.com.marlo.springit.repository;

import au.com.marlo.springit.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
