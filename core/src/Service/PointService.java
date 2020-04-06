package Service;

import java.util.ArrayList;

import Model.BlockModel;

public class PointService {


    public ArrayList Are3InRow(BlockModel block) {
        ArrayList list = (CheckColorsInRow(block));
        return CheckSameColorColumnID(block, list);
    }
    private static ArrayList CheckColorsInRow(BlockModel block)
    {
        ArrayList inputList = new ArrayList();
        ArrayList outputList = new ArrayList();

        inputList = NetService.getBlocksByRowID(block.getID());
        for (int i = 0; i < inputList.size(); i++) {
            if ((((BlockModel) inputList.get(i)).getColorID()) == block.getColorID())
                outputList.add(((BlockModel) inputList.get(i)).getID());
        }
        outputList = CheckSameColorColumnID(block, outputList);
        return outputList;
    }
    private static ArrayList CheckSameColorColumnID(BlockModel block, ArrayList inputList){
        ArrayList listID = new ArrayList();
        for (int i = 1; i <= inputList.size(); i++)
        {
            if(!inputList.contains(NetService.getBlockByRowAndColumnID(block.getRowID(), (block.getColumnID() + i)).getID())){
                break;
            }
            listID.add(inputList.get(NetService.getBlockByRowAndColumnID(block.getRowID(), (block.getColumnID() + i)).getID()));
        }
        for (int i = 1; i <= inputList.size(); i++)
        {
            if(!inputList.contains(NetService.getBlockByRowAndColumnID(block.getRowID(), (block.getColumnID() - i)).getID())){
                break;
            }
            listID.add(inputList.get(NetService.getBlockByRowAndColumnID(block.getRowID(), (block.getColumnID() + i)).getID()));
        }
        return listID;
    }
/*
    public boolean Are3InRow(BlockModel block){
        ArrayList list = new ArrayList();
        list = NetService.getBlocksByRowID(block.getRowID());
        if(block.getColumnID() < 6 && block.getColumnID() > 1) {
            if (block.getColorID() == ((BlockModel) list.get(block.getColumnID() + 1)).getColorID() && block.getColorID() == ((BlockModel) list.get(block.getColumnID() - 1)).getColorID()) {
                return true;
            }
        }
        if(block.getColumnID() < 5) {
            if (block.getColorID() == ((BlockModel) list.get(block.getColumnID() + 1)).getColorID() && block.getColorID() == ((BlockModel) list.get(block.getColumnID() + 2)).getColorID()) {
                return true;
            }
        }
        if (block.getColumnID() > 2) {
            if (block.getColorID() == ((BlockModel) list.get(block.getColumnID() - 1)).getColorID() && block.getColorID() == ((BlockModel) list.get(block.getColumnID() - 2)).getColorID()) {
                return true;
            }
        }
        return false;
    }
*/
    public boolean Are3InColumn(BlockModel block){
        ArrayList list = new ArrayList();
        list = NetService.getBlocksByColumnID(block.getColumnID());
        if(block.getRowID() < 6 && block.getRowID() > 1){
            if(block.getColorID() == ((BlockModel) list.get(block.getRowID() + 1)).getColorID() && block.getColorID() == ((BlockModel) list.get(block.getRowID() - 1)).getColorID()) {
                return true;
            }
        }
        if(block.getRowID() < 5){
            if(block.getColorID() == ((BlockModel) list.get(block.getRowID() + 1)).getColorID() && block.getColorID() == ((BlockModel) list.get(block.getRowID() + 2)).getColorID()) {
                return true;
            }
        }
        if(block.getRowID() > 2){
            if (block.getColorID() == ((BlockModel) list.get(block.getRowID() - 1)).getColorID() && block.getColorID() == ((BlockModel) list.get(block.getRowID() - 2)).getColorID()) {
                return true;
            }
        }
        return false;
    }
}
