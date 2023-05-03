package view;

import java.io.IOException;

import controller.Controller;

public class Main {

	public static void main(String[] args)
	{
		Controller lista = new Controller();
		
		try {
			lista.fruitGroup();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
