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

    public boolean Are3InRow(BlockModel block){
        ArrayList list = new ArrayList();
        list = BlockService.getBlocksByRowID(block.getRowID());
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
        list = BlockService.getBlocksByColumnID(block.getColumnID());
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


    public static ArrayList getBlocksByRowID(int rowID) {
        ArrayList blockListWithRowID = new ArrayList();
        for (int i = 0; i < BlockModel.getBlockList().size(); i++) {
            if(getBlockList().get(i).getRowID()== rowID){
                blockListWithRowID.add(BlockModel.getBlockList().get(i));
            }
        }
        return blockListWithRowID;
    }

    public static ArrayList getBlocksByColumnID(int columnID) {
        ArrayList blocksListWithColumnID = new ArrayList();
        for (int i = 0; i < BlockModel.getBlockList().size(); i++) {
            if(getBlockList().get(i).getColumnID() == columnID){
                blocksListWithColumnID.add(BlockModel.getBlockList().get(i));
            }
        }
        return blocksListWithColumnID;
    }

    public static BlockModel getBlockByRowAndColumnID(int rowID, int columnID) {
        for (int i = 0; i < BlockModel.getBlockList().size(); i++) {
            if (getBlockList().get(i).getRowID() == rowID && getBlockList().get(i).getColumnID() == columnID) {
                BlockModel block = new BlockModel();
                return block = getBlockList().get(i);
            }
        }
        return null;
    }

    public static ArrayList<BlockModel> getBlockList() {
        return BlockModel.getBlockList();
    }
    public static int getWallLength() {
        return wallLength;
    }


}
