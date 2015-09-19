package com.company.QAFactory;

/**
 * Created by Alexander on 06.08.2015.
 */
public class HW6_2 {
    public static void sayHello() {
        System.out.println("Hello Class!");
    }
    public static String hello() {
        return "Hello Engineers!";
    }
    public static String hello(String who) {
        return "Hello " + who;
    }
    public static void test(String exp, String act) {
        if(exp.equals(act)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
    }
    public static String hello(int howMany) {
        if(howMany >= 2) {
            return "Hello to all " + howMany + " students!";
        } else {
            if(howMany == 1) {
                return "Hello student!";
            } else {
                if(howMany == 0) {
                    return "No one came.";
                }
            }
        }
        return "Test PASSED";
    }
//    public static String hello(int howMany, String whom) {
//
//    }

    public static void main (String[] hw62) {
        sayHello();
        // Hello Class!
        System.out.println(hello());
        // Hello Engineers!
        System.out.println(hello("Friends"));
        // Hello Friends
        System.out.println(hello("Friends").equals(hello("Friends")));
        // true
        System.out.println(hello("Friends") == hello("Friends"));
        // false
        test("Hello Engineers!", hello());
        // Test PASSED.
        test("Hello Enginers!", hello());
        // Test FAILED.
        // Expected: Hello Engineers!
        // Actual:   Hello Enginers!
        test("Hello Friends", hello("Friends"));
        // Test PASSED.
        test("Hello Good Men", hello("Good Men"));
        // Test PASSED.
        test("Hello to all 14 students!", hello(14));
        // Test PASSED.
        test("Hello student!", hello(1));
        // Test PASSED.
        test("No one came.", hello(0));
        // Test PASSED.



    }
}
