/*
B211202902, AHMAD ZHAFRAN FARUQI BIN ZAINAL ABIDIN,
SWE202 SOFTWARE VERIFICATION AND VALIDATION, HOMEWORK 2,
https://github.com/zhafranzainal/SoftwareVerificationAndValidation-B211202902
*/

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest{

    @BeforeEach
    void setUp(){}

    @AfterEach
    void tearDown(){}

    @ParameterizedTest
    @CsvSource({"10, 2, 5", "10, 4, 2.5", "12.5, 5, 2.5", "10, 2.5, 4", "12.5, 2.5, 5"})
    void dataDrivenDivide(double a, double b, double expectedValue){
        assertEquals(expectedValue, Calculator.divide(a, b));}

}