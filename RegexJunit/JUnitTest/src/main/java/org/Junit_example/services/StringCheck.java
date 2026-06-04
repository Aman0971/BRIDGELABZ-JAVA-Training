package org.Junit_example.services;

public class StringCheck
{
    public String reverse(String s){
         StringBuilder sb =  new StringBuilder(s);
         return sb.reverse().toString();
    }

    public boolean isPalindrome(String st){
        StringBuilder sb  = new StringBuilder(st);
        return st.equalsIgnoreCase(sb.reverse().toString());
    }
}
