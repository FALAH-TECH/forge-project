
package plan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RequestTest {

    @Test
    void createsLearningEntry() {

        Request entry = new Request(
                "E1",
                Request.Type.LEARNED,
                "Practised Java constructors"
        );
        assertEquals("E1", entry.getId());
        assertEquals(Request.Type.LEARNED,entry.getType());
        assertEquals("Practised Java constructors",entry.getTitle());
        assertEquals(Request.Status.OPEN,entry.getStatus());
    }

    @Test
    void rejectsBlankDescription() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Request(
                    "E2",
                    Request.Type.LEARNED,
                    "   "
            );
        });
    }

}
