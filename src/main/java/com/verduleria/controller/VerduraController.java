
package com.verduleria.controller;

import com.verduleria.entity.Verdura;
import com.verduleria.service.ITiendaService;
import com.verduleria.service.IVerduraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VerduraController {
    
    
    @Autowired
    private ITiendaService tiendaService;
    
    @Autowired
    private IVerduraService verduraService;
    
    @GetMapping("/verduras")
    public String index(Model model) {
        List<Verdura> listaVerdura = verduraService.getAllVerdura();
        model.addAttribute("titulo", "Tabla Verduras");
        model.addAttribute("verduras", listaVerdura);
        return "verduras";
    }
}
