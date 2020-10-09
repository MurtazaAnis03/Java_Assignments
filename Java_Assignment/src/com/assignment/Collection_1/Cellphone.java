package com.assignment.Collection_1;

public class Cellphone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	
	public Cellphone(String company, String model, String description, String operatingSystem, double price) {
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null && this!=null && obj instanceof Cellphone) {
			if(this.company == ((Cellphone)obj).company && this.model == ((Cellphone)obj).model && this.operatingSystem == ((Cellphone)obj).operatingSystem){
				return true;
			}
			}
		return false;
	}
		
		public int hashCode() {
			return company.hashCode() ^ model.hashCode() ^ operatingSystem.hashCode();
		}
}
