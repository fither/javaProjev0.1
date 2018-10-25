package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label onay;
    public TextField uname;
    public PasswordField pword;
    String username = "1";
    String password = "1";
    public Button onaylar;
    public Button cikis;
    
    Stage stage2 = null;
    Stage stage3 = null;
    
    @FXML
    private void onayla(ActionEvent event) throws IOException {
        String kullanici = uname.getText();
        String sifre = pword.getText();
        if(kullanici.equals(username) && sifre.equals(password)){
            onay.setText("giriş başarılı");
            try{
                Stage stage1=new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("panel.fxml"));
                stage1.setScene(new Scene(root1));
                stage1.show();
                closeLogin();
            }
            catch(IOException e){
            System.out.println(e.toString());
        }
        }
        else{
            onay.setText("giriş başarısız");
        }
    }
    
    private void cikisYap(ActionEvent event){
        try{
                Stage stage2=new Stage();
                Parent root2 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                stage2.setScene(new Scene(root2));
                stage2.show();
                back_to_login();
            }
            catch(IOException e){
            System.out.println(e.toString());
        }
    }
    
    public void closeLogin() {
        stage2 = (Stage) onaylar.getScene().getWindow();
        stage2.close();
    }
    
    public void back_to_login(){
        stage3 = (Stage) cikis.getScene().getWindow();
        stage3.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
