package snake.controller;

import snake.view.SnakeFrame;
import snake.model.Snake;


public class SnakeController
{
	private SnakeFrame appFrame;
	private Snake snake;
	
	public SnakeController()
	{
		snake = new Snake();
		appFrame = new SnakeFrame(this);
	}
	public void start()
	{
		
	}
}
