package com.assignment.Collection_1;

public class Television {
	private String company;
	private String type;
	private boolean enabled3D;
	private double price;
	
	public Television(String company, String type, boolean enabled3d, double price) {
		super();
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEnabled3D() {
		return enabled3D;
	}

	public void setEnabled3D(boolean enabled3d) {
		enabled3D = enabled3d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null && this!=null && obj instanceof Television) {
			if(this.company == ((Television)obj).company && this.type == ((Television)obj).type && this.price == ((Television)obj).price){
				return true;
			}
			}
		return false;
	}
		
		public int hashCode() {
			return company.hashCode() ^ type.hashCode();
		}
}