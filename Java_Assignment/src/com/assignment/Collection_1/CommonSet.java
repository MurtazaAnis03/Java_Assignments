package com.assignment.Collection_1;

import java.util.HashSet;
import java.util.Set;

public class CommonSet<T> {
	private Set<T> set= new HashSet<>();
	
	public void addInstance(T instance) {
		set.add(instance);
	}
	
	public Set<T> getInstance(){
		return set;
	}
	
	public void display() {
		System.out.println(set.getClass().getSimpleName());
	}
}