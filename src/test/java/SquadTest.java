import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void creates_instanceOfSquad()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void saves_maxSize_5()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        assertEquals(5, squad.getMax_size());
    }

}