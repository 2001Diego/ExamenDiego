package com.verduleria.controller;

import com.verduleria.entity.Tienda;
import com.verduleria.entity.Verdura;
import com.verduleria.service.ITiendaService;
import com.verduleria.service.IVerduraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/editverduras/{id}")
    public String editarVerdura(@PathVariable("id") Long idVerdura, Model model) {
        Verdura verduras = verduraService.getVerduraById(idVerdura);
        List<Tienda> listaTiendas = tiendaService.listStore();
        model.addAttribute("verdura", verduras);
        model.addAttribute("tiendas", listaTiendas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long idVerdura) {
        verduraService.delete(idVerdura);
        return "redirect:/verduras";
    }

    @PostMapping("/save")
    public String guardarVerdura(@ModelAttribute Verdura verdura) {
        verduraService.saveVerdura(verdura);
        return "redirect:/verduras";
    }
}
