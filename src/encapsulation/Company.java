package encapsulation;


class Employee{
    private int id; //data-hiding
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("shivi");
        emp.setEmail(" shivi@gmail.com");
        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail());
    }
}
