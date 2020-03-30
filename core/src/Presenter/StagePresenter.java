package Presenter;

import Service.BlockService;

public class StagePresenter {
    BlockService blockService;
    int wallLength;

    public StagePresenter() {
        blockService = new BlockService();
        wallLength = blockService.getWallLength();
    }
    public int[] GetXLocation()
    {
        int[] blockXCoordinates = new int[blockService.getBlockList().length];
        for(int i = 0; i < blockXCoordinates.length; i++){
            blockXCoordinates[i] = blockService.getBlockList()[i].getColumnID() * wallLength;
        }
        return blockXCoordinates;
    }
    public int[] GetYLocation()
    {
        int[] blockYCoordinates = new int[blockService.getBlockList().length];
        for(int i = 0; i < blockYCoordinates.length; i++){
            blockYCoordinates[i] = blockService.getBlockList()[i].getRowID() * wallLength;
        }
        return blockYCoordinates;
    }
    public int[] GetColorID(){
        int[] blockColorID = new int[blockService.getBlockList().length];
        for(int i = 0; i < blockColorID.length; i++){
            blockColorID[i] = blockService.getBlockList()[i].getColorID() * wallLength;
        }
        return blockColorID;
    }



}
