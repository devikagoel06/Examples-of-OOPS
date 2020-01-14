//Encapsulation in java

package encap_prog;

class Employee
{
    private int emp_id;
    public void setEmpId(int eid)
            
    {
        emp_id=eid;
    }
    public int getId()
    {
        return emp_id;
    }
}
public class Encap_prog {

    
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmpId(100);
        System.out.println(e.getId());
    }
    
}
