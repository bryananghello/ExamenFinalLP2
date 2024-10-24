package com.crud.lp2.service;

import com.crud.lp2.model.Medico;

import java.util.List;

public interface IMedicoService {
    List<Medico> ListadoMedicos();
    void RegistrarMedico(Medico medico);
    Medico BuscarporId(Integer id);
    void EliminarMedico(Integer id);
}
