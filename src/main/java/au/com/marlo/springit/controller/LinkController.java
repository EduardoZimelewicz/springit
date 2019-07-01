package au.com.marlo.springit.controller;

import au.com.marlo.springit.model.Link;
import au.com.marlo.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class LinkController {

    private final LinkRepository linkRepository;

    private static final Logger logger = LoggerFactory.getLogger(LinkController.class);

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @RequestMapping(path = "/")
    public String links (Model model) {
        model.addAttribute("links", linkRepository.findAll());
        return "link/home";
    }

    @GetMapping(path = "/link/{id}")
    public String getLink (@PathVariable Long id,  Model model) {
        Optional<Link> link = linkRepository.findById(id);
        if (link.isPresent()) {
            model.addAttribute("link", link.get());
            model.addAttribute("success", model.containsAttribute("success"));
            return "link/view";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping(path = "/link/submit")
    public String getLinkForm (Model model) {
        model.addAttribute("link", new Link());
        return "link/submit";
    }

    @PostMapping(path = "/link/submit")
    public String submitLink (@Valid Link link, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            logger.info("Validation errors were found while submitting new link");
            model.addAttribute("link", link);
            return "link/submit";
        } else {
            linkRepository.save(link);
            logger.info("New links was successfully saved");
            redirectAttributes.addAttribute("id", link.getId()).addFlashAttribute("success", true);
            return "redirect:/link/{id}";
        }
    }
}
