package demo.demo.controllers;

//ArrayList-hez:
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import demo.demo.models.Users;

// Ez a kontroller figyeli a szervert, és lehetővé teszi, hogy információkat kapjunk a felhasználókról.
@Controller
public class UsersController {

    // Ez a metódus akkor fut le, ha a felhasználó HTTP GET kérést küld a
    // /users/view URL-re.
    // A @GetMapping annotáció egy endpointot definiál, amin keresztül a kliens
    // kapcsolatba léphet a szerverrel.
    // A visszatérési érték "users/showAll" a Thymeleaf template neve, amit a
    // böngészőnek küldünk.
    @GetMapping("/users/view")
    // Model -> org.springframework.ui -> Be is kerül fentre az importokhoz.
    public String getAllUsers(Model model) {
        // Modell: A Spring MVC-ben a Model egy olyan “csomagoló” objektum, amiben
        // adatokat küldünk a HTML template-nek (Thymeleaf, JSP, stb.).
        System.out.println("Getting all users.");

        // TODO: get all users from database
        // Példányosítás.
        List<Users> users = new ArrayList<>();
        // Konstruktor hívás a példányok hozzáadsáshoz:
        users.add(new Users("Andi", "1234", 25));
        users.add(new Users("Steve", "1234", 25));
        users.add(new Users("Sara", "1234", 30));

        // end of databse call
        // A modellhez hozzáadjuk az adatokat.
        // "us" – ez a név, amin keresztül a template-ben el tudjuk érni.
        model.addAttribute("us", users);

        // A "users/showAll" a Thymeleaf template neve, amit visszaad a böngészőnek
        // A templates mappában van a showAll.html, ami meg fog jelenni.
        // A return "users/showAll"; csak a template nevét adja vissza, amit a Spring
        // MVC feldolgoz és a böngészőnek renderel.
        return "users/showAll";
        // A böngésző nem kapja közvetlenül a Model objektumot, csak a renderelt HTML-t.
    }

}
