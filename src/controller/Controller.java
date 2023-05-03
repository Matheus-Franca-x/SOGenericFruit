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
			
			System.out.println("Food Name" + espaco("Food Name".length()) + "Scientific Name" + espaco("Scientific Name".length()) + "Sub Group");
			
			while(linha != null)
			{
				String[] vetLinha = linha.split(",");
				if(vetLinha[2].contains("Fruits"))
				{
					System.out.println(vetLinha[0] + espaco(vetLinha[0].length()) + vetLinha[1] + espaco(vetLinha[1].length()) + vetLinha[3]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			lerFlux.close();
			abreFlux.close();
		}
		else
		{
			throw new IOException("Nao e um file!!!");
		}
	}
	
	private String espaco(int i)
	{
		StringBuffer buffer = new StringBuffer();
		if(i == 50)
		{
			return buffer.append(" ").toString();
		}
		else
		{
			buffer.append(" ");
			buffer.append(espaco(i+1));
			return buffer.toString();
		}
	}
	
	
	

}
