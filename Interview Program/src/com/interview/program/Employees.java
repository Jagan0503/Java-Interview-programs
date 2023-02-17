package com.interview.program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Employees {
    public static List<Employee> removeDuplicates(List<Employee> employees){	
    	Set<Employee> set=new LinkedHashSet(employees);
    	List<Employee> list=new ArrayList(set);
    	return list;
    }
public static class Employee{
		
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}

		Integer empId;
        String empName;
        String dept;
        
    public Employee(Integer empId,String empName, String dept) {
            this.empId=empId;
            this.empName=empName;
            this.dept=dept;
        }
        
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // PrintWriter wr=new PrintWriter(System.out);
        //int n=Integer.parseInt(br.readLine().trim());
        List<Employee> employees=new ArrayList();
        for(int i=0;i<3;i++) {
            String []emp=br.readLine().split(" ");
            Employee e=new Employee(Integer.parseInt(emp[0]),emp[1],emp[2]);
            employees.add(e);
        }
        
        List<Employee> out_=removeDuplicates(employees);
        for(int j=0;j<out_.size();j++) {
            System.out.print(out_.get(j).empId);
            System.out.print(" ");
            System.out.print(out_.get(j).empName);
            System.out.print(" ");
            System.out.print(out_.get(j).dept);
            System.out.println();
            
        }
        
        //wr.close();
        br.close();
        
    }
    }
}