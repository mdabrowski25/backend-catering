package pl.catering.contact;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.catering.responses.ResponseMessage;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin
@ResponseStatus(HttpStatus.OK)
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping
    public List<Contact> get() {
        return contactRepository.findAll();
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseMessage create(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return new ResponseMessage("Contact created");
    }
}
