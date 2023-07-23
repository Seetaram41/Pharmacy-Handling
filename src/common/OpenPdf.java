package common;


import DataBaseOperation.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seeta Ram
 */
public class OpenPdf {
     public static void openById(String id){
        try {
            if((new File(PharmacyUtils.billPath+id+".pdf")).exists()){
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+PharmacyUtils.billPath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File is Not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
