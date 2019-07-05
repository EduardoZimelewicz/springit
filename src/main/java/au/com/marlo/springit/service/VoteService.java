package au.com.marlo.springit.service;

import au.com.marlo.springit.model.Vote;
import au.com.marlo.springit.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public void save (Vote vote) {
        voteRepository.save(vote);
    }
}
