

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX_Tic_Tac_Toe extends Application {

	Button btn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	// feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Tic Tac Toe");
		Scene scene = new Scene(new VBox(), 700 ,700);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
