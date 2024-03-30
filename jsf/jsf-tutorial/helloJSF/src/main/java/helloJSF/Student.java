package helloJSF;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    List<String> countryOptions;

    public Student() {
        countryOptions = new ArrayList<String>();
        countryOptions.add("Brazil");
        countryOptions.add("France");
        countryOptions.add("Germany");
        countryOptions.add("India");
        countryOptions.add("Turkey");
        countryOptions.add("US");
        countryOptions.add("UK");
    }

    public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
