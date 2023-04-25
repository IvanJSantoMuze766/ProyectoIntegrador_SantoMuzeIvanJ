
package com.portfolio.ism.Security.Repository;

import com.portfolio.ism.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByNombreUsuario(String NombreUsuario);
	
	boolean existsByNombreUsuario(String NombreUsuario);
	boolean existsByEmail(String email);
}
