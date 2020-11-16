package dad.javafx.ejerciciolista;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class Model {
	
	//Sin seleccion multiple, si quisiesemos seleccion multiple necesitariamos dos listProperty en lugar de integers
	private ListProperty<String> disponibles = new SimpleListProperty<String>(FXCollections.observableArrayList());
	private IntegerProperty dispSeleccionado = new SimpleIntegerProperty();
	private ListProperty<String> seleccionados = new SimpleListProperty<String>(FXCollections.observableArrayList());
	private IntegerProperty selecSeleccionado = new SimpleIntegerProperty();
	
	
}
