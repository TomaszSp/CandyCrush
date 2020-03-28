package Views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StageView {
 //Tutaj sa przechowane modele 2d ale info o nich jest pobrane z presentera
    SpriteBatch batch;
    Texture blockTexture;
    int NUMBER_OF_COLUMNS = 6;
    int blockWallLength;
    int blockXCoordinate;
    int blockYCoordinate = 0;

    public StageView() {
    }
    public void CreateBlock(){
        batch = new SpriteBatch();
        blockTexture = new Texture("Blocks\\Blocks_01_256x256_Alt_00_002.png");
        setBlockWallLength(Gdx.graphics.getWidth() / NUMBER_OF_COLUMNS);
        batch.begin();
        for(int i = 0; i < 6; i++){
            blockXCoordinate = i * getBlockWallLength();
            batch.draw(blockTexture, blockXCoordinate, blockYCoordinate,  getBlockWallLength(), getBlockWallLength());
        }
        batch.end();
    }
    public int getBlockWallLength() {
        return blockWallLength;
    }

    public void setBlockWallLength(int blockWallLength) {
        this.blockWallLength = blockWallLength;
    }

    public void DisposeBlock(){
        blockTexture.dispose();
        batch.dispose();
    }

}
