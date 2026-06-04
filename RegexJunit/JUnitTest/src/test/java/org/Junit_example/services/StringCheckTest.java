package org.Junit_example.services;
import org.junit.*;
import org.junit.Assert.*;
import org.junit.Test;

public class StringCheckTest {
    StringCheck stc = new StringCheck();
    @Test
    public void reverseTest(){
        String t = stc.reverse("Aman");
        Assert.assertEquals("namA" , t);
    }
    @Test
    public void isPalindromeTrueTest(){
        boolean p = stc.isPalindrome("madam");
        Assert.assertTrue(p);
    }
    @Test
    public void isPalindromeFalseTest(){
        boolean b = stc.isPalindrome("man");
        Assert.assertFalse(b);
    }
}
