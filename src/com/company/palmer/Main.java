package com.company.palmer;

public class Main {

    public static void main(String[] args) {

        String city = "Galloway";
        int zipCode = 43119;
        double weather[] = {43, 33, 27, 31, 34};

        System.out.println("City: " + city + " Zip Code: " + zipCode + " Average High Temperature: " + ((weather[0] + weather[1] + weather[2] + weather[3] + weather[4]) / 5));

    }
}
