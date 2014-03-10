/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.utils;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Internet
 */
public class ReportCreator {
   
    
    public int CreateReportDeal (String pattern, int idDeal,String Output){
       Connection connection;
        try {
            
            connection = MySQLConnection.getInstance();
           
            Map parameters = new HashMap();
            parameters.put("iddeal", idDeal);
            
            JRExporter exporter =new net.sf.jasperreports.engine.export.JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, parameters);
           
            JasperPrint jasperPrint = JasperFillManager.fillReport(pattern, parameters, connection);
            
           
            JasperExportManager.exportReportToPdfFile(jasperPrint,Output);
            System.out.println("success");
        } catch (JRException e) {
            System.out.println("erreur de compilation" + e.getMessage());
        }
        int a=1;
        return a;
    }
    
}
