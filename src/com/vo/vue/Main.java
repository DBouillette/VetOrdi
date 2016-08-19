package com.vo.vue;

import java.io.File;

import com.vo.controler.Controler;
import com.vo.model.LectureFichierXml;

public class Main {

	public static void main(String[] args) {
		File file = new File("config.xml");
		LectureFichierXml fichierConf = new LectureFichierXml(file);
		Controler controler = new Controler();
		
		Fenetre fenetrePrincipale = new Fenetre(fichierConf, controler);
	}

}
