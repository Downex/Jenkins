/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;

import static org.testng.Assert.*;
import org.testng.annotations.*;
/**
 *
 * @author Admin
 */
public class TestNGDependTest {
    @Test(groups = {"init"})
    public void method1() {
    System.out.println("@Test: method1");
    assertTrue(false); // essayer true et false respectivement
    }
    @Test(groups = {"init", "post-init"})
    public void method2() {
    System.out.println("@Test: method2");
    }
    @Test(groups = {"main"}, dependsOnGroups={"init"})
    public void method3() {
    System.out.println("@Test: method3");
    }
}
