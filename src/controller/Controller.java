package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

	public Controller() 
	{
		super();
	}
	
	public void fruitGroup() throws IOException
	{
		File arq = new File("C:\\TEMP", "generic_food.csv");
		
		if(arq.exists() && arq.isFile())
		{
			FileInputStream abreFlux = new FileInputStream(arq);
			InputStreamReader lerFlux = new InputStreamReader(abreFlux);
			BufferedReader buffer = new BufferedReader(lerFlux);
			String linha = buffer.readLine();
			
			System.out.println("Food Name \t\t\t Scientific Name \t\t\t Sub Group");
			
			while(linha != null)
			{
				String[] vetLinha = linha.split(",");
				if(vetLinha[2].contains("Fruits"))
				{
					System.out.println(vetLinha[0] + "\t\t\t" + vetLinha[1] + "\t\t\t" + vetLinha[3]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			lerFlux.close();
			abreFlux.close();
		}
	}
	
	
	

}
