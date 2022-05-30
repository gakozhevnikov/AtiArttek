package com.kga.atiarttek.controller;

import com.kga.atiarttek.service.ApiAtiService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class ArttekAtiController {

    private ApiAtiService apiAtiService;

    @GetMapping("/arttekati")
    public String showFirm (@RequestParam String id, Model model){
        model.addAttribute("firm", apiAtiService.getFirmSummaryById(id));
        return "indexWithFirms";
    }

    @GetMapping("/first")
    public String showFirst (){
        return "index";
    }

}
