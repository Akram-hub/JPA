package org.akmoumni.Registro.model;

public enum Genero {
	
	HOMBRE, 
	MUJER, 
	OTRO;
	
	public Genero[] getValues() {
        return Genero.values();
    }
}
