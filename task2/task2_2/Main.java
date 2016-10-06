public class Main {
	public static void main(String[] args){
		String nameOfEmployee = "Hulio", lastnameOfEmployee = "Rediskas", positionOfEmployee = "programmer";
		Short numberOfRoom = 33;
		String nameOfDepartment = "Department of crazy geniuses";
		
		Employee employee = new Employee(nameOfEmployee, lastnameOfEmployee, positionOfEmployee);
		Room room = new Room(numberOfRoom);
		Department department = new Department(nameOfDepartment);
		
		employee.setRoom(room);
		employee.setDepartment(department);
		
		//System.out.println();
		//System.out.println("Name: " + employee.getName());
		//System.out.println("Lastname: " + employee.getLastname());
		//System.out.println("Work: " + employee.getPosition());
		//System.out.println();
		System.out.println(employee);
		//System.out.println("In: " + employee.getDepartment());
		//System.out.println("In " + employee.getRoom() + " room");
	}
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------
class Man {
	protected String name;
	protected String lastname;
	
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return name;
	}
	public void setLastname(String newLastname){
		this.lastname = newLastname;
	}
	public String getLastname(){
		return lastname;
	}
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------
class Employee extends Man {
	private String position;
	private Room room;
	private Department department;
	
	public Employee(String n, String ln, String p){
		this.name = n;
		this.lastname = ln;
		this.position = p;
		System.out.println("Created new object of <<< EMPLOYEE >>> class which extends class MAN!");
	}
		@Override
	public String toString(){
        return this.name + " " + this.lastname + " " + this.position + "  work in " + this.department+ " in room - " + this.room;
	    }
	    
	public void setPosition(String newPosition){
		this.position = newPosition;
	}
	public String getPosition(){
		return position;
	}
	public void setRoom(Room r){
		this.room = r;
	}
	public Room getRoom(){
		return room;
	}
	public void setDepartment(Department d){
		this.department = d;
	}
	public Department getDepartment(){
		return department;
	}
	

}
//-------------------------------------------------------------------------------------------------------------------------------------------------------
class Room {
	Short number;
	
	public Room(Short n){
		this.number = n;
		System.out.println("Created new object of <<< ROOM >>> class!");
	}
	
	@Override
	public String toString(){
		return Short.toString(number);
	}
	public void setNumber(Short newNum){
		this.number = newNum;
	}
	public Short getNumber(){
		return number;
	}
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------
class Department {
	String name;
	
	public Department(String newNameDep){
		this.name = newNameDep;
		System.out.println("Created new object of <<< DEPARTMENT >>> class!");
	}
	@Override
	public String toString(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return name;
	}
}