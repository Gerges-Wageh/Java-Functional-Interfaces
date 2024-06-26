package functionalInterfeaces;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        // Using Normal Regular Function
        System.out.println(isPhoneNumberValid("01286516312"));
        System.out.println(isPhoneNumberValid("01122355"));
        System.out.println(isPhoneNumberValid("12345678912"));

        // Using Predicate Functional Interface
        System.out.println(isPhoneNumberValidPredicate.test("01286516312"));
        System.out.println(isPhoneNumberValidPredicate.test("01122355"));
        System.out.println(isPhoneNumberValidPredicate.test("12345678912"));

        // Chaining Predicates
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("01286516312"));


    }

    // Normal Regular Function
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("01") && phoneNumber.length() == 11;
    }


    // Predicate Functional Interface
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("01") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");

}
