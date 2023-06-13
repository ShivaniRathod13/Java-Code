package encapsulation;

import com.oops.encapsulation.Company;
import com.oops.encapsulation.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncapsulationTest {

    Company company = new Company();

    @Test
   public void company(){
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("shivi");
        emp.setEmail("shivi@gmail.com");
//        assertEquals(104,emp.getId());
        assertTrue(emp.getId()==101);

    }


}
