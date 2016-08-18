package com.vo.vue;

import javax.swing.JFrame;

import com.vo.model.LectureFichierXml;

public class Fenetre extends JFrame {
	
	
	// Initialisation de la fenetre principale
	public Fenetre(LectureFichierXml config){
		this.setTitle(config.LectureCleXMml("NomApplication"));
		this.setSize(Integer.valueOf(config.LectureCleXMml("ResoX")), Integer.valueOf(config.LectureCleXMml("ResoY")));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanelFond());
		this.repaint();
		this.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
