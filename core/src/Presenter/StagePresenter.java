package Presenter;

import Service.BlockService;

public class StagePresenter {

    int wallLength;

    public StagePresenter() {

        wallLength = BlockService.getWallLength();
    }
    public int[] GetXLocation()
    {
        int[] blockXCoordinates = new int[BlockService.getBlockList().size()];
        for(int i = 0; i < blockXCoordinates.length; i++){
            blockXCoordinates[i] = BlockService.getBlockList().get(i).getColumnID() * wallLength;
        }
        return blockXCoordinates;
    }
    public int[] GetYLocation()
    {
        int[] blockYCoordinates = new int[BlockService.getBlockList().size()];
        for(int i = 0; i < blockYCoordinates.length; i++){
            blockYCoordinates[i] = BlockService.getBlockList().get(i).getRowID() * wallLength;
        }
        return blockYCoordinates;
    }
    public int[] GetColorID(){
        int[] blockColorID = new int[BlockService.getBlockList().size()];
        for(int i = 0; i < blockColorID.length; i++){
            blockColorID[i] = BlockService.getBlockList().get(i).getColorID() * wallLength;
        }
        return blockColorID;
    }



}
