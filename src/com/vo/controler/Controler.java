package com.vo.controler;

import com.vo.vue.FenetreMenu;
import com.vo.vue.PanelFond;

public class Controler {
	private FenetreMenu fenetreMenu = null;
	
	public void initFenetreMenu(String nomMenu, PanelFond desktopPane){
		System.out.println(nomMenu);
		fenetreMenu = new FenetreMenu();
		desktopPane.add(fenetreMenu);
		fenetreMenu.setTitle(nomMenu);
		fenetreMenu.setVisible(true);
			
	}
}
