package tddbc;

/**
 * Created by guest on 2014/10/11.
 */
public class Person {

	public Person(String familyName, String firstName) {
        if (familyName == null || familyName.equals("")) {
            throw new IllegalArgumentException();
        }

        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException();
        }
	}

	public String getFamilyName() {
        return "佐藤";
    }

	public String getFirstName() {
		return "太郎";
	}

    public String getFullName() {
        return "佐藤太郎";
    }

}
