package eu.aevent.controller;

import eu.aevent.repository.EventRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("event/list")
    public String showEvents(Model model) {
        model.addAttribute("events", eventRepository.findAll());
        return "event/list";
    }

}
