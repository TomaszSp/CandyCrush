package Main_Class;

import com.badlogic.gdx.ApplicationAdapter;

import Service.NetService;
import Views.StageView;

public class MyGdxGame extends ApplicationAdapter {
    NetService netService;
	StageView stageView;

	
	@Override
	public void create () {
        netService = new NetService();
		stageView = new StageView();
	}

	@Override
	public void render () {
		stageView.Draw();
	}
	
	@Override
	public void dispose () {
		stageView.dispose();
	}
}
