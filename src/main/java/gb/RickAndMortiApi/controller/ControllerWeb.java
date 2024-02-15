package gb.RickAndMortiApi.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Проба пера
 */

@Controller
@AllArgsConstructor
@RequestMapping("/web")
public class ControllerWeb {

    @GetMapping
    public String getRickAndMortyPage() {
        return "rama";
    }

    @GetMapping("/character")
    public String getCharacter(Model model) {
        return null;
    }

    @GetMapping("/location")
    public String getLocation(Model model) {
        return null;
    }


    @GetMapping("episode")
    public String getEpisode(Model model) {
        return null;
    }


}
