package game.states;

import java.awt.Graphics;

import game.Game;

public class MenuState extends State{

	public MenuState(Game game) {
		super(game);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawString("This is the menu", 100, 170);
	}
	
	
}
