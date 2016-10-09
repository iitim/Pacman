package com.mygdx.game;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
 
    World(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacman = new Pacman(60,60);
        maze = new Maze();
    }
    
    public void update(float delta) {
        pacman.update();
    }
 
    Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
        return maze;
    }
}
