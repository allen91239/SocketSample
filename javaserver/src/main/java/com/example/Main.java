package com.example;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	private final static int windowWidth = 300, windowHeight = 200;
	
	public static void main(String [] args){
		//Server obj = new Server();
		Server applet = new Server();
		applet.init();
		applet.start();
		applet.setFocusable(true);
		
		JFrame window = new JFrame("ya");
		window.setContentPane(applet);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(windowWidth, windowHeight);
		window.setVisible(true);
	}
}