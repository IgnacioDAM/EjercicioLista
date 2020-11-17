package dad.javafx.ejerciciolista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {
	
	//Vista
	@FXML
	GridPane view;
	
	@FXML
	ListView<String> disponiblesVista;
	
	@FXML
	ListView<String> seleccionadosVista;
	
	@FXML
	Button cogerTodosButton;
	
	@FXML
	Button cogerButton;
	
	@FXML
	Button darButton;
	
	@FXML
	Button darTodosButton;
	
	//Model
	private Model model = new Model();
	
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Vista.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
