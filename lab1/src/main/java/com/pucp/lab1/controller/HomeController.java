package com.pucp.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/registrar")
    public String registrar(Model model) {

        return "registrar";
    }

    @PostMapping("/guardar")
    public String guardar(Model model) {
        return "ListaRegistros";
    }


}
