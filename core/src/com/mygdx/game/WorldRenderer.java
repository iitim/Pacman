package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	
	public static final int BLOCK_SIZE = 40;
	
	private Texture pacmanImg;
	private PacmanGame pacmanGame;
	private World world;
	private MazeRenderer mazeRenderer;
	private BitmapFont font;
	
	public WorldRenderer(PacmanGame pacmanGame, World world) {
        this.pacmanGame = pacmanGame;
 
        this.world = world;
 
        pacmanImg = new Texture("pacman.png");
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
        font = new BitmapFont();
    }
	
	public void render(float delta) {
		mazeRenderer.render();
		SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        font.draw(batch, "" + world.getScore(), 700, 60);
        Vector2 pos = world.getPacman().getPosition();
        batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, PacmanGame.HEIGHT - pos.y - BLOCK_SIZE/2);
        batch.end();
    }

}
