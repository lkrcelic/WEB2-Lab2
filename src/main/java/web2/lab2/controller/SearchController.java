package web2.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web2.lab2.validation.SanitizationUtil;

@Controller
public class SearchController {

    @GetMapping("/query")
    public String query() {
        return "query";
    }

    @GetMapping("/search")
    public String search(@RequestParam("query") String query, Model model) {
        model.addAttribute("query", query);
        return "query";
    }

    @PostMapping("/search")
    public String search2(@RequestParam String query, Model model) {
        String sanitizedData = SanitizationUtil.sanitize(query);

        model.addAttribute("query2", sanitizedData);
        return "query";
    }

}
