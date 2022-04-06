package org.akmoumni.Registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="departamento")
public class Departamento {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @NotNull(message = "{departamento.localidad.notnull}")
    @NotBlank(message = "{departamento.localidad.notblank}")
    @Column(name = "localidad")
    private String localidad;
    
    @Column(name = "comentarios")
    private String comentarios;
    
}
