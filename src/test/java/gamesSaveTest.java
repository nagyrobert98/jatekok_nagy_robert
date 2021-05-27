import gamesPackage.Game;
import gamesPackage.Platform;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class gamesSaveTest {

    @Test
    public void testSave(){
        Game.load("Test/gamesTest.xml");
        Assert.assertEquals(4, Game.Games.size());
        Game.add("Sims",2018, "EA","Városépítő", "PC,XBOX");
        Game.save("Test/gamesSaveTest.xml");
        File f = new File("Test/gameSaveTest.xml");
        Assert.assertTrue(f.exists());
        f.delete();
        Game.Games.clear();
    }
}
