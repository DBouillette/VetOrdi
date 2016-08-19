package com.vo.controler;

import com.vo.vue.Fenetre;
import com.vo.vue.FenetreMenu;

public class Controler {
	private FenetreMenu fenetreMenu;
	private Fenetre fenetre;
	
	public void initFenetreMenu(String nomMenu){
		System.out.println(nomMenu);
		this.fenetreMenu = new FenetreMenu();
		fenetreMenu.setVisible(true);
		fenetre.add(fenetreMenu);
		fenetreMenu.setTitle(nomMenu);
			
	}
}
