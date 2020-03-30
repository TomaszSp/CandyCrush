package Service;

import com.badlogic.gdx.Gdx;

import Model.BlockModel;

public class BlockService {
    BlockModel block;
    int NUMBER_OF_COLUMNS = 6;
    int NUMBER_OF_ROWS = 10;
    static BlockModel[] blockList;
    static int wallLength;
    int blockNumber = 0;

    public BlockService() {
        blockList = new BlockModel[NUMBER_OF_ROWS * NUMBER_OF_COLUMNS];
        CreateBlockNet();
    }

    public void CreateBlockNet(){
        wallLength = Gdx.graphics.getWidth() / NUMBER_OF_COLUMNS;

        for(int i = 0; i < NUMBER_OF_COLUMNS; i++){
            for(int j = 0; j < NUMBER_OF_ROWS; j++){
                block = new BlockModel(j,i, wallLength);
                blockList[blockNumber] = block;
                blockNumber++;
            }
        }
    }

    public static BlockModel[] getBlockList() {
        return blockList;
    }
    public static int getWallLength() {
        return wallLength;
    }


}
