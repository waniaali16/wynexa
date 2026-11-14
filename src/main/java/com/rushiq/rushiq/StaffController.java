package com.rushiq.rushiq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    private final RushService rushService;

    public StaffController(RushService rushService) {
        this.rushService = rushService;
    }

    @GetMapping("/staff")
    public String staffDashboard(Model model) {

        model.addAttribute("rushLevel", rushService.getRushLevel());
        model.addAttribute("capacity", rushService.getCapacityPercentage());
        model.addAttribute("queueLength", rushService.getQueueLength());
        model.addAttribute("kitchenOrders", rushService.getKitchenOrders());

        model.addAttribute("totalTables", 20);
        model.addAttribute("occupiedTables", 16);
        model.addAttribute("freeTables", 4);

        return "staff";
    }
}
