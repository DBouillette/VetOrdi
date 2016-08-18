package com.vo.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.vo.model.LectureFichierXml;

public class Fenetre extends JFrame {
	
	private JMenuBar menuPrincipal = null;
	private JMenu fichier = null;
	private JMenuItem quitter = null;
	private JMenuItem client = null;
	
  //-- Initialisation de la fenetre principale ---------------------------------------
	public Fenetre(LectureFichierXml config){
		this.setTitle(config.LectureCleXMml("NomApplication"));
		this.setSize(Integer.valueOf(config.LectureCleXMml("ResoX")), Integer.valueOf(config.LectureCleXMml("ResoY")));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanelFond());
		
		//-- Création de la barre de menu principal ----------------------------------------
		menuPrincipal = new JMenuBar();
		
		//-- Création du bouton Quitter du menu principal ---------------------------------
		fichier = new JMenu("Fichier");
		
		//-- Création du bouton Quitter du menu principal ----------------------------------
		quitter = new JMenuItem("Quitter");
		
		//-- Ajout du listenner sur le bouton quitter ------------------------------------
		quitter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		
		//-- Création du bouton Clients du menu principal ---------------------------------
		client = new JMenuItem("Clients");
		
		fichier.add(client);
		fichier.add(quitter);
		
		menuPrincipal.add(fichier);
		
		
		
		
		this.setJMenuBar(menuPrincipal);
			
				
		this.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
