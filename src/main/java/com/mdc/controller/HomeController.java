package com.mdc.controller;

import com.mdc.annotation.MethodLogging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.controller
 * @copyright Copyright (c) 2017
 * @date : 14.11.2017 21:40
 */
@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @MethodLogging
    public void homePage() {
        LOGGER.warn("Home page loaded");
        hiddenMethod();
    }

    @MethodLogging
    private void hiddenMethod() {
        LOGGER.warn("hiddenMethod page loaded");
    }

}
