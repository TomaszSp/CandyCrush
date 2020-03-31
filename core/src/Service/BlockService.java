package Service;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

import Model.BlockModel;

public class BlockService {
    BlockModel block;
    int NUMBER_OF_COLUMNS = 6;
    int NUMBER_OF_ROWS = 10;
    static ArrayList blockList;
    static int wallLength;
    int blockNumber = 0;

    public BlockService() {
        blockList = new ArrayList();;
        CreateBlockNet();
    }

    public void CreateBlockNet() {
        wallLength = Gdx.graphics.getWidth() / NUMBER_OF_COLUMNS;

        for (int i = 0; i < NUMBER_OF_COLUMNS; i++) {
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                block = new BlockModel(j, i, wallLength);
                blockList.add(block);
                blockNumber++;
            }
        }
    }

    public void getBlocksByRowiID()
    {

    }

    public void getBlocksByColumnID()
    {

    }

    public void getBlockByRowAndColumnID()
    {

    }
    public static ArrayList<BlockModel> getBlockList() {
        return blockList;
    }
    public static int getWallLength() {
        return wallLength;
    }


}
