package utils;

import models.auth.Person;

public class Validator {

    public static boolean validatePerson(Person person) {
        return validateEmail(person.getEmail()) && validateName(person.getName())
                && validatePassword(person.getPassword()) && validateUsername(person.getUsername());
    }

    private static boolean validateEmail(String email) {
        String hotmailDomain = "hotmail.com";
        String gmailDomain = "gmail.com";
        String outlookDomain = "outlook.com";

        return email.contains("@") && ((email.contains(hotmailDomain)
                || email.contains(gmailDomain) || email.contains(outlookDomain)));
    }

    private static boolean validatePassword(String password) {
        return password.length() > 5;
    }

    private static boolean validateName(String name) {
        return name.length() > 5 && name.contains(" ");
    }

    private static boolean validateUsername(String username) {
        return !username.contains(" ") && !username.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
}
