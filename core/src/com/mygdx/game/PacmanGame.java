package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PacmanGame extends Game {
	public SpriteBatch batch; //SpriteBatch is show all drawing in 1 time.
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
