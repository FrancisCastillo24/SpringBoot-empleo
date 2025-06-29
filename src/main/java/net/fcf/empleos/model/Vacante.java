package net.fcf.empleos.model;

import java.util.Date;

public class Vacante {

	// Atributos de la clase Vacante
	private Integer id;
	private String name;
	private String description;
	private Date date;
	private Double salary;
	private Integer featured; // Destacado significa
	private String image = "no-image.png";
	private String status;
	private String detalles;

	// Getter y Setter de la clase Vacante
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getFeatured() {
		return featured;
	}

	public void setFeatured(Integer featured) {
		this.featured = featured;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	// ToString de la clase Vacante
	@Override
	public String toString() {
		return "Vacante [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", salary="
				+ salary + ", featured=" + featured + ", image=" + image + ", status=" + status + ", detalles=" + detalles
				+ "]";
	}


	
	

}
