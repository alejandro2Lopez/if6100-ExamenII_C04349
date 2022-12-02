/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ale1j
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }
 

   /**
     * Test of findbonus method, of class Aguinaldo.
     * Comprabando la condición de codigo numero 1 (-1)
     * La fecha inicial debe ser anterior a la final
     */
    @Test
    public void testFindbonusC1() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Probando Código 1");
        LocalDateTime startDate =  LocalDateTime.parse("2021-03-09 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2020-03-09 10:30", formatter);
        float amount = 1000000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
     
    }
    /**
     * Test of findbonus method, of class Aguinaldo.
     * Comprabando la condición de codigo numero 2 (-2)
     * Si el monto es menor 300000 no se puede hacer el cálculo
     */
     public void testFindbonusC2() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Probando Código 2");
        LocalDateTime startDate =  LocalDateTime.parse("2021-03-09 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-03-09 10:30", formatter);
        float amount = 100000;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
     
    }
         /**
     * Test of findbonus method, of class Aguinaldo.
     * Comprabando la condición de codigo numero 3 (-3)
     * 
     */
    @Test
    public void testFindbonusC3() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Probando Código 3");
        LocalDateTime startDate =  LocalDateTime.parse("2021-03-09 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-03-09 10:30", formatter);
        float amount = 1000000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
     
    }
    /**
     * Test of main method, of class Aguinaldo.
     */
    @Test
    public void testMain() {
          System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
        
    }
    
}
