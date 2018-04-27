package snake.view;

import snake.controller.SnakeController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;

public class SnakePanel extends JPanel 
{
	private SnakeController snakeController;
	private SpringLayout appLayout;
	private JButton startButton;
	JPanel gameBoard = new JPanel();
	
	Color cyan = Color.decode("#3E9DD7");
	Color lightGrey = Color.decode("#BDC4C4");

	public SnakePanel(SnakeController snakeController)
	{
		super();
		this.snakeController = snakeController;
		
		appLayout = new SpringLayout();
		startButton = new JButton("New Game");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, startButton, 360, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, startButton, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, gameBoard, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, gameBoard, 15, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, gameBoard, -13, SpringLayout.NORTH, startButton);
		appLayout.putConstraint(SpringLayout.EAST, gameBoard, -15, SpringLayout.EAST, this);
		gameBoard.setLayout(new GridLayout(100, 100, 1, 1));
		
	}
	
	private void setupPanel()
	{
		this.setBackground(cyan);
		this.setLayout(appLayout);
		this.add(startButton);
		this.add(gameBoard);
		gameBoard.setBackground(lightGrey);
	}
	
	private void setupListeners()
	{
		startButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				startNewGame();
			}
				});
	}
	
	private void startNewGame()
	{
		
	}
}
