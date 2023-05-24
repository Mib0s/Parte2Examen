/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package pruebasunitarias;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author belli
 */
public class MatricadNGTest {
    
    public MatricadNGTest() {
    }

    
     static String[] cadena;
    @BeforeClass
    public static void setUpClass() throws Exception {
         cadena = new String[]{"hui", "és", "dilluns", "i", "no", "m'agrada", "gens"}; 
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Matricad.
     */
    
    
    /*
        @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        Matricad instance = new Matricad(cadenes);
        String expResult = "m'agrada";
        String result = instance.getMaxCad();
        assertEquals(result, expResult);
//         TODO review the generated test code and remove the default call to fail.
//         fail("The test case is a prototype.");
    }
    */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = ' ';
        Matricad instance = new Matricad(cadena);
        int expResult = 1;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon2() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = 'h';
        Matricad instance = new Matricad(cadena);
        int expResult = 1;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon3() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = ' ';
        Matricad instance = null;
        int expResult = 0;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Matricad.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 't';
        Matricad instance = null;
        boolean expResult = false;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConcatenacionCadenas method, of class Matricad.
     */
    @Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Matricad instance = null;
        String expResult = "";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicionesDe method, of class Matricad.
     */
    @Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "";
        Matricad instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
