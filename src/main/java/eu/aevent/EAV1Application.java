package eu.aevent;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@SpringBootApplication
public class EAV1Application {

//    @RequestMapping("/home")
//    @ResponseBody
//    public String mainPage() {
//        return "Hello World!";
//    }

    @GetMapping("/hello")
    public String hello(Model model) {
//        model.addAttribute("message", "Hello Coderslab");
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(EAV1Application.class, args);
    }

}
