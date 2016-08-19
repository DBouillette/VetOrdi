package com.vo.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.vo.controler.Controler;
import com.vo.model.LectureFichierXml;

public class Fenetre extends JFrame {
	
	private JMenuBar menuPrincipal = null;
	private JMenu fichier = null;
	private JMenuItem menuQuitter = null;
	private JMenuItem menuClient = null;
	private JMenuItem menuDevis = null;
	private JMenuItem menuProduits = null;
	private Controler controler;
	public PanelFond desktopPane = null;
	
  //-- Initialisation de la fenetre principale ---------------------------------------
	public Fenetre(LectureFichierXml config, Controler controler){
		this.controler = controler;
		this.setTitle(config.LectureCleXMml("NomApplication"));
		this.setSize(Integer.valueOf(config.LectureCleXMml("ResoX")), Integer.valueOf(config.LectureCleXMml("ResoY")));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.desktopPane = new PanelFond();
		this.setContentPane(desktopPane);
		
		
		//-- Création de la barre de menu principal ----------------------------------------
		menuPrincipal = new JMenuBar();
		
		//-- Création du bouton Fichier du menu principal ---------------------------------
		fichier = new JMenu("Fichier");
		
		//-- Création du bouton Clients du menu principal ---------------------------------
		menuClient = new JMenuItem("Clients");
		
		//-- Ajout du Listenner sur le bouton Clients
		menuClient.addActionListener(new MenuActionListener());
		
		//-- Création du bouton Devis du menu principal ---------------------------------
		menuDevis = new JMenuItem("Devis");
		
		//-- Ajout du Listenner sur le bouton Devis
		menuDevis.addActionListener(new MenuActionListener());
		
		//-- Création du bouton Produits du menu principal ---------------------------------
		menuProduits = new JMenuItem("Produits");
		
		//-- Ajout du Listenner sur le bouton Produits
		menuProduits.addActionListener(new MenuActionListener());
		
		//-- Création du bouton Quitter du menu principal ----------------------------------
		menuQuitter = new JMenuItem("Quitter");
				
		//-- Ajout du listenner sur le bouton Quitter ------------------------------------
		menuQuitter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					System.exit(0);	
			}
		});
				
		//-- Ajout des boutons dans le menu Fichier ---------------------------------------
		fichier.add(menuClient);
		fichier.add(menuDevis);
		fichier.add(menuProduits);
		fichier.add(menuQuitter);
		
		
		//-- Ajout du menu Fichier au menu Principal --------------------------------------
		menuPrincipal.add(fichier);
		
		
		
		
		this.setJMenuBar(menuPrincipal);
			
				
		this.setVisible(true);
		
	}
	
	
	
	 class MenuActionListener implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			controler.initFenetreMenu(e.getActionCommand(),desktopPane );
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
