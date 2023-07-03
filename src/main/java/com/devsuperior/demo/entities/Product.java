package com.devsuperior.demo.entities;

public class Product {
	
	private Long id;
	private String name;
	private Double prece;
	
	private Department department;
	
	public Product() {
	}
	
	

	public Product(Long id, String name, Double prece, Department department) {
		this.id = id;
		this.name = name;
		this.prece = prece;
		this.department = department;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrece() {
		return prece;
	}

	public void setPrece(Double prece) {
		this.prece = prece;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
