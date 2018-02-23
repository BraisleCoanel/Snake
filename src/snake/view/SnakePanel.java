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

public class SnakePanel extends JPanel 
{
	private SnakeController snakeController;
	private SpringLayout appLayout;
	private JButton startButton;
	
	Color cyan = Color.decode("#709DD7");
	
	public SnakePanel(SnakeController snakeController)
	{
		super();
		this.snakeController = snakeController;
		
		appLayout = new SpringLayout();
		startButton = new JButton();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, startButton, 180, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, startButton, 0, SpringLayout.SOUTH, this);
		
	}
	
	private void setupPanel()
	{
		this.setBackground(cyan);
		this.setLayout(appLayout);
		this.add(startButton);
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
}
