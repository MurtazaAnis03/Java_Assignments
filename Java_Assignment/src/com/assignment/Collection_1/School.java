package com.assignment.Collection_1;

public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null && this!=null && obj instanceof School) {
			if(this.name == ((School)obj).name && this.city == ((School)obj).city && this.schoolDistrict == ((School)obj).schoolDistrict){
				return true;
			}
			}
		return false;
	}
		
		public int hashCode() {
			return name.hashCode() ^ city.hashCode() ^ schoolDistrict.hashCode();
		}
}
