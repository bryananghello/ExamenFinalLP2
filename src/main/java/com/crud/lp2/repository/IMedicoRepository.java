package com.crud.lp2.repository;

import com.crud.lp2.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicoRepository extends JpaRepository<Medico, Integer> {
}
