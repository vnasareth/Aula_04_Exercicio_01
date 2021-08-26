package controller;

     //extends Thread 
	//Parametros sao passado pelo construdor
	//método run()

public class ThreadId extends Thread {
	
	private int idThread;
	
	
	public ThreadId(int idThread) {
		
		this.idThread = idThread;
		
	}
	
	// atalho é so escrever ru Ctrl + espaço enter
	
	@Override
		public void run() {
			// Só se executa o que esta aqui dentro
		
		System.out.println(idThread);
			
		}

}
