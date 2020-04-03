package Presenter;

import Service.NetService;

public class StagePresenter {

    int wallLength;

    public StagePresenter() {

        wallLength = NetService.getWallLength();
    }
    public int[] GetXLocation()
    {
        int[] blockXCoordinates = new int[NetService.getBlockList().size()];
        for(int i = 0; i < blockXCoordinates.length; i++){
            blockXCoordinates[i] = NetService.getBlockList().get(i).getColumnID() * wallLength;
        }
        return blockXCoordinates;
    }
    public int[] GetYLocation()
    {
        int[] blockYCoordinates = new int[NetService.getBlockList().size()];
        for(int i = 0; i < blockYCoordinates.length; i++){
            blockYCoordinates[i] = NetService.getBlockList().get(i).getRowID() * wallLength;
        }
        return blockYCoordinates;
    }
    public int[] GetColorID(){
        int[] blockColorID = new int[NetService.getBlockList().size()];
        for(int i = 0; i < blockColorID.length; i++){
            blockColorID[i] = NetService.getBlockList().get(i).getColorID() * wallLength;
        }
        return blockColorID;
    }



}
