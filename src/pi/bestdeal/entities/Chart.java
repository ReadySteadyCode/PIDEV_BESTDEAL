/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.entities;

/**
 *
 * @author Internet
 */
public class Chart {

    private int idChart;
    private String typeChart;
    private String descChart;
    private int idRapport;

    public Chart() {
    }

    public Chart(int idChart, String typeChart, String descChart, int idRapport) {
        this.idChart = idChart;
        this.typeChart = typeChart;
        this.descChart = descChart;
        this.idRapport = idRapport;
    }

    public int getIdChart() {
        return idChart;
    }

    public String getTypeChart() {
        return typeChart;
    }

    public String getDescChart() {
        return descChart;
    }

    public int getIdRapport() {
        return idRapport;
    }

    public void setIdChart(int idChart) {
        this.idChart = idChart;
    }

    public void setTypeChart(String typeChart) {
        this.typeChart = typeChart;
    }

    public void setDescChart(String descChart) {
        this.descChart = descChart;
    }

    public void setIdRapport(int idRapport) {
        this.idRapport = idRapport;
    }

    @Override
    public String toString() {
        return "Chart{" + "idChart=" + idChart + ", typeChart=" + typeChart + ", descChart=" + descChart + ", idRapport=" + idRapport + '}';
    }

}
