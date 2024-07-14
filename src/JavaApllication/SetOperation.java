package JavaApllication;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperation 
{
	// two set of hashset 
	Set<Person> hashSet1 ;
	Set<Person> hashSet2 ;
	
	// two set of linked hashset
	
	Set<Person> linkedHashset1; 
	Set<Person> linkedHashset2; 
	
	public SetOperation()
	{
		hashSet1 = new HashSet<Person>();
		hashSet2 = new HashSet<Person>();
		
		linkedHashset1 = new LinkedHashSet<Person>();
		linkedHashset2 = new LinkedHashSet<Person>();
	}
	
	public boolean addPersonToHashSet1(Person person) 
	{
		return hashSet1.add(person);
	}
	public boolean addPersonToHashSet2(Person person) 
	{
		return hashSet2.add(person);
	}
	public boolean addPersonToLinkedHashSet1(Person person) 
	{
		return linkedHashset1.add(person);
	}
	public boolean addPersonToLinkedHashSet2(Person person) 
	{
		return linkedHashset2.add(person);
	}
	
	public Set<Person> union(Set<Person> s1, Set<Person> s2)
	{
		Set<Person> result = new HashSet<Person>(s1);
		 result.addAll(s2);
		return result;
	}
	public Set<Person> interSection(Set<Person> s1, Set<Person> s2)
	{
		Set<Person> result = new HashSet<Person>(s1);
		 result.retainAll(s2);
		return result;
	}
	public Set<Person> difference(Set<Person> s1, Set<Person> s2)
	{
		Set<Person> result = new HashSet<Person>(s1);
		 result.removeAll(s2);
		return result;
	}
	
	public void printingSet(Set<Person> set)
	{
		for(Person person : set)
		{
			System.out.println(person);
		}
	}
	
	public static void main(String[] args) 
	{
		SetOperation setsOperation = new SetOperation();
		// adding person usiing hashset ; 
		
		Person p1 = new Person(1, "Pintu", 10);
		Person p2 = new Person(2, "Chintu", 20);  
		Person p3 = new Person(3, "bablu", 90);
		Person p4 = new Person(4, "gotu", 13);
		Person p5 = new Person(7, "nagesh", 12);
		Person duplicate = new Person(2, "chintu", 20);
		
		// adding person to hash Set 1
		
		setsOperation.addPersonToHashSet1(p1);
		setsOperation.addPersonToHashSet1(p2);
		setsOperation.addPersonToHashSet1(p3);
		setsOperation.addPersonToHashSet1(duplicate);
		
		// adding persin to HashSet 2

		setsOperation.addPersonToHashSet2(p4);
		setsOperation.addPersonToHashSet2(p3);
		setsOperation.addPersonToHashSet2(p5);
		
		// adding Person to LinkedHashset 1
		
		setsOperation.addPersonToLinkedHashSet1(p1);
		setsOperation.addPersonToLinkedHashSet1(p2);
		setsOperation.addPersonToLinkedHashSet1(p3);
		setsOperation.addPersonToLinkedHashSet1(p4);
		setsOperation.addPersonToLinkedHashSet1(duplicate);
		
		// adding Person to LinkedHashset 2
		
		setsOperation.addPersonToLinkedHashSet2(p5);
		setsOperation.addPersonToLinkedHashSet2(p3);
		setsOperation.addPersonToLinkedHashSet2(p4);
		
		// Performing set operations on HashSet
		System.out.println("Hash Set Operations :: ");
		
		Set<Person> unionHashset = setsOperation.union(setsOperation.hashSet1, setsOperation.hashSet2);
		Set<Person> intersectionHashSet = setsOperation.interSection(setsOperation.hashSet1, setsOperation.hashSet2);
		Set<Person> differenceHashSet1 = setsOperation.difference(setsOperation.hashSet1, setsOperation.hashSet2);
		Set<Person> differenceHashSet2 = setsOperation.union(setsOperation.hashSet2, setsOperation.hashSet1);
		
		System.out.println("Union of HashSets:");
		setsOperation.printingSet(unionHashset);

        System.out.println("Intersection of HashSets:");
        setsOperation.printingSet(intersectionHashSet);

        System.out.println("Difference of HashSet1 - HashSet2:");
        setsOperation.printingSet(differenceHashSet1);

        System.out.println("Difference of HashSet2 - HashSet1:");
        setsOperation.printingSet(differenceHashSet2);
        
        // Performing Set Operation on LinkedHashSet
        
        System.out.println("\nLinkedHashSet Operations :: ");
        Set<Person> unionLinkedHashSet = setsOperation.union(setsOperation.linkedHashset1, setsOperation.linkedHashset2);
        Set<Person> intersectionLinkedHashSet = setsOperation.interSection(setsOperation.linkedHashset1, setsOperation.linkedHashset2);
        Set<Person> differenceLinkedHashSet1 = setsOperation.difference(setsOperation.linkedHashset1, setsOperation.linkedHashset2);
        Set<Person> differenceLinkedHashSet2 = setsOperation.difference(setsOperation.linkedHashset2, setsOperation.linkedHashset1);
        
        System.out.println("Union of LinkedHashSets:");
        setsOperation.printingSet(unionLinkedHashSet);

        System.out.println("Intersection of LinkedHashSets:");
        setsOperation.printingSet(intersectionLinkedHashSet);

        System.out.println("Difference of LinkedHashSet1 - LinkedHashSet2:");
        setsOperation.printingSet(differenceLinkedHashSet1);

        System.out.println("Difference of LinkedHashSet2 - LinkedHashSet1:");
        setsOperation.printingSet(differenceLinkedHashSet2);
	}
}
