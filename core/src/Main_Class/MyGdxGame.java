package Main_Class;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import Views.StageView;

public class MyGdxGame extends ApplicationAdapter {

	StageView blockView;


	@Override
	public void create () {

		blockView = new StageView();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor((float)0.5, 1, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		blockView.CreateBlock();

	}
	
	@Override
	public void dispose () {
		blockView.DisposeBlock();
	}
}
