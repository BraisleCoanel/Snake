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
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakePanel extends JPanel 
{
	private SnakeController snakeController;
	
	public SnakePanel(SnakeController snakeController)
	{
		super();
		this.snakeController = snakeController;
	}
}
