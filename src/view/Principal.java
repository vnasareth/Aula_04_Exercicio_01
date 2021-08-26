package view;

import controller.ThreadCalc;

public class Principal {

	public static void main(String[] args) {
	
		//for (int idThread  = 0 ; idThread < 5 ; idThread++) {			
			//ThreadId threadId = new ThreadId(idThread);	
			//Thread threadId = new ThreadId(idThread);
			//threadId.start();
		
		int a = 500;
		int b = 9;
		
		for (int op = 0 ; op < 5 ; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
		}

	}
