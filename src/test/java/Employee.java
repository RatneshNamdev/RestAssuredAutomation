
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.exception.JsonPathException;

import com.fasterxml.jackson.core.JsonProcessingException;


public class Employee {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int salary;
	private double age;
	private boolean married;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}


//class EmployeePOJO {
//	
//	@Test
//	public void employeeJSONFromEmployeePOJO() {
//		
//		Employee emp=new Employee();
//		
//		emp.setFirstName("Raj");
//		emp.setLastName("Malhotra");
//		emp.setGender("Male");
//		emp.setSalary(45000);
//		emp.setAge(26);
//		emp.setMarried(false);
//		
//		
//		ObjectMapper objectMapper = new ObjectMapper();
//		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
//		System.out.println(employeeJson); 
//		
//	}
//}

@Test
public void getPojoFromEmployeeObject() throws JsonPathException
{
	// Just create an object of Pojo class
	Employee employee = new Employee();
	// Set value as you wish
	employee.setFirstName("Amod"); 
	employee.setLastName("Mahajan");
	employee.setAge(29);
	employee.setGender("Male");
	employee.setSalary(3434343);
	employee.setMarried(false);
	
	// Converting a Java class object to a JSON payload as string
//	ObjectMapper objectMapper = new ObjectMapper();
//	String employeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
	
	JSONObject jsonObj=new JSONObject();
	
	// Converting EMployee json string to Employee class object
	//Employee employee2 = objectMapper.readValue(employeeJson, Employee.class);
	
	
	
}
}