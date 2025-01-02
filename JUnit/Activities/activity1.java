package session1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class activity1 {

    // Declare the static ArrayList
    static ArrayList<String> list;

    // The setUp() method with @BeforeAll annotation to initialize the ArrayList
    @BeforeAll
    public static void setUp() {
        // Initialize a new ArrayList
        list = new ArrayList<>();

        // Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta");  // at index 1
    }

    // Example test method to verify the setup
    @Test
    public void testListInitialization() {
        // Check if the list is initialized with the correct size
        assertEquals(2, list.size(), "List should contain 2 elements");

        // Check if the elements are correctly added
        assertEquals("alpha", list.get(0), "First element should be 'alpha'");
        assertEquals("beta", list.get(1), "Second element should be 'beta'");
    }
}