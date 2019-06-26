package au.com.marlo.springit.repository;

import au.com.marlo.springit.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
