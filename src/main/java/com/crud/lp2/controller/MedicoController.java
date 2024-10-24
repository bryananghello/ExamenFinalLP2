package com.crud.lp2.controller;

import com.crud.lp2.model.Medico;
import com.crud.lp2.service.IMedicoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Vistas")
public class MedicoController {

    @Autowired
    private IMedicoService imedicoService;

    @GetMapping("/ListadoMedicos")
    public String ListadoMedicos(Model modelo) {
        List<Medico> listado = imedicoService.ListadoMedicos();
        modelo.addAttribute("listado", listado);
        return "/Vistas/ListadoMedicos";		
    }

    @GetMapping("/RegistrarMedico")
    public String RegistrarMedico(Model modelo) {
        Medico medico = new Medico();
        modelo.addAttribute("regproducto", medico);
        return "/Vistas/FrmRegMedico";
    }

    @PostMapping("/GuardarMedico")
    public String GuardarMedico(@ModelAttribute Medico medico, Model modelo) {
        try {
            imedicoService.RegistrarMedico(medico);
            System.out.println("Datos registrados en la base de datos");
            return "redirect:/Vistas/ListadoMedicos";
        } catch (Exception e) {
            e.printStackTrace();
            modelo.addAttribute("error", "Error al registrar el médico: " + e.getMessage());
            return "/Vistas/FrmRegMedico"; // Regresa al formulario con un mensaje de error
        }
    }

    @GetMapping("/editarMedico/{id}")
    public String Editar(@PathVariable("id") Integer idMedico, Model modelo) {
        Medico medico = imedicoService.BuscarporId(idMedico);
        modelo.addAttribute("regproducto", medico);
        return "/Vistas/FrmRegMedico";
    }

    @GetMapping("/eliminarMedico/{id}")
    public String eliminar(@PathVariable("id") Integer idMedico) {
        imedicoService.EliminarMedico(idMedico);
        return "redirect:/Vistas/ListadoMedicos";
    }
}

