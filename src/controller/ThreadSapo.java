package controller;

public class ThreadSapo extends Thread{
	
	public void run() {
		pular();
	}
	
	private void pular(){
		int distanciatotal = 1000;
		int distanciaatual = 0;
		double TempoInicial = System.nanoTime();
		while(distanciaatual < distanciatotal){
			int pulo = (int)(Math.random() * 50 + 1);
			distanciaatual = distanciaatual + pulo;
			System.out.println("O Sapo "+getId()+" pulou "+pulo+" cm e percoreu "+(distanciaatual/100)+" metros no total!");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("O Sapo "+getId()+ " terminou a corrida em "+TempoTotal+" segundos!");
	}
}