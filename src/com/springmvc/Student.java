package com.springmvc;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private LinkedHashMap<String, String> favouriteLanguageMap;
    private String[] operatingSystems;

//    private LinkedHashMap<String, String> countryOptions;

    public Student() {

        favouriteLanguageMap = new LinkedHashMap<>();

        favouriteLanguageMap.put("Java", "Java");
        favouriteLanguageMap.put("C#", "C#");
        favouriteLanguageMap.put("PHP", "PHP");
        favouriteLanguageMap.put("Ruby", "Ruby");

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

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getFavouriteLanguageMap() {
        return favouriteLanguageMap;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    //    public Map<String, String> getCountryOptions() {
//        return countryOptions;
//    }
//
//    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
//        this.countryOptions = countryOptions;
//    }
}
