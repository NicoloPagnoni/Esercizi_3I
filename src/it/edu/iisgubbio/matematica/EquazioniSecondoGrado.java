package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EquazioniSecondoGrado extends Application{

	Label lA= new Label("a");
	Label lB= new Label("b");
	Label lC= new Label("c");
	Label lX1= new Label("x1");
	Label lX2= new Label("x2");
	Label lRx1= new Label("??");
	Label lRx2= new Label("??");
	TextField tfA= new TextField();
	TextField tfB= new TextField();
	TextField tfC= new TextField();
	Button bRisolvi= new Button("Risolvi");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(lA, 0, 0);
		principale.add(lB, 0, 1);
		principale.add(lC, 0, 2);
		principale.add(tfA, 1, 0);
		principale.add(tfB, 1, 1);
		principale.add(tfC, 1, 2);
		principale.add(lX1, 0, 3);
		principale.add(lX2, 2, 3);
		principale.add(lRx1, 1, 3);
		principale.add(lRx2, 3, 3);
		principale.add(bRisolvi, 2, 0, 2, 3);
		bRisolvi.setMaxHeight(Integer.MAX_VALUE);
	
		Scene scena = new Scene(principale);
		
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/EquazioniSecondoGrado.css");
		lX1.getStyleClass().add("risultato");
		lX2.getStyleClass().add("risultato");
		lRx1.getStyleClass().add("risultato");
		lRx2.getStyleClass().add("risultato");
		lRx1.getStyleClass().add("risultato1");
		lRx2.getStyleClass().add("risultato1");
		principale.getStyleClass().add("principale");
		finestra.setTitle("EquazioniSecondoGrado");
		finestra.setScene(scena);
		finestra.show();
		
		bRisolvi.setOnAction( e -> eseguiRisolvi() );
	}
	private void eseguiRisolvi() {
		double a, b, c, x1, x2,d;
		
		a= Double.parseDouble(tfA.getText());
		b= Double.parseDouble(tfB.getText());
		c= Double.parseDouble(tfC.getText());
		d=b*b-4*a*c;
		if(d>=0) {
			x1=((-b)+Math.sqrt(d))/(2*a);
			x2=((-b)-Math.sqrt(d))/(2*a);
			lRx1.setText(""+x1);
			lRx2.setText(""+x2);
		}else {
			lRx1.setText("impossibile");
			lRx2.setText("impossibile");
		}
	}
	public static void main(String[] args) {
		 launch(args);
	}		
}
