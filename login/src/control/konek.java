/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class konek {
    private static Connection konek;    
    public static Connection getKonek(){
        if(konek==null){
            try{
                String url;
                url="jdbc:mysql://localhost:3306/db_login";
                String username = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = DriverManager.getConnection(url,username,password);
            }catch (SQLException t){
                JOptionPane.showMessageDialog(null, "Koneksi Error");
        }
        
    }return konek;
    }
    public static void main(String[] args) {
        getKonek();
    }
}
