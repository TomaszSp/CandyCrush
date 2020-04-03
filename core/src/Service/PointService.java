package Service;

import java.util.ArrayList;

import Model.BlockModel;

public class PointService {


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
