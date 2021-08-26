package controller;

public class ThreadCalc extends Thread {

	private int a;
	private int b;
	private int op;
	private double tempoExecucao;

	public ThreadCalc(int a, int b, int op) {

		this.a = a;
		this.b = b;
		this.op = op;
	}
			@Override
			public void run() {
				calc();
			}

			private void calc() {
			   
				double tempoInicial = System.nanoTime();
				
				int res = 0;
			    String operacao = "";
			    
			    try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				
				}
			
			switch (op) {
			case 0:
			res = a + b; 
			operacao = "+";
				break ;		
			case 1:
			res = a - b; 
			operacao = "-";
				break ;
			case 2:
			res = a * b; 
			operacao = "*";
				break ;
					
			case 3:
			res = a / b; 
			operacao = "/";
				break ;
			
			case 4:
			res = a % b; 
			operacao = "%";
				break ;	
			}
			
			double tempoFinal = System.nanoTime();
			tempoExecucao = tempoFinal - tempoInicial;
			tempoExecucao = tempoExecucao/ Math.pow(10,9);
			
			
			//atalho no eclipe para System.out.println(); � Digite syso e pressione CTRL + espa�o enter
			System.out.println(" TID # " +  getId() + " ==> " + a + " " + operacao + " " + b + " = " + res + " ==>" + "rodou em " + tempoExecucao);
				
			}

		}

