package com.vo.vue;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//Classe qui cr��e un JPanel servant d'image de fond � l'application
public class PanelFond extends JPanel {
	
	private Image image;
	final ImageIcon imageIcon = new ImageIcon("img/background.jpg");
	
	public PanelFond()
	{
		this.image = imageIcon.getImage();
		
	}
	public void paintComponent(Graphics g) {
	    g.drawImage(image, 0, 0, null);
	  }
	
}
