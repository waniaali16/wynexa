package com.rushiq.rushiq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final RushService rushService;

    public HomeController(RushService rushService) {
        this.rushService = rushService;
    }

    @GetMapping("/")
    public String home(
            @RequestParam(required = false) Integer partySize,
            Model model) {

        model.addAttribute("rushLevel", rushService.getRushLevel());
        model.addAttribute("capacity", rushService.getCapacityPercentage());
        model.addAttribute("queueLength", rushService.getQueueLength());
        model.addAttribute("kitchenOrders", rushService.getKitchenOrders());

        if (partySize != null) {
            model.addAttribute(
                    "estimatedWait",
                    rushService.calculateWaitTime(partySize)
            );
            model.addAttribute("partySize", partySize);
        }

        return "index";
    }
}