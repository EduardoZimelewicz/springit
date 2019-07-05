package au.com.marlo.springit.service;

import au.com.marlo.springit.model.Comment;
import au.com.marlo.springit.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void save (Comment comment) {
        commentRepository.save(comment);
    }
}
