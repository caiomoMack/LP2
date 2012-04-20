package calculadora;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculadoraF extends JFrame implements ActionListener {

	JButton botaoce, botaoc, botao1, botao2, botao3, botao4, botao5, botao6,
			botao7, botao8, botao9, botao0, botaos, botaosub, botaod, botaom,
			botaoigual;
	JTextField display, resul;
	JTextArea area;

	int num1 = 0;
	double resultado = 0;
	int operacao = 0;
	int numero;

	public CalculadoraF() {

		Container caixa = getContentPane();
		caixa.setLayout(new FlowLayout());

		display = new JTextField(20);

		area = new JTextArea(20, 20);

		botaoce = new JButton("CE");
		botaoc = new JButton("C");
		botao1 = new JButton("1");
		botao2 = new JButton("2");
		botao3 = new JButton("3");
		botao4 = new JButton("4");
		botao5 = new JButton("5");
		botao6 = new JButton("6");
		botao7 = new JButton("7");
		botao8 = new JButton("8");
		botao9 = new JButton("9");
		botao0 = new JButton("0");
		botaos = new JButton("+");
		botaosub = new JButton("-");
		botaod = new JButton("/");
		botaom = new JButton("*");
		botaoigual = new JButton("=");
		resul = new JTextField(20);

		caixa.add(display);
		caixa.add(botao1);
		caixa.add(botao2);
		caixa.add(botao3);
		caixa.add(botao4);
		caixa.add(botao5);
		caixa.add(botao6);
		caixa.add(botao7);
		caixa.add(botao8);
		caixa.add(botao9);
		caixa.add(botao0);
		caixa.add(botaos);
		caixa.add(botaosub);
		caixa.add(botaod);
		caixa.add(botaom);
		caixa.add(botaoigual);
		caixa.add(botaoc);
		caixa.add(botaoce);
		caixa.add(resul);

		display.setEditable(false);
		resul.setEditable(false);

		setTitle("Calculadora Flow Layout");
		setBounds(417, 252, 252, 216);
		setVisible(true);

		botaoce.addActionListener(this);
		botaoc.addActionListener(this);
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		botao4.addActionListener(this);
		botao5.addActionListener(this);
		botao6.addActionListener(this);
		botao7.addActionListener(this);
		botao8.addActionListener(this);
		botao9.addActionListener(this);
		botao0.addActionListener(this);
		botaos.addActionListener(this);
		botaosub.addActionListener(this);
		botaod.addActionListener(this);
		botaom.addActionListener(this);
		botaoigual.addActionListener(this);

	}

	public void actionPerformed(ActionEvent evento) {

		// JOptionPane.showMessageDialog(null, getBounds());

		if (evento.getSource() == botao1) {

			display.setText(display.getText() + "1");
		}

		if (evento.getSource() == botao2) {

			display.setText(display.getText() + "2");
		}

		if (evento.getSource() == botao3) {

			display.setText(display.getText() + "3");
		}

		if (evento.getSource() == botao4) {

			display.setText(display.getText() + "4");
		}

		if (evento.getSource() == botao5) {

			display.setText(display.getText() + "5");
		}

		if (evento.getSource() == botao6) {

			display.setText(display.getText() + "6");
		}

		if (evento.getSource() == botao7) {

			display.setText(display.getText() + "7");
		}

		if (evento.getSource() == botao8) {

			display.setText(display.getText() + "8");
		}

		if (evento.getSource() == botao9) {

			display.setText(display.getText() + "9");
		}

		if (evento.getSource() == botao0) {

			display.setText(display.getText() + 0);
		}

		// Bot�es de calculo

		if (evento.getSource() == botaos) { // botao somar

			if (resultado == 0) {

				resultado = Integer.parseInt(display.getText());

				display.setText("");
			}

			else {

				numero = Integer.parseInt(display.getText());

				display.setText("");
			}

			if (operacao == 1) {

				num1 = numero;

				resultado += num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 2) {

				num1 = numero;

				resultado -= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 3) {

				num1 = numero;

				resultado /= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 4) {

				num1 = numero;

				resultado *= num1;

				resul.setText("" + resultado);

			}

			operacao = 1;
		}

		if (evento.getSource() == botaosub) { // botao subtrair

			if (resultado == 0) {

				resultado = Integer.parseInt(display.getText());

				display.setText("");
			}

			else {

				numero = Integer.parseInt(display.getText());

				display.setText("");
			}

			if (operacao == 1) {

				num1 = numero;

				resultado += num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 2) {

				num1 = numero;

				resultado -= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 3) {

				num1 = numero;

				resultado /= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 4) {

				num1 = numero;

				resultado *= num1;

				resul.setText("" + resultado);

			}

			operacao = 2;
		}

		if (evento.getSource() == botaod) { // botao dividir

			if (resultado == 0) {

				resultado = Integer.parseInt(display.getText());

				display.setText("");
			}

			else {

				numero = Integer.parseInt(display.getText());

				display.setText("");
			}

			if (operacao == 1) {

				num1 = numero;

				resultado += num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 2) {

				num1 = numero;

				resultado -= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 3) {

				num1 = numero;

				resultado /= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 4) {

				num1 = numero;

				resultado *= num1;

				resul.setText("" + resultado);

			}

			operacao = 3;
		}

		if (evento.getSource() == botaom) { // botao multiplicar

			if (resultado == 0) {

				resultado = Integer.parseInt(display.getText());

				display.setText("");
			}

			else {

				numero = Integer.parseInt(display.getText());

				display.setText("");
			}

			if (operacao == 1) {

				num1 = numero;

				resultado += num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 2) {

				num1 = numero;

				resultado -= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 3) {

				num1 = numero;

				resultado /= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 4) {

				num1 = numero;

				resultado *= num1;

				resul.setText("" + resultado);

			}

			operacao = 4;

		}

		if (evento.getSource() == botaoigual) { // botao igual

			num1 = Integer.parseInt(display.getText());

			if (operacao == 1) {

				resultado += num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 2) {

				resultado -= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 3) {

				resultado /= num1;

				resul.setText("" + resultado);

			}

			else if (operacao == 4) {

				resultado *= num1;

				resul.setText("" + resultado);

			}

			operacao = 0;
		}

		if (evento.getSource() == botaoce) { // Apagar TextField

			display.setText("");

		}

		if (evento.getSource() == botaoc) { // Apagar TextField

			display.setText("");
			resul.setText("");
			resultado = 0;
			num1 = 0;
			numero = 0;

		}
	}
}
