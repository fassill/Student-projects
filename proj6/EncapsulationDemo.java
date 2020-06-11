package proj6;

import java.util.Scanner;

public class EncapsulationDemo {
	
	private String fname;
	private String lname;
	private int age;
	private double salry;
	private double bonus;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 18) {
			this.age = age;
		}
	}
	public double getSalry() {
		return salry;
	}
	public void setSalry(double salry) {
		this.salry = salry;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	private class EncapDemo{
		// implementaion
	}
	
	
	

}
