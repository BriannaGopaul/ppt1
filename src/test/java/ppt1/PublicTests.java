package ppt1;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class PublicTests {
    @Test
    public void test_singletonList() {
        SDPair student0 = new SDPair(10, 20);
        ArrayList<SDPair> inputList = new ArrayList<>();
        inputList.add(student0);
        assertEquals(0, Halloween.bottleCount(inputList));
        assertEquals(0, Halloween.highPoint(inputList));
    }

    @Test
    public void test_twoEntryList1() {
        ArrayList<SDPair> inputList = new ArrayList<>();
        inputList.add(new SDPair(10, 20));
        inputList.add(new SDPair(30, 50));
        assertEquals(0, Halloween.bottleCount(inputList));
        assertEquals(0, Halloween.highPoint(inputList));
    }

    @Test
    public void test_twoEntryList2() {
        ArrayList<SDPair> inputList = new ArrayList<>();
        inputList.add(new SDPair(60, 20));
        inputList.add(new SDPair(30, 50));
        assertEquals(1, Halloween.bottleCount(inputList));
        assertEquals(0, Halloween.highPoint(inputList));
    }

    @Test
    public void test_listOfThree1() {
        ArrayList<SDPair> inputList = new ArrayList<>();
        inputList.add(new SDPair(60, 20));
        inputList.add(new SDPair(30, 50));
        inputList.add(new SDPair(70, 10));
        assertEquals(4, Halloween.bottleCount(inputList));
        assertEquals(0, Halloween.highPoint(inputList));
    }

    @Test
    public void test_listOfThree2() {
        ArrayList<SDPair> inputList = new ArrayList<>();
        inputList.add(new SDPair(60, 55));
        inputList.add(new SDPair(30, 50));
        inputList.add(new SDPair(70, 10));
        assertEquals(2, Halloween.bottleCount(inputList));
        assertEquals(2, Halloween.highPoint(inputList));
    }

    @Test
    public void test_signOfFour() {
        ArrayList<SDPair> inputList = new ArrayList<>();
        inputList.add(new SDPair(60, 40));
        inputList.add(new SDPair(30, 50));
        inputList.add(new SDPair(70, 10));
        inputList.add(new SDPair(50, 20));
        assertEquals(5, Halloween.bottleCount(inputList));
        assertEquals(1, Halloween.highPoint(inputList));
    }

}
