package au.com.marlo.springit.repository;

import au.com.marlo.springit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {

}