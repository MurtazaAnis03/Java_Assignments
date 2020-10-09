package com.assignment.Collection_1;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		CommonSet<Laptop> laptop = new CommonSet<Laptop>();
		Laptop dell = new Laptop("Dell", "D1", "Windows", "Core i5");
		Laptop hp = new Laptop("HP", "H1", "Windows", "Core i7");
		Laptop macBook = new Laptop("Apple", "MacBookPro", "IOS", "Core i7");
		laptop.addInstance(dell);
		laptop.addInstance(hp);
		laptop.addInstance(macBook);
		
		CommonSet<Car> car = new CommonSet<>();
		Car i10 = new Car("Hyundai", "i10", 2019, 350000);
		Car benz = new Car("Mercedes", "Benz", 2020, 100000);
		Car duster = new Car("Hyundai", "Duster", 2018, 550000);
		car.addInstance(i10);
		car.addInstance(benz);
		car.addInstance(duster);
		
		CommonSet<Television> television = new CommonSet<Television>();
		Television mi = new Television("MI", "LCD", false, 30000);
		Television sony = new Television("SONY", "LED", true, 45000);
		Television samsung = new Television("SAMSUNG", "PLASMA", true, 50000);
		television.addInstance(mi);
		television.addInstance(sony);
		television.addInstance(samsung);
		
		CommonSet<Cellphone> cellphone = new CommonSet<>();
		Cellphone A71 = new Cellphone("samsung", "A71", "ABC", "Android", 24000);
		Cellphone nord = new Cellphone("OnePlus", "nord", "PQR", "Android", 29000);
		Cellphone iPhone11 = new Cellphone("iPhone", "ProMax", "XYZ", "IOS", 99000);
		cellphone.addInstance(A71);
		cellphone.addInstance(nord);
		cellphone.addInstance(iPhone11);
		
		CommonSet<School> school = new CommonSet<>();
		School emrald = new School("Emrald", "Indore", "Indore", 5);
		School msb = new School("MSB", "Indore", "Indore", 2);
		School sms = new School("SMS", "Barwani", "Barwani", 10);
		school.addInstance(emrald);
		school.addInstance(msb);
		school.addInstance(sms);
		
		Set<Laptop> laptops = laptop.getInstance();  
		System.out.println("LAPTOPS");
		for(Laptop l : laptops) {
			System.out.println("Company: "+l.getCompany()+", Model: "+l.getModel()+", Operating System: "+l.getOperatingSystem()+", Processor: "+l.getProcessor());
		}
		
		Set<Car> cars = car.getInstance();  
		System.out.println("CARS");
		for(Car c : cars) {
			System.out.println("Manufacturer: "+c.getMake()+", Model: "+c.getModel()+", Year: "+c.getYear()+", Price: "+c.getPrice());
		}
		
		Set<Television> tvs = television.getInstance();  
		System.out.println("TELEVISION SETS");
		for(Television tv : tvs) {
			System.out.println("Company: "+tv.getCompany()+", Type: "+tv.getType()+", 3D Enabled: "+tv.isEnabled3D()+", Price: "+tv.getPrice());
		}
		
		Set<Cellphone> phones = cellphone.getInstance();  
		System.out.println("CELLPHONES");
		for(Cellphone cp : phones) {
			System.out.println("Company: "+cp.getCompany()+", Model: "+cp.getModel()+", Descripton: "+cp.getDescription()+", Operating System: "+cp.getOperatingSystem()+", Price: "+cp.getPrice());
		}
		
		Set<School> schools = school.getInstance();  
		System.out.println("SHOOLS");
		for(School s : schools) {
			System.out.println("Name: "+s.getName()+", City: "+s.getCity()+", School District: "+s.getSchoolDistrict()+", School Ranking: "+s.getGreatSchoolRanking());
		}
		
		TreeSet<Car> orderCarName = new TreeSet<Car>();
		orderCarName.add(i10);
		orderCarName.add(benz);
		orderCarName.add(duster);
		for(Car c : orderCarName) {
			System.out.println("Model Name: "+c.getModel());
		}
		
		TreeSet<String> sclName = new TreeSet<String>();
		for(School s : schools) {
			sclName.add(s.getName());
		}
		for(String str : sclName) {
			System.out.println(str);
		}
	}
}