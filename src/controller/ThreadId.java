package controller;

     //extends Thread 
	//Parametros sao passado pelo construdor
	//m�todo run()

public class ThreadId extends Thread {
	
	private int idThread;
	
	
	public ThreadId(int idThread) {
		
		this.idThread = idThread;
		
	}
	
	// atalho � so escrever ru Ctrl + espa�o enter
	
	@Override
		public void run() {
			// S� se executa o que esta aqui dentro
		
		System.out.println(idThread);
			
		}

}
