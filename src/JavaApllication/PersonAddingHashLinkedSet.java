package JavaApllication;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonAddingHashLinkedSet 
{
	private Set<Person> hashset;
	private Set<Person> linkedHashset;
	
	public PersonAddingHashLinkedSet()
	{
		hashset = new HashSet<Person>();
		linkedHashset = new LinkedHashSet<Person>();
	}
	
	public boolean addPersonInHashSet(Person person)
	{
		return hashset.add(person);
	}
	public boolean addPersonInLinkedHashSet(Person person)
	{
		return linkedHashset.add(person);
	}
	
	public boolean printHashSet()
	{
		for(Person person: hashset)
		{
			System.out.println(person);
		}
		return true;
	}
	public boolean printLinkedHashSet()
	{
		for(Person person: linkedHashset)
		{
			System.out.println(person);
			
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		PersonAddingHashLinkedSet hashPerson = new PersonAddingHashLinkedSet();
		hashPerson.hashset.add(new Person(1, "arjun", 19));
		hashPerson.hashset.add(new Person(2, "shivam", 29));
		hashPerson.hashset.add(new Person(4, "risky", 9));
		hashPerson.hashset.add(new Person(2, "arjun", 10));
		
		PersonAddingHashLinkedSet linkesHashPerson = new PersonAddingHashLinkedSet();
		linkesHashPerson.linkedHashset.add(new Person(1, "arjun", 19));
		linkesHashPerson.linkedHashset.add(new Person(2, "shivam", 29));
		linkesHashPerson.linkedHashset.add(new Person(4, "risky", 9));
		linkesHashPerson.linkedHashset.add(new Person(1, "arjun", 19));
		
		System.out.println(hashPerson.printHashSet());
		System.out.println(linkesHashPerson.printLinkedHashSet() );
	}
}
