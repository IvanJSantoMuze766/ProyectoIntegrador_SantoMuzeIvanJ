package com.portfolio.ism.Security.Entity;

import com.portfolio.ism.Security.Enums.RolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Enumerated(EnumType.STRING)
	private RolNombre rolnombre;
	
	//Constructor

	public Rol() {
	}

	public Rol(RolNombre rolnombre) {
		this.rolnombre = rolnombre;
	}
	//Getter and Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolNombre getRolnombre() {
		return rolnombre;
	}

	public void setRolnombre(RolNombre rolnombre) {
		this.rolnombre = rolnombre;
	}

	Object getRolNombre() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

}
