package org.jabref.gui.slr;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class StudyDatabaseItemTest {

    private StudyDatabaseItem item;

    @BeforeEach
    public void setup() {
        item = new StudyDatabaseItem("Test", true);
    }

    @Test
    public void equalsEqualTest() {
        StudyDatabaseItem o = item;
        assertTrue(item.equals(o));
    }

    @Test
    public void equalsNullTest() {
        StudyDatabaseItem o = null;
        assertFalse(item.equals(o));
    }

    @Test
    public void equalsOtherClassTest() {
        Object o = new Object();
        assertFalse(item.equals(o));
    }

    @Test
    public void equalsEnabledTest() {
        StudyDatabaseItem o = new StudyDatabaseItem("Test", false);
        assertFalse(item.equals(o));
    }

    @Test
    public void equalsNameTest() {
        StudyDatabaseItem o = new StudyDatabaseItem("Testy", true);
        assertFalse(item.equals(o));
    }

    @Test
    public void equalsNoNameTest() {
        StudyDatabaseItem o = new StudyDatabaseItem(null, true);
        assertFalse(item.equals(o));
    }

    @Test
    public void equalsNoNameThisTest() {
        item.setName(null);
        StudyDatabaseItem o = new StudyDatabaseItem("Test", true);
        assertFalse(item.equals(o));
    }

}
