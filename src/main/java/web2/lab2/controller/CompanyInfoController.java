package web2.lab2.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyInfoController {

    @GetMapping("/user/company-info")
    public String userCompanyInfo(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();

        model.addAttribute("user", currentUserName);
        model.addAttribute("isUser", true);

        model.addAttribute("companyName", "XYZ Corporation");
        model.addAttribute("companyAddress", "123 Business St.");

        return "companyInfo";
    }

    @GetMapping("/admin/company-info")
    public String adminCompanyInfo(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();

        model.addAttribute("user", currentUserName);
        model.addAttribute("isAdmin", true);

        model.addAttribute("companyName", "XYZ Corporation");
        model.addAttribute("companyAddress", "123 Business St.");
        model.addAttribute("companyBankAccount", "123456789");

        return "companyInfo";
    }

}
