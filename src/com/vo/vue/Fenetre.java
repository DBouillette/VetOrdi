package com.vo.vue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.vo.model.LectureFichierXml;

public class Fenetre extends JFrame {
	
	private JMenuBar menuPrincipal = null;
	private JMenu fichier = null;
	private JMenuItem quitter = new JMenuItem("quitter");
	
	// Initialisation de la fenetre principale
	public Fenetre(LectureFichierXml config){
		this.setTitle(config.LectureCleXMml("NomApplication"));
		this.setSize(Integer.valueOf(config.LectureCleXMml("ResoX")), Integer.valueOf(config.LectureCleXMml("ResoY")));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanelFond());
		
	//Création de la barre de menu principal
		menuPrincipal = new JMenuBar();
	//Création des boutons du menu principal
		quitter = new JMenuItem("Quitter");
		fichier = new JMenu("Fichier");
		fichier.add(quitter);
		menuPrincipal.add(fichier);
		this.setJMenuBar(menuPrincipal);
			
				
		this.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
