package com.mvn.testng.project;


import org.testng.annotations.Test;

public class GroupExample {

    @Test(groups = {"login", "smoke"})
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(groups = {"regression"})
    public void logoutTest() {
        System.out.println("Logout Test");
    }

    @Test(groups = {"login"})
    public void invalidLoginTest() {
        System.out.println("Invalid Login Test");
    }
}

