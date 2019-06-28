package au.com.marlo.springit.controller;

import au.com.marlo.springit.model.Link;
import au.com.marlo.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/links/")
public class LinkController {

    @Autowired
    public LinkRepository linkRepository;

    @GetMapping(path = "/")
    public List<Link> getLinks(){
        return linkRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Link> getLink(@PathVariable Long id) {
        return linkRepository.findById(id);
    }

    @PostMapping(path = "/")
    public void addLink(Link link) {
        linkRepository.save(link);
    }

    @PutMapping(path = "/{id}")
    public void updateLink(@PathVariable Long id, Link link) {
        linkRepository.save(link);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteLink (@PathVariable Long id) {
        linkRepository.deleteById(id);
    }
}
