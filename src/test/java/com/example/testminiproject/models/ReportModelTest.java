package com.example.testminiproject.models;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ReportModelTest {

    ReportModel object1 = new ReportModel(1L,"Fern Yaowalak","หอพักYouare",222,"ขาเตียวหัก","666");
    @Test
    public void test01() {
        assertEquals(object1.getName(),"Fern Yaowalak");

    }

    @Test
    public void test02() {
        assertNotEquals(object1.getName(), "object");
    }

    @Test
    public void test03() {
        assertTrue(object1.getRoom() == 222);
    }

    @Test
    public void test04() {
        assertFalse(object1.getRoom() == 9);
    }

    @Test
    public void test05(){
        assertSame(object1.getImage(),"666");
    }

    @Test
    public void test06(){
        assertNotSame(object1.getDetails(),object1.getRoom());
    }

    @Test
    public void test07(){
        assertNotNull(object1);
    }
}