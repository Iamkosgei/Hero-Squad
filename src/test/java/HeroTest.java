import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void createsInstanceOfHero()
    {
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals(true, hero instanceof Hero);
    }

}