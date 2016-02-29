package com.mygdx.game;
//Version 0
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.MenuScreen;
import com.mygdx.game.Screens.PlayScreen;

public class TowerUp extends Game {

	@Override
	public void render() {
		super.render();
	}

	public void create() {
		setScreen(new MenuScreen(this));
		//setScreen(new PlayScreen());
	}
}
