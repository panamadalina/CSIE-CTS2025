//package ..*

public class Employee
{
    private int ID;
	private String Name;

	Employee() { }
    public Employee(int id, String name)
    {
        this.ID = id;
        this.Name = name;
    }

    

    public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name +"]";
	}
	public float CalculateBonus(float salary)
    {
        return salary*.1f;
        		
    }
	
}