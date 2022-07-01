package com.empresa.controller;

import com.empresa.entity.Artista;
import com.empresa.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.empresa.service.IArtistaService;
import com.empresa.service.IConciertoService;

@Controller
public class EmpresaController {

    @Autowired
    private IArtistaService artistaService;

    @Autowired
    private IConciertoService conciertoService;

    @GetMapping("/conciertos")
    public String index(Model model) {
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("conciertos", listaConcierto);
        return "verduras";
    }
    
    @GetMapping("/conciertoN")
    public String agregarConcierto (Model model){
        List<Artista> listaArtistas = artistaService.listArtista();
        model.addAttribute("concierto",new Concierto());
        model.addAttribute("artistas",listaArtistas);
        return "crear";
    }
    
    @GetMapping("/editconcierto/{id}")
    public String editarConcierto(@PathVariable("id") Long idConcierto, Model model) {
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Artista> listaArtista = artistaService.listArtista();
        model.addAttribute("concierto", concierto);
        model.addAttribute("artista", listaArtista);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long idVerdura) {
        conciertoService.delete(idVerdura);
        return "redirect:/verduras";
    }

    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
}
