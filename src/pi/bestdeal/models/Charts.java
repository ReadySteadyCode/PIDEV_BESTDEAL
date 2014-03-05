/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.models;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import pi.bestdeal.dao.ChartDAO;
import pi.bestdeal.dao.ConsultationDAO;

/**
 *
 * @author Internet
 */
public class Charts extends JPanel
{
    public Charts() 
    {
        super();
        
      /*
       JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Chart", // Title
                "x-axis", // x-axis Label
                "y-axis", // y-axis Label
                createDataset(), // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );
        XYItemRenderer rend = chart.getXYPlot().getRenderer();
       
        ChartPanel crepart = new ChartPanel(chart);
        Plot plot = chart.getPlot();
        this.add(crepart);*/
        
    }
    public XYSeriesCollection createDataset(String DateDebut,String DateFin,int idDeal) {
        XYSeries series = new XYSeries("évolution des consultations");
        ChartDAO aO = ChartDAO.getInstance();
        for (int a : aO.daysvalues(DateDebut, DateFin, idDeal)) {

            series.add(aO.daysvalues(DateDebut, DateFin, idDeal).indexOf(a), a);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;

    }
    public void XYChart (XYSeriesCollection mydataset)
    {
         JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Chart", // Title
                "x-axis", // x-axis Label
                "y-axis", // y-axis Label
                mydataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );
        XYItemRenderer rend = chart.getXYPlot().getRenderer();
       
        ChartPanel crepart = new ChartPanel(chart);
        Plot plot = chart.getPlot();
        this.add(crepart);
        
    }
    public void PieChart (int idDeal)
    {
        
    }
}
