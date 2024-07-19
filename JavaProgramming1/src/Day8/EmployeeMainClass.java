package Day8;

public class EmployeeMainClass {

	
		
		public static void main(String[] args) {
			Employee emp1 = new Employee();
			emp1.eid = 101;
			emp1.ename = "john";
			emp1.job = "Engineer";
			emp1.esal = 5000;
			emp1.display();
			Employee emp2=new Employee();
			emp2.eid=102;
			emp2.ename="Scott";
			emp2.job="Manager";
			emp2.esal=7000;
			emp2.display();

		}

	}


