package com.mdc;

import com.mdc.controller.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ObjectUtils;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc
 * @copyright Copyright (c) 2017 GameLoft
 * @date : 14.11.2017 21:25
 */
@SpringBootApplication
public class App implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Autowired
    private HomeController homeController;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);

        app.run(args);
    }

    /**
     * Run the command liner
     */
    public void run(String... args) throws Exception {
        LOGGER.info("Started apps");
        homeController.homePage();
//       homeController.hiddenMethod();
    }
}
