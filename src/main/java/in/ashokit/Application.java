package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context	= SpringApplication.run(Application.class, args);
	
	 EmployeeService service=context.getBean(EmployeeService.class);
	 
	 System.out.println(service.getClass().getName());
	 
	// service.saveEmployee();
	 
	service.saveMultipleEmployees();
	 
	// service.getEmp();
	 
	// service.getEmps();
	service.getAllEmps();
	 //service.count();
	// service.existsbyid();
	// service.delateById();
  //	service.delateAllByid();
  //service.getEmpsBygender("female");
 // service.getEmpsBydept("sales");
 // service.getEmpsByEmpgenderAnddept("female","sales");
 //  service.getEmpSalary(60000.00);
	//service.getElementsById(1001);
	//service.getEmpsAll();
	//service.getupdateempdepts("vayyari",1002);
	//service.insertrecords(1004,"lalli",80000.00,384742929,"female","service");
	}

}
