package eu.aevent.controller;

import eu.aevent.repository.BeaconRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeaconController {

    private final BeaconRepository beaconRepository;

    public BeaconController(BeaconRepository beaconRepository) {
        this.beaconRepository = beaconRepository;
    }

    @GetMapping("/beacon/list")
    public String showList(Model model) {
        model.addAttribute("beacons", beaconRepository.findAll());
        return "beacon/list";
    }

//    @GetMapping(GET)
//    public String home() {
//
//        return "index";
//    }

//    @RequestMapping("/")
//    public String get() {
//        return "tryindex.html";
//    }


}
