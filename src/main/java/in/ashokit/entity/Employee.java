package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
   
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private Integer empPhno;
	private String empGender;
	private String empDept;
	
	
public Employee(){
		
	}


public Employee(Integer empId, String empName, Double empSalary, Integer empPhno, String empGender, String empDept) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empPhno = empPhno;
	this.empGender = empGender;
	this.empDept = empDept;
}


public Integer getEmpId() {
	return empId;
}


public void setEmpId(Integer empId) {
	this.empId = empId;
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public Double getEmpSalary() {
	return empSalary;
}


public void setEmpSalary(Double empSalary) {
	this.empSalary = empSalary;
}


public Integer getEmpPhno() {
	return empPhno;
}


public void setEmpPhno(Integer empPhno) {
	this.empPhno = empPhno;
}


public String getEmpGender() {
	return empGender;
}


public void setEmpGender(String empGender) {
	this.empGender = empGender;
}


public String getEmpDept() {
	return empDept;
}


public void setEmpDept(String empDept) {
	this.empDept = empDept;
}


@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empPhno=" + empPhno
			+ ", empGender=" + empGender + ", empDept=" + empDept + "]";
}
	
	

	
	

}
