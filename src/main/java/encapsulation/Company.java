package encapsulation;


public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("shivi");
        emp.setEmail(" shivi@gmail.com");
        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail());
    }
}
