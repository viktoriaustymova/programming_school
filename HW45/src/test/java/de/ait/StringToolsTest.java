package de.ait;

import jdk.jfr.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {

    @Nested
    @Name("Test for FirstToUpperCaseMethod")
    class ForFirstToUpperCaseMethodTests{
        @Test
        public void FirstToUpperCase_apple(){
            String expected = "Apple";
            String actual = StringTools.FirstToUpperCase("apple");
            assertEquals(expected,actual);
        }
    }

    @Nested
    @Name("Tests for IsStartingFromCapitalMethod")
    class ForIsStartingFromCapitalMethodTests{
        @Test
        @Name("Test for FirstToUpperCaseMethod using assertEquals()")
        public void isStartingFromCapital_Apple(){
            boolean actual = StringTools.isStartingFromCapital("Apple");
            boolean expected = true;
            assertEquals(expected,actual);
        }
        @Test
        @Name("Test for FirstToUpperCaseMethod using assertTrue()")
        public void isStartingFromCapital_Apple_true(){
            boolean actual = StringTools.isStartingFromCapital("Apple") ;
            Assertions.assertTrue(actual);
        }
        @Test
        @Name("Test for FirstToUpperCaseMethod using assertFalse()")
        public void isStartingFromCapital_apple_false(){
            boolean actual = StringTools.isStartingFromCapital("apple") ;
            Assertions.assertFalse(actual);
        }
    }












}