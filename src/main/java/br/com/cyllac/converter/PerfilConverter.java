package br.com.cyllac.converter;

import java.beans.PropertyEditorSupport;

import br.com.cyllac.entity.Perfil;

public class PerfilConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		Perfil perfil = Perfil.ADMIN;
		
		if (text.equalsIgnoreCase("USER")) {
			perfil = Perfil.USER;
		}
		
		super.setValue(perfil);
	}	
}
