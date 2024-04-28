package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

	public List<Employee> findByEmpGender(String gender);
	
	public List<Employee> findByEmpDept(String dept);
	
	public List<Employee> findByEmpGenderAndEmpDept(String gender ,String dept);
	
	public List<Employee> findByEmpSalaryGreaterThanEqual(double salary);
	
	@Query("from Employee where empId = :id")
	public Employee getElementById(Integer id);
	
	@Query("from Employee")
	public List<Employee> getemps();
	
	@Transactional
	@Modifying
	@Query("update Employee  set empName = :ename where empId= :eid")
	public void getupdateempdept(@Param("ename")String edept,@Param("eid")Integer eid);
	
	@Transactional
	@Modifying
	@Query("insert into Employee (empId,empName,empSalary,empPhno,empGender,empDept) values(:eid,:ename,:esalary,:ephno,:egender,:edept)")
	public void  insertrecord(@Param("eid")Integer eid,@Param("ename")String ename,@Param("esalary")double esalary,@Param("ephno")Integer ephno,@Param("egender")String egender,@Param("edept")String edept);
	
	
}
