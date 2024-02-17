package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}

	public void vetor1000() {
		double tempoInicial = System.nanoTime();

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.printf("Tempo total para o vetor de 1.000 posições: %.7f segundos.\n", tempoTotal);
	}

	public void vetor10000() {
		double tempoInicial = System.nanoTime();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.printf("Tempo total para o vetor de 10.000 posições: %.7f segundos.\n", tempoTotal);
	}

	public void vetor100000() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.printf("Tempo total para o vetor de 100.000 posições: %.7f segundos.", tempoTotal);
	}
}
