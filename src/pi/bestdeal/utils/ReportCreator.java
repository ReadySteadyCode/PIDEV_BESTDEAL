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
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Internet
 */
public class ReportCreator {
   
    
    public int CreateReportDeal (String pattern, int idDeal,String Output){
       Connection connection;
        try {
            // - Connexion à la base
            connection = MySQLConnection.getInstance();
            // - Chargement et compilation du rapport
           //JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Internet\\Desktop\\rapport\\mondeal.jrxml");
          //JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
         //   JasperReport jasperReport1 = JasperFillManager.fillReportToFile("reports/DbReport.jasper",new HashMap(), connection);
            
            
            // - Paramètres à envoyer au rapport
            Map parameters = new HashMap();
            parameters.put("iddeal", idDeal);
            
            JRExporter exporter =new net.sf.jasperreports.engine.export.JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, parameters);
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(pattern, parameters, connection);
            
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint,Output);
            System.out.println("success");
        } catch (JRException e) {
            System.out.println("erreur de compilation" + e.getMessage());
        }
        int a=1;
        return a;
    }
    
}
