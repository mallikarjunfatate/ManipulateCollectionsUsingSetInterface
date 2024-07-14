package JavaApllication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CompleOperation 
{
	private static Set<Person> filterByAge(Set<Person> persons, int age)
	{
		Set<Person>  result = new HashSet<Person>();
		for(Person person1 : persons)
		{
			if(person1.getAge() > age)
			{
				result.add(person1);
			}
		}
		return result;
		
	}
	public static void main(String[] args)
	{
		Set<Person> hashSet = new HashSet<>();
		Set<Person> linkedHashSet = new LinkedHashSet<Person>();
		
		Person p1 = new Person(1, "Pintu", 10);
		Person p2 = new Person(2, "Chintu", 20);  
		Person p3 = new Person(3, "bablu", 90);
		Person p4 = new Person(4, "gotu", 13);
		Person p5 = new Person(7, "nagesh", 12);
		
		// add person in hashset.
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		
		// add persons in linkedHashset
		linkedHashSet.add(p3);
		linkedHashSet.add(p4);
		linkedHashSet.add(p5);
		
		
		// Find the Person with the maximum and minimum age in both sets without using TreeSet.
		
		Person maxAgeOfPerson = Collections.max(hashSet, Comparator.comparingInt(person -> person.getAge()));
		System.out.println("Maximum Age of person :: "+ maxAgeOfPerson);
		
		Person minAgeOfPerson = Collections.min(hashSet, Comparator.comparingInt(person -> person.getAge()));
		System.out.println("Minimum Age of person :: "+ minAgeOfPerson);
		
		// Persons sort by Age in HashSet
		List<Person> forHashSet = new ArrayList<Person>(hashSet);
		forHashSet.sort(Comparator.comparingInt(person ->person.getAge()));
		System.out.println("Sorting Persons in HashSet by Age :: "+forHashSet);
		
		// Persons sort by Age in LinkedHashset
		List<Person> forLinkedHashset = new ArrayList<Person>(linkedHashSet);
		forLinkedHashset.sort(Comparator.comparingInt(person -> person.getAge()));
		System.out.println("Sorting Persons in LinkedHashSet by Age :: "+forLinkedHashset);
		
		// Filter HashSet by age
		Set<Person> filterSet = filterByAge(hashSet,10);
		System.out.println("filter hashSet by Age > 10"+ filterSet);
			
		// Filter linkedHashSet by age
		
		Set<Person> filterLinkedHashSet = filterByAge(linkedHashSet, 12);
		System.out.println("Filter LinkedHashSet by age > 12"+ filterLinkedHashSet);
	}
}
