package snake.view;

import snake.controller.SnakeController;
import javax.swing.JFrame;

public class SnakeFrame extends JFrame
{
	private SnakePanel appPanel;
	
	public SnakeFrame(SnakeController app)
	{
		super();
		appPanel = new SnakePanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Snake");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
