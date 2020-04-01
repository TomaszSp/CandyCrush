package Service;

import com.badlogic.gdx.Gdx;

import java.sql.RowId;
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
        CreateBlockNet();
    }

    public void CreateBlockNet() {
        wallLength = Gdx.graphics.getWidth() / NUMBER_OF_COLUMNS;
        BlockModel.CreateBlockList();
        for (int i = 0; i < NUMBER_OF_COLUMNS; i++) {
            for (int j = 0; j < NUMBER_OF_ROWS; j++) {
                block = new BlockModel(j, i, wallLength);
                BlockModel.AddBlockToBlockList(block);
                blockNumber++;
            }
        }
    }


    public  ArrayList getBlocksByRowID(int rowID)
    {

        ArrayList blockListWithRowID = new ArrayList();
        for (int i = 0; i < BlockModel.getBlockList().size(); i++) {
            if(getBlockList().get(i).getRowID()== rowID){
                blockListWithRowID.add(BlockModel.getBlockList().get(i));
            }
        }
        return blockListWithRowID;
    }

    public void getBlocksByColumnID()
    {

    }

    public void getBlockByRowAndColumnID()
    {

    }
    public static ArrayList<BlockModel> getBlockList() {
        return BlockModel.getBlockList();
    }
    public static int getWallLength() {
        return wallLength;
    }


}
