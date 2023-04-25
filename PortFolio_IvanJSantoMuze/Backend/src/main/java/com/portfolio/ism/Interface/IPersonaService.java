
package com.portfolio.ism.Interface;

import com.portfolio.ism.Entity.Persona;
import java.util.List;


public interface IPersonaService {
	//Traer lista de personas
	public List<Persona> getPersona();
	//Guardar objeto de tipo persona
	public void savePersona(Persona persona);
	//Eliminar objeto buscado por id
	public void deletePersona(Long id);
	//Buscar persona por id
	public Persona findPersona (Long id);
}
