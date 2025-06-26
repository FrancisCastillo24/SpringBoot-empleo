package net.fcf.empleos.model;

import java.util.Date;

public class Vacante {

	// Atributos de la clase Vacante
	private Integer id;
	private String name;
	private String description;
	private Date date;
	private Double salary;
	private Integer Featured; // Destacado significa
	private String image = "no-image.png";

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
		return Featured;
	}

	public void setFeatured(Integer featured) {
		Featured = featured;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	// ToString de la clase Vacante
	@Override
	public String toString() {
		return "Vacante [id=" + id + ", description=" + description + ", date=" + date + ", salary=" + salary + "]";
	}
	
	

}
