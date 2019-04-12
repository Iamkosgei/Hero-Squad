import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void createsInstanceOfHero()
    {
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void savesName()
    {
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals("Hulk",hero.getName());
    }

    @Test
    public void savesAge()
    {
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals(30,hero.getAge());
    }

    @Test
    public void saveSpecialPowers()
    {
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals("Strength",hero.getSpecial_power());
    }

    @Test
    public void savesWeakness()
    {
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals("Anger issues",hero.getWeakness());
    }

}