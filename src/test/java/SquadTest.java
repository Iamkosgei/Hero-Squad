import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void creates_instanceOfSquad()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        assertTrue(squad instanceof Squad);
    }
    @Test
    public void saves_maxSize_5()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        assertEquals(5, squad.getMax_size());
    }
    @Test
    public void saves_squadName_squad_1()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        assertEquals("Squad 1", squad.getName());
    }
    @Test
    public void saves_cause_black_lives_matterl()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        assertEquals("black lives matter", squad.getCause());
    }

    @Test
    public void all_returns_all_instancesOfSquad()
    {
        Squad squad = new Squad(5,"Squad 1","black lives matter");
        Squad squad2 = new Squad(5,"Squad 1","black lives matter");

        assertTrue(Squad.all().contains(squad));
        assertTrue(Squad.all().contains(squad2));

    }
}