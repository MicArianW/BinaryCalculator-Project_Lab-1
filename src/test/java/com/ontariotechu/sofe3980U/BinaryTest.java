package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

     @Test
    public void orOperation1()
    {
        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1110"));
    }

    /**
     * Test OR operation with two binary numbers of different lengths
     */
    @Test
    public void orOperation2()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("10001");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("10101"));
    }

    /**
     * Test OR operation with zero
     */
    @Test
    public void orOperation3()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1101"));
    }

    /**
     * Test AND operation with two binary numbers of the same length
     */
    @Test
    public void andOperation1()
    {
        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("1000"));
    }

    /**
     * Test AND operation with two binary numbers of different lengths
     */
    @Test
    public void andOperation2()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("10001");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("1"));
    }

    /**
     * Test AND operation with zero
     */
    @Test
    public void andOperation3()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Test Multiply operation with two binary numbers
     */
    @Test
    public void multiplyOperation1()
    {
        Binary binary1 = new Binary("110");
        Binary binary2 = new Binary("10");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1100"));
    }

    /**
     * Test Multiply operation with zero
     */
    @Test
    public void multiplyOperation2()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1011");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Test Multiply operation with one
     */
    @Test
    public void multiplyOperation3()
    {
        Binary binary1 = new Binary("1");
        Binary binary2 = new Binary("111");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("111"));
    }
}
