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


import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javafx.scene.control.ToggleButton;



public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label onay;
    public TextField uname;
    public PasswordField pword;
    public Button onaylar;
    public Button cikis;
    public Label deneme1;
    public ToggleButton Makine1;
    public void veritabaniBaglanti(String kadi,String ksifre){
        //Veritabanı bağlantısı
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            String db_url = "jdbc:mysql://192.168.1.:3306/javaProje";
//            String db_username = "root";
//            String db_password = "";
//            Connection con = (Connection) DriverManager.getConnection(db_url, db_username, db_password);
//            Statement st = (Statement) con.createStatement();
//            String sorgu = "select uname,pword from users where uname='" + kadi + "' and pword='" + ksifre +"'";
//            ResultSet rs = st.executeQuery(sorgu);
//            
//            while(rs.next()){
//                String username = rs.getString("uname");
//                String password = rs.getString("pword");
//                if(!(username.equals(kadi) && password.equals(ksifre))){
//                    onay.setText("giriş başarısız");
//                }
//                else{
//                    changeWindow("panel.fxml",onaylar);
//                }
//                /*if(username.equals(kadi) && password.equals(ksifre)){
//                    changeWindow("panel.fxml",onaylar);
//                }
//                else{
//                    System.out.println("giriş");
//                    onay.setText("giriş başarısız");
//                }
//                */
//            }
//            rs.close();
//        } 
//        catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            onay.setText("Sürücü projeye eklenmemiş!");
//        } 
//        catch (SQLException ex) {
//            ex.printStackTrace();
//            onay.setText("Veritabanına bağlantı sağlanamadı!");
//        }
            changeWindow("panel.fxml",onaylar);
}
    
    @FXML
    private void onayla(ActionEvent event) throws IOException, SQLException {
//        String kullanici = uname.getText();
//        String sifre = pword.getText();
//        veritabaniBaglanti(kullanici,sifre);
            changeWindow("panel.fxml",onaylar);
    }
    
    public void cikisYap(ActionEvent event){
        /*back_to_login();*/
        changeWindow("FXMLDocument.fxml",cikis);
    }
    
    public void changeWindow(String gelen,Button giden){
        try{
            Stage stage2 = new Stage();
            Parent root2 = FXMLLoader.load(getClass().getResource(gelen));
            stage2.setScene(new Scene(root2));
            stage2.show();
        }
        catch(IOException e){
        System.out.println(e.toString());
        }
        Stage stage3 = new Stage();
        stage3 = (Stage) giden.getScene().getWindow();
        stage3.close();
    }
    public void yazdir(ActionEvent event)
    {
    
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*veritabaniBaglanti();*/
    }   
}