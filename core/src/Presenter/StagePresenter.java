package Presenter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Model.BlockModel;
import Service.BlockService;

public class StagePresenter {
    BlockService blockNet;
    int wallLength;

    public StagePresenter() {
        blockNet = new BlockService();
        wallLength = blockNet.getWallLength();
    }
    public int[] GetXLocation()
    {
        int[] blockXCoordinates = new int[6];
        for(int i = 0; i < 6; i++){
            blockXCoordinates[i] = blockNet.getBlockList()[i].getColumnID() * wallLength;
        }
        return blockXCoordinates;
    }
    public int[] GetYLocation()
    {
        int[] blockYCoordinates = new int[6];
        for(int i = 0; i < 6; i++){
            blockYCoordinates[i] = blockNet.getBlockList()[i].getRowID() * wallLength;
        }
        return blockYCoordinates;
    }
    public int getWallLength() {
        return wallLength;
    }


}
