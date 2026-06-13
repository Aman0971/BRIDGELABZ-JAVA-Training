package org.Library_Management.library.publiclib;

import org.Library_Management.library.publiclib.config.SystemConfig;
import org.Library_Management.library.publiclib.factory.*;
import org.Library_Management.library.publiclib.model.LibraryMedia;
import org.junit.Assert;
import org.junit.Test;

public class PublicLibraryTest {
    @Test
    public void testSystemConfig() {
        SystemConfig c1 = SystemConfig.getInstance();
        SystemConfig c2 = SystemConfig.getInstance();
        Assert.assertSame(c1, c2);
        Assert.assertEquals("Oakridge Community Library",c1.getBranchName());
    }
    @Test
    public void testMediaFactory(){
        LibraryMedia l1 = MediaFactory.createMedia("PhysicalBook", "Godavari");
        System.out.println(l1.getTitle());
        Assert.assertEquals("Godavari",l1.getTitle());
    }
    @Test
    public void testAccountCreator(){
        AccountCreator adultCreator = new AdultAccountCreator();
        AccountCreator childCreator = new ChildAccountCreator();

        Account adult = adultCreator.createAccount();
        Account child = childCreator.createAccount();

        Assert.assertEquals(10,adult.getLimit());
        Assert.assertEquals(3,child.getLimit());
    }
    @Test
    public void testAdultWelcomePackFactory(){
        WelcomePackFactory factory = new AdultWelcomePackFactory();
        System.out.println(factory.createCardType());
        Assert.assertEquals("StandardCard",factory.createCardType());

        System.out.println(factory.createGift());
        Assert.assertEquals("BookPass",factory.createGift());
    }
}
