
package com.verduleria.controller;

import com.verduleria.entity.Verdura;
import com.verduleria.service.ITiendaService;
import com.verduleria.service.IVerduraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VerduraController {
    
    
    @Autowired
    private ITiendaService tiendaService;
    
    @Autowired
    private IVerduraService verduraService;
    private long idVerdura;
    private Object Verdura;
    private Object listaTienda;
    
    @GetMapping("/verduras")
    public String index(Model model) {
        List<Verdura> listaVerdura = verduraService.getAllVerdura();
        model.addAttribute("titulo", "Tabla Verduras");
        model.addAttribute("verduras", listaVerdura);
        return "verduras";
    }
    
    
    
    
     @GetMapping("/editVerduras/(id)")
    public String editarVerdura (@PathVariable("id") Long idPersona, Model model){
        Verdura verduras = verduraService.getVerduraById(idVerdura);        
        List<Verdura> listaVerdura = tiendaService.listverdura();
        model.addAttribute("verdura",Verdura);
        model.addAttribute("tienda",listaTienda);
        return "crear";
    }
    
    
    @GetMapping("/delete")
    public String delete(@PathVariable("id") Long idVerdura) {
        verduraService.delete(idVerdura);
        return "redirect:/verduras";
    }
}
