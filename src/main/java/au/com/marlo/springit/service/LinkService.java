package au.com.marlo.springit.service;

import au.com.marlo.springit.model.Link;
import au.com.marlo.springit.repository.LinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinkService {

    private final LinkRepository linkRepository;

    public LinkService (LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> findAll () {
        return linkRepository.findAll();
    }

    public Optional<Link> findById (Long id) {
        return linkRepository.findById(id);
    }

    public void save (Link link) {
        linkRepository.save(link);
    }
}
