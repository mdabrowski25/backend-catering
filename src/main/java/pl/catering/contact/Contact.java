package pl.catering.contact;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.ZonedDateTime;


@Entity

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contactId;
    private String email;
    private String firstname;
    private String lastname;
    private String postDateTime;
    @Column(length = 1200)
    private String contactMessage;


    public Contact(String email, String contactMessage) {
        this.email = email;
        this.contactMessage = contactMessage;
    }

    public Contact(String email, String firstname, String lastname, String postDateTime, String contactMessage) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.postDateTime = postDateTime;
        this.contactMessage = contactMessage;
    }

    public Contact() {
    }

    public Integer getContactId() {
        return contactId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getPostDateTime() {
        return postDateTime;
    }

    public void setPostDateTime(String postDateTime) {
        this.postDateTime = postDateTime;
    }
}
