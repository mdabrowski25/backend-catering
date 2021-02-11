package pl.catering.order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.catering.responses.ResponseMessage;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cateringOrder")
@ResponseStatus(HttpStatus.OK)
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping("/post")
    public ResponseMessage create(@RequestBody CateringOrder cateringOrder){
        orderRepository.save(cateringOrder);
        return new ResponseMessage("CateringOrder created");
    }

    @GetMapping
    public List<CateringOrder> get() {
        return new ArrayList<>(orderRepository.findAll());
    }
}
