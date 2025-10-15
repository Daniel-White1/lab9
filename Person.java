import java.util.*;

public class Person{
	
	String firstname;
	String lastname;
	int age;
	Address address;
	public static int count;

	public Person(String first, String last, int age, Address address){
		this.firstname = first;
		this.lastname = last;
		this.age = age;
		this.address = address;

		count++;
	}

	public static int getCount(){
		return count;
	}

	public String toString(){
		return firstname + " " + lastname + "\n\t" + age + " years old" + address.toString();
	}

	public String getFirstName(){
		return firstname;
	}

	public String getLastName(){
		return lastname;
	}

	public static String sortPeople(ArrayList<Person> people){
        for (int i = 0; i < people.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < people.size(); j++) {
                Person current = people.get(j);
                Person minPerson = people.get(minIndex);

				//This was set up to be sorted by first name than last name instead of alphabetized order
				//which is last name then by first name. I guess I should have payed attention more in english class to find this quicker
                if (current.getLastName().compareTo(minPerson.getLastName()) < 0 ||
                    (current.getLastName().equals(minPerson.getLastName()) &&
					 current.getFirstName().compareTo(minPerson.getFirstName()) < 0)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Person temp = people.get(i);
                people.set(i, people.get(minIndex));
                people.set(minIndex, temp);
            }
        }

        String result = "";
		//not entirely sure if I beansed up the tester so I recopied it across from the orignial file again
		//I noticed the last item on the list doesnt have a \n so we need to add in a counter so we know we are on the last element
		//theres probably a short hand but im just going to do a simple counter
		int counter = 0;
        for (Person p : people){
			if (counter == people.size() - 1) {
        		result = result + p.getFirstName() + " " + p.getLastName();
			} else {
        		result = result + p.getFirstName() + " " + p.getLastName() + "\n";
			}
			counter++;
        }
        return result.substring(0, result.length());
    }		
}