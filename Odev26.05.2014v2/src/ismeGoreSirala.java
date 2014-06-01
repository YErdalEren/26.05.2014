import java.util.Comparator;


public class ismeGoreSirala implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return new String (p1.getFirstname()).compareTo(p2.getFirstname());
	}

}
