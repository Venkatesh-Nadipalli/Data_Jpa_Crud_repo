package in.ashokit.service;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService {
   
	 private EmployeeRepository emprepo;
	 
	public EmployeeService(EmployeeRepository emprepo)
        {
		this.emprepo=emprepo;
		
		System.out.println(this.emprepo.getClass().getName());
		}
	
/*	public void saveEmployee() {
		
		Employee emp = new Employee();
		
		emp.setEmp_id(1003);
		emp.setEmp_name("gaani");
		emp.setEmp_salary(50000.00);
		emp.setEmp_gender("male");
		emp.setEmp_phno(1234567789);
		emp.setEmp_dept("sales");
		
		emprepo.save(emp);
	}*/
     public void saveMultipleEmployees() {
    	 
    	 Employee emp = new Employee();
 		
 		emp.setEmpId(1003);
 		emp.setEmpName("gaani");
 		emp.setEmpSalary(70000.00);
 		emp.setEmpGender("male");
 		emp.setEmpPhno(1234567789);
 		emp.setEmpDept("sales");
		
		Employee emp1 = new Employee();
		
		emp1.setEmpId(1001);
		emp1.setEmpName("jaani");
		emp1.setEmpSalary(50000.00);
		emp1.setEmpGender("male");
		emp1.setEmpPhno(1234567789);
		emp1.setEmpDept("sales");
		
        Employee emp2 = new Employee();
		
		emp2.setEmpId(1002);
		emp2.setEmpName("vaani");
		emp2.setEmpSalary(60000.00);
		emp2.setEmpGender("female");
		emp2.setEmpPhno(1234567789);
		emp2.setEmpDept("sales");
		
		List<Employee> empslist=Arrays.asList(emp1, emp2,emp);
		emprepo.saveAll(empslist);
	}
     
     public void getEmp()
     {
    	Optional<Employee>  findById = emprepo.findById(1002);
    	
    	if(findById.isPresent())
    	{
         Employee	employee = findById.get();
    	
    	System.out.println(employee);
    	}
     }
     public void getEmps()
     {
    	List<Integer> empIds= Arrays.asList(1002,1003);
    	
    	Iterable<Employee> itr= emprepo.findAllById(empIds);
    	
    	itr.forEach(System.out::println);
     }
     
    public void getAllEmps()
    {
    	Iterable<Employee> emps = emprepo.findAll();
    	emps.forEach(System.out::println);
    }
    
    public void count()
    {
    	long empscount = emprepo.count();
    	System.out.println(empscount);
    }
    
    public void existsbyid()
    {
    	 boolean empexist= emprepo.existsById(1001);
    	 System.out.println(empexist);
    }
    public void delateById()
    {
    	 emprepo.deleteById(1003);
    	 System.out.println("record deleted");
    	 Iterable<Employee> emps = emprepo.findAll();
     	emps.forEach(System.out::println);
    }
    public void delateAllByid()
    {
    	List<Integer>deleteallbyid=Arrays.asList(1002,1003);
    	
    	emprepo.deleteAllById(deleteallbyid);
    	 Iterable<Employee> emps = emprepo.findAll();
      	emps.forEach(System.out::println);
    }
   public void getEmpsBygender(String gender) {
    	List<Employee> emps = emprepo.findByEmpGender(gender);
    	emps.forEach(System.out::println);
    }
   public void getEmpsBydept(String dept)
   {
	    List<Employee> emps = emprepo.findByEmpDept(dept);
	    emps.forEach(System.out::println);
   }
   public void getEmpsByEmpgenderAnddept(String gender, String dept) {
	List<Employee> emps =  emprepo.findByEmpGenderAndEmpDept(gender, dept);
	emps.forEach(System.out::println);
   }
   public void getEmpSalary(double salary)
   {
	   List<Employee> emps = emprepo.findByEmpSalaryGreaterThanEqual(salary);
	   emps.forEach(System.out::println);
   }
   
   public void getElementsById(Integer id) {
	   Employee empid=emprepo.getElementById(id);
	   System.out.println(empid);
   }
   public void getEmpsAll()
   {
	   List<Employee> emps=emprepo.getemps();
	   emps.forEach(System.out::println);
   }
   public void getupdateempdepts(String ename,Integer eid)
   {
	 emprepo.getupdateempdept(ename,eid);
	
   }
   public void insertrecords(Integer eid,String ename,double esalary,Integer ephno,String egender,String edept) {
	   emprepo.insertrecord(eid, ename, esalary, ephno, egender, edept);
   }
}
