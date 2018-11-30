package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	// Double buffering
	private Image dbImage;
	private Graphics dbg;
	// JPanel variables
	static final int GWIDTH = 800, GHEIGHT = 800;
	static final Dimension gameDim = new Dimension(GWIDTH, GHEIGHT);
	//Game variables
	private Thread game;
	private volatile boolean running = false;
	
	public GamePanel() {
		setPreferredSize(gameDim);
		setBackground(Color.WHITE);
		setFocusable(true);
		requestFocus();
		//Handle all key inputs from user
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				
			
			}
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			
		});
		
	}
	public void run() {
		while(running) {
		}
	}
	
	public void addNotify() {
		super.addNotify();
		startGame();
	}
	
	private void startGame() {
		if(game == null || !running) {
			game = new Thread(this);
			game.start();
			running = true;
		}
	}
	
	public void stopGame() {
		if(running) {
			running = false;
		}
	}
	
	private void log(String s) {
		System.out.println(s);
	}
}
