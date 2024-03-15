package com.borisoongeo.AircraftSimuWeb.service.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/start")
public class webController {
        @GetMapping
        String start() {
            return "start/index";
        }


}
