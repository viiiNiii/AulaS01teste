package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController opController = new OperacoesController();
//		opController.operacaoString();
//		opController.operacaoBuffer();
		String frase = "Bem vindos de volta � Fatec Zona Leste";
		opController.operacaoFrase(frase);
	}

}
