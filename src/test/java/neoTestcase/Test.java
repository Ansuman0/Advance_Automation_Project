package neoTestcase;

import java.util.HashMap;
import java.util.Map;


public class Test {

	
	String empName ;
	String empAdress ;
	String empId;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	Test(String empName,String empAdress,
	String empId) {
		setEmpAdress(empAdress);
		setEmpId(empId);
		setEmpName(empName);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpAdress()+" "+getEmpId()+" "+getEmpName();
	}
	
	public static void main(String[] args) {
	Object a=	new Test("Test1", "Test2", "Test3");
	
		
		Map <String ,Object> map = new HashMap< >();
		
		map.put("EmpValues",a );
		
		map.forEach((key, value) -> System.out.println(key + ":" + value));
		
		for(@SuppressWarnings("rawtypes") Map.Entry map1 :map.entrySet()) {
			System.out.println(map1.getKey() + " : " + map1.getValue());
			
		}
		
		
	
	}

}
