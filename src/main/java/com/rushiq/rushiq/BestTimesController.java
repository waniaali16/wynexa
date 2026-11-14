package com.rushiq.rushiq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BestTimesController {

    @GetMapping("/best-times")
    public String bestTimes(Model model) {

        List<String> times = List.of(
                "12 PM", "1 PM", "2 PM",
                "3 PM", "4 PM", "5 PM",
                "6 PM", "7 PM", "8 PM", "9 PM"
        );

        List<Integer> rushScores = List.of(
                45, 72, 65,
                38, 30, 48,
                70, 92, 85, 55
        );

        model.addAttribute("times", times);
        model.addAttribute("rushScores", rushScores);

        model.addAttribute("bestTime", "4:00 PM");
        model.addAttribute("peakTime", "7:00 PM");

        return "best-times";
    }
}
