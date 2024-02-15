package gb.RickAndMortiApi.controller;


import gb.RickAndMortiApi.domain.Characters;
import gb.RickAndMortiApi.service.ServiceApi;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@AllArgsConstructor
public class ControllerAPI {

    private ServiceApi serviceApi;


    @GetMapping("/")
    public ResponseEntity<Characters> getCharacters()
    {
        Characters allCharacters = serviceApi.getAllCharacters();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    }

    @GetMapping("/view")
    public ModelAndView messages() {
        Characters allCharacters = serviceApi.getAllCharacters();
        ModelAndView mav = new ModelAndView("ram");
        mav.addObject("results", allCharacters.getResults());
        return mav;
    }
}
