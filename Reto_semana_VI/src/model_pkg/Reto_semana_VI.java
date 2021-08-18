/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import view_pkg.FrameHospitals;

/**
 *
 * @author lmram
 */
public class Reto_semana_VI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion inst_connect = new Conexion();
        FrameHospitals inst_frame = new FrameHospitals();
        inst_connect.getConnection();
        inst_frame.setVisible(true);
    }
    
}
