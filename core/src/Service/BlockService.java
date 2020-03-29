package Service;

import com.badlogic.gdx.Gdx;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Model.BlockModel;
import jdk.nashorn.internal.ir.Block;

public class BlockService {
    BlockModel block;
    int NUMBER_OF_COLUMNS = 6;
    int NUMBER_OF_ROWS;
    BlockModel[] blockList;

    int[] listOfXCoordinates;
    int[] listOfYCoordinates;
    int wallLength;

    public BlockService() {
        blockList = new BlockModel[6];
        CreateBlockNet();
    }

    public void CreateBlockNet(){
        wallLength = Gdx.graphics.getWidth() / NUMBER_OF_COLUMNS;
        //block = new BlockModel(0,0, wallLength);
        for(int i = 0; i < NUMBER_OF_COLUMNS; i++){
            block = new BlockModel(0,i, wallLength);
            blockList[i] = block;
        }
    }

    public BlockModel[] getBlockList() {
        return blockList;
    }
    public int getWallLength() {
        return wallLength;
    }
    public int[] getListOfXCoordinates() {
        return listOfXCoordinates;
    }

    public int[] getListOfYCoordinates() {
        return listOfYCoordinates;
    }


    /*public BlockModel GetBlockByRowID(int rowID){


    }*/
}
