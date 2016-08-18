package com.vo.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LectureFichierXml {

	private File file;
	private FileInputStream fileInput;
	private Properties properties = new Properties();
	
	
	//Chargement d'un fichier XML dans le constructeur
		public LectureFichierXml(File file){
			try{
				this.file = file;
				this.fileInput = new FileInputStream(file);
				this.properties.loadFromXML(this.fileInput);
				fileInput.close();
				
			} catch (FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	
	//Methode de lecture suivant une clé précise.
		
		public String LectureCleXMml(String cle){
			String value = properties.getProperty(cle);
			return value;
		}
		
	
	
	
		
}
