package pl.catering.food;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.catering.responses.ResponseMessage;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/food")
@ResponseStatus(HttpStatus.OK)
public class FoodController {
    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseMessage create(@RequestBody Food food){
        foodRepository.save(food);
        return new ResponseMessage("Food saved");
    }

    @GetMapping
    public List<Food> get() {
        return new ArrayList<>(foodRepository.findAll());
    }
}
