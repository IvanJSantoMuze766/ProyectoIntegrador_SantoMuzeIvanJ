package com.portfolio.ism.Repository;

import com.portfolio.ism.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
	public Optional<Experiencia> findByNombreE (String nombreE);
	public boolean existsByNombreE (String nombreE);
}
