package JavaApllication;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Conference 
{
	private Set<Person> attendees = new HashSet<>();

    // Method to add attendees
    public void addAttendee(Person person) 
    {
        attendees.add(person);
    }

    // Method to remove an attendee
    public void removeAttendee(Person person) 
    {
        attendees.remove(person);
    }

    // Find duplicate attendees based on id
    public Set<Person> findDuplicateAttendees() 
    {
        Set<Person> uniqueAttendees = new HashSet<>();
        Set<Person> duplicates = new HashSet<>();

        for (Person attendee : attendees) 
        {
            if (!uniqueAttendees.add(attendee)) 
            {
                duplicates.add(attendee);
            }
        }
        return duplicates;
    }

    // List all unique attendees
    public Set<Person> listUniqueAttendees() 
    {
        return new HashSet<>(attendees);
    }
    
    public void printAllAttendees() 
    {
        for (Person attendee : attendees) 
        {
            System.out.println(attendee);
        }
    }
    // Find attendees within a certain age range
    public Set<Person> findAttendeesByAgeRange(int minAge, int maxAge)
    {
        return attendees.stream()
                .filter(person -> person.getAge() >= minAge && person.getAge() <= maxAge)
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) 
	{
		Conference conference = new Conference();

        // Add some attendees
		 conference.addAttendee(new Person(1, "Arjun", 30));
	        conference.addAttendee(new Person(2, "Shivam", 25));
	        conference.addAttendee(new Person(3, "Balu", 35));
	        conference.addAttendee(new Person(1, "Arjun", 30)); // Duplicate based on id
	        
	        // Print all attendees
	        System.out.println("All Attendees:");
	        conference.printAllAttendees();
	        
	        

        // Find duplicate attendees
        Set<Person> duplicates = conference.findDuplicateAttendees();
        System.out.println("Duplicate Attendees: " + duplicates);

        // List unique attendees
        Set<Person> uniqueAttendees = conference.listUniqueAttendees();
        System.out.println("Unique Attendees: " + uniqueAttendees);

        // Find attendees in a specific age range
        Set<Person> attendeesInRange = conference.findAttendeesByAgeRange(25, 35);
        System.out.println("Attendees in Range 25-35: " + attendeesInRange);
	}
}
