package Model;

import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Block {
    //Tu bedzie cala logika zachowania blokow:
    //Logika sprawdzenia przyznania punktow
    //instrukcje dzialania dla prezentera w przypadku przyznania punktow lub nie

    private int locationX;
    private int locationY;
    private int color;
    private int wallLength = 180;

    // to papa do innej klasy jak juz nadejdzie pora utworzenia jej
    private static int lastX = -180, lastY = 0;


    public Block(){}

    public Block(
            int locationX,
            int locationY,
            int color,
            int wallLength)
            {
                this.locationX = locationX;
                this.locationY = locationY;
                this.color = color;
                this.wallLength = wallLength;
            }

    public static void ProduceObjects()
    {
        Block block = new Block();
        int[] blockParameters = SetLocation(lastX, lastY);
        int color = ColorLottery();
        block.Create(blockParameters[0], blockParameters[1], color);
    }

      public static int[] SetLocation(int inputX, int inputY){
        int [] array;
        if(!(inputX >= 1080))
        {
            array = new int[] {inputX + 180, inputY};
        }
        else
        {
            array = new int[] {0, inputY + 180};
        }
        lastX = array[0];
        lastY = array[1];
        return array;
    }

    private static int ColorLottery()
    {
        Random random = new Random();
        int i = random.nextInt(6) + 1;
        return i;
    }
    private static List<Block> blockList = new ArrayList<Block>();

    public void Create(int x, int y, int c)
    {
        for (int i = 0; i < 36; i++)
        {
            blockList.add(new Block(locationX = x, locationY = y, color = c, wallLength =  wallLength));
        }
    }
    /*
    public static int[] SendLocations(){
        int[] array = new int[36*2];
        for(int i = 0; i < blockList.size(); i++)
        {
        }
    }*/
}
