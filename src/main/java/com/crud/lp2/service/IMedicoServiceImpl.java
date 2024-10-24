package com.crud.lp2.service;

import com.crud.lp2.model.Medico;
import com.crud.lp2.repository.IMedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMedicoServiceImpl implements IMedicoService {

    @Autowired
    private IMedicoRepository medicoRepository;

    @Override
    public List<Medico> ListadoMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public void RegistrarMedico(Medico medico) {
        medicoRepository.save(medico);
    }

    @Override
    public Medico BuscarporId(Integer id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @Override
    public void EliminarMedico(Integer id) {
        medicoRepository.deleteById(id);
    }
}
