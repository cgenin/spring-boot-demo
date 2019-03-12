package fr.mdpa.orleans.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Définition du bean
@Controller
public class Html {
    // Définition de la méthode et de l'url
    @GetMapping("/")
    public String index(final Model model){
        // Ajouter des variables
        model.addAttribute("text", "les étudiants");
        // Nom de la template
        return "index";
    }
}
