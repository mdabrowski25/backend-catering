package pl.catering.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.catering.responses.ResponseMessage;

import java.util.ArrayList;
import java.util.List;

@RestController
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
