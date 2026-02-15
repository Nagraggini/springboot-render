package demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

    @GetMapping("/")
    public String home(HttpSession session, Model model) {
        Integer count = (Integer) session.getAttribute("count");
        if (count == null)
            count = 0;
        model.addAttribute("count", count);
        return "index"; // index.html
    }

    @PostMapping("/counter")
    public String increment(HttpSession session) {
        Integer count = (Integer) session.getAttribute("count");
        if (count == null)
            count = 0;
        session.setAttribute("count", ++count);
        return "redirect:/"; // újratölti a főoldalt, így frissül a számláló
    }
}