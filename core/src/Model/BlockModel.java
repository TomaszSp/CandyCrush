package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockModel {
    //Tu bedzie cala logika zachowania blokow:
    //Logika sprawdzenia przyznania punktow
    //instrukcje dzialania dla prezentera w przypadku przyznania punktow lub nie

    private int rowID;
    private int columnID;
    private int colorID;
    private int wallLength;
    static ArrayList blockList;
    public BlockModel() {
    }

    public BlockModel(
            int rowID,
            int columnID,
            int wallLength)
            {
                this.rowID = rowID;
                this.columnID = columnID;
                this.colorID = ColorLottery();
                this.wallLength = wallLength;
            }



    private static int ColorLottery()
    {
        Random random = new Random();

        return random.nextInt(6) + 1;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public void setColumnID(int columnID) {
        this.columnID = columnID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public void setWallLength(int wallLength) {
        this.wallLength = wallLength;
    }
    public int getRowID() {
        return rowID;
    }

    public int getColumnID() {
        return columnID;
    }

    public int getColorID() {
        return colorID;
    }

    public int getWallLength() {
        return wallLength;
    }
    public static void CreateBlockList(){
        blockList = new ArrayList();
    }
    public static void AddBlockToBlockList(BlockModel block){
        blockList.add(block);
    }

    public static ArrayList getBlockList() {
        return blockList;
    }

}
