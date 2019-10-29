package net.minchev.importproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShopController {

    @Autowired
    public ShopController() {
        System.out.println("Boza");
    }
}
