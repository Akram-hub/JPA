package org.akmoumni.Registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usuario")
public class Usuario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , unique = true, nullable = false)
    private long id;
    
    @NotNull(message = "{usuario.dni.notnull}")
    @NotBlank(message = "{usuario.dni.notblank}")
    @Column(name = "dni" , unique = true , nullable = false)
    private String dni;
    
    @NotNull(message = "{usuario.nombre.notnull}")
    @NotBlank(message = "{usuario.nombre.notblank}")
    @Column(name = "nombre" , nullable = false)
    private String nombre;
    
    @NotNull(message = "{usuario.apellido.notnull}")
    @NotBlank(message = "{usuario.apellido.notblank}")
    @Column(name = "apellido" , nullable = false)
    private String apellido;

    @NotNull(message = "{usuario.edad.notnull}")
    @NotBlank(message = "{usuario.edad.notblank}")
    @Column(name = "edad" , nullable = false)
    private int edad;
    
    @NotNull(message = "{usuario.salario.notnull}")
    @NotBlank(message = "{usuario.salario.notblank}")
    @Column(name = "salario" , nullable = false)
    private int salario;

    @NotNull(message = "{usuario.genero.notnull}")
    @NotBlank(message = "{usuario.genero.notblank}")
    @Enumerated(EnumType.STRING)
    @Column(name = "genero" , nullable = false)
    private Genero genero;
    

	public Usuario() {
		super();
	}


	public Usuario(
			long id,
			@NotNull(message = "{usuario.dni.notnull}") @NotBlank(message = "{usuario.dni.notblank}") String dni,
			@NotNull(message = "{usuario.nombre.notnull}") @NotBlank(message = "{usuario.nombre.notblank}") String nombre,
			@NotNull(message = "{usuario.apellido.notnull}") @NotBlank(message = "{usuario.apellido.notblank}") String apellido,
			@NotNull(message = "{usuario.edad.notnull}") @NotBlank(message = "{usuario.edad.notblank}") int edad,
			@NotNull(message = "{usuario.salario.notnull}") @NotBlank(message = "{usuario.salario.notblank}") int salario,
			@NotNull(message = "{usuario.genero.notnull}") @NotBlank(message = "{usuario.genero.notblank}") Genero genero) {
		
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.genero = genero;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
    
}