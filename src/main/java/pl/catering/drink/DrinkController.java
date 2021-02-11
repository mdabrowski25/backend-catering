package pl.catering.drink;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.catering.responses.ResponseMessage;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/drink")
@ResponseStatus(HttpStatus.OK)
public class DrinkController {
    private final DrinkRepository drinkRepository;

    public DrinkController(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @PostMapping("/post")
    public ResponseMessage create(@RequestBody Drink drink) {
        drinkRepository.save(drink);
        return new ResponseMessage("Drink created");
    }

    @GetMapping
    public List<Drink> get() {
        return new ArrayList<>(drinkRepository.findAll());
    }
}
