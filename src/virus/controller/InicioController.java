/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import virus.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class InicioController extends Controller implements Initializable {

    @FXML
    private ImageView omg;
    @FXML
    private TextField txtIP;
    @FXML
    private TextField txtServidor;
    @FXML
    private TextField txtJugador;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image imgLogo;
        try {
            imgLogo = new Image("virus/resources/fondo2.png");
            omg.setImage(imgLogo);
        } catch (Exception e) {
        }
    }    

    @Override
    public void initialize() {


    }

    @FXML
    private void Salir(MouseEvent event) {
        FlowController.getInstance().goView("Menu");
    }

    @FXML
    private void Jugar(MouseEvent event) {
        FlowController.getInstance().goView("Juego");
    }
    
}
