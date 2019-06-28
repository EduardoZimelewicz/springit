package au.com.marlo.springit.controller;

import au.com.marlo.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

    @Autowired
    private LinkRepository linkRepository;

    @RequestMapping(path = "/")
    public String links (Model model) {
        model.addAttribute("links", linkRepository.findAll());
        return "link/home";
    }
}
