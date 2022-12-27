package edu.Anastasiia;

import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        String input = "anastaisha_580@gmail.com";
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(com|org)";
        System.out.println(Pattern.matches(regex, input));
    }
}
