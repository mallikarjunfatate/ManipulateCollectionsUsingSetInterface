package JavaApllication;

public class Person 
{
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Person() 
	{
		
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() 
	{
		return Integer.hashCode(id);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(this == obj)
			return true;
		if(obj == null || getClass()!= obj.getClass())
			return false;
		
		Person person = (Person)obj;
		return id == person.id;
	}
	
	
	
}
