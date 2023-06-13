package com.oops.Statickeyword;

public class Employee {
    int emp_id;
    String name;
    static String company = "Exaze";
      Employee( int emp_id, String name){
          this.emp_id =emp_id;
          this.name=name;

      }
      void display(){
          System.out.println(emp_id+" "+name+" "+company);
      }
    public static void main(String[] args) {
          Employee employee = new Employee( 101, "Vishal");
          Employee employee1 = new Employee( 109,"Namish");
          employee.display();
          employee1.display();



    }
}
