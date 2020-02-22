package entities;

public class Employee {
	
	public String Name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary-tax;
	}
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage/100);
	}
	public String toString() {
		return Name + ", $" + String.format("%.2f", NetSalary());
		
	}

}
