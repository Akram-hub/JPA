package org.akmoumni.Registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="pais")
public class Pais {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @NotNull(message = "{pais.nombre.notnull}")
    @NotBlank(message = "{pais.nombre.notblank}")
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull(message = "{pais.nombre.notnull}")
    @NotBlank(message = "{pais.nombre.notblank}")
    @Column(name = "poblacion")
    private int poblacion;
    
    @NotNull
    @NotBlank(message = "{empleado.empno.notblank}")
    @Column(name = "superficie")
    private int superficie;
    
	@NotNull(message = "{pais.siglasPais.notnull}")
	@NotBlank(message = "{pais.siglasPais.notblank}")
	@Pattern(regexp = "AN|ES|FR|IT|PT", message = "{pais.pattern}")
    @Column(name = "siglasPais")
	private String siglasPais;
	
    
}
