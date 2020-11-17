package dad.javafx.ejerciciolista;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

	// Sin seleccion multiple, si quisiesemos seleccion multiple necesitariamos dos
	// listProperty en lugar de strings
	private ListProperty<String> disponibles = new SimpleListProperty<String>(
			FXCollections.observableArrayList("Espada", "Cuchillo", "Martillo", "Escopeta", "Hacha", "Pistola"));
	private StringProperty dispSeleccionado = new SimpleStringProperty();
	private ListProperty<String> seleccionados = new SimpleListProperty<String>(FXCollections.observableArrayList());
	private StringProperty selecSeleccionado = new SimpleStringProperty();

	public final ListProperty<String> disponiblesProperty() {
		return this.disponibles;
	}

	public final ObservableList<String> getDisponibles() {
		return this.disponiblesProperty().get();
	}

	public final void setDisponibles(final ObservableList<String> disponibles) {
		this.disponiblesProperty().set(disponibles);
	}

	public final StringProperty dispSeleccionadoProperty() {
		return this.dispSeleccionado;
	}

	public final String getDispSeleccionado() {
		return this.dispSeleccionadoProperty().get();
	}

	public final void setDispSeleccionado(final String dispSeleccionado) {
		this.dispSeleccionadoProperty().set(dispSeleccionado);
	}

	public final ListProperty<String> seleccionadosProperty() {
		return this.seleccionados;
	}

	public final ObservableList<String> getSeleccionados() {
		return this.seleccionadosProperty().get();
	}

	public final void setSeleccionados(final ObservableList<String> seleccionados) {
		this.seleccionadosProperty().set(seleccionados);
	}

	public final StringProperty selecSeleccionadoProperty() {
		return this.selecSeleccionado;
	}

	public final String getSelecSeleccionado() {
		return this.selecSeleccionadoProperty().get();
	}

	public final void setSelecSeleccionado(final String selecSeleccionado) {
		this.selecSeleccionadoProperty().set(selecSeleccionado);
	}
}
