package com.springmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class Student {

    private String firstName;
    private String lastName;
    private String country;

//    @Value("#{countryOptions}")
//    private Map<String, String> countryOptions;

    public Student() {
        // populate country options: used ISO country code
//        countryOptions = new LinkedHashMap<>();
//        countryOptions.put("AT", "Austria");
//        countryOptions.put("DE", "Germany");
//        countryOptions.put("PL", "Poland");
//        countryOptions.put("UK", "United Kingdom");
//        countryOptions.put("FR", "France");
//        countryOptions.put("US", "United States of America");
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

//    public Map<String, String> getCountryOptions() {
//        return countryOptions;
//    }
//
//    public void setCountryOptions(Map<String, String> countryOptions) {
//        this.countryOptions = countryOptions;
//    }
}
