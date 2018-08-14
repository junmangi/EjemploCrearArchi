/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivo;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Estudiante;

/**
 *
 * @author juan_manuel.gil
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label Nombre;
    @FXML
    private Label Telefono;
    @FXML
    private Label Correo;
    @FXML
    private Label Codigo;
    @FXML
    private Label Carrera;
    @FXML
    private TextField tNombre;
    @FXML
    private TextField tCorreo;
    @FXML
    private TextField tCodigo;
    @FXML
    private TextField tcarrera;
    @FXML
    private TextField tTelefono;

    LinkedList<Estudiante> listaE;

    @FXML
    private void AgregarEstudiantes(ActionEvent event) {
        String nombre = tNombre.getText();
        String correo = tCorreo.getText();
        String codigo = tCodigo.getText();
        String carrera = tcarrera.getText();
        String telefono = tTelefono.getText();
        Estudiante objE = new Estudiante(codigo, carrera, nombre, telefono, correo);
        listaE.add(objE);

    }

    @FXML
    private void GuardarArchivo(ActionEvent event) {
        Estudiante objeV = new Estudiante();
        boolean guardar = objeV.crearArchivoXML(listaE);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE = new LinkedList<>();
    }

}
