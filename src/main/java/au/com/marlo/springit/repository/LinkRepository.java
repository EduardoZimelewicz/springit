package au.com.marlo.springit.repository;

import au.com.marlo.springit.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

}
