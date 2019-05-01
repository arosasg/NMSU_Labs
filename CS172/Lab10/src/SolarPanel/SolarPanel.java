// CS172
// SolarPanel.java
// LAB 10
// Written by: Alejandro Rosas
// 11/14/18
// create SolarPanel methods
// Input: none
// Output: return values nominalVoltage, openCircuitVoltage and cellType

package SolarPanel;

public class SolarPanel {

    // instance variables
    private double openCircuitVoltage;
    private int nominalVoltage;
    private String cellType;
    
    public SolarPanel() {
        
        openCircuitVoltage = 40.0;
        nominalVoltage = 12;
        cellType = "Mono-crystalline";
    } //end default constructor
    
    public SolarPanel(double openCircuitVoltage, int nominalVoltage, String cellType) {
        
        setOpenCircuitVoltage(openCircuitVoltage);
        setNominalVoltage(nominalVoltage);
        setCellType(cellType);
    } //end constructor
    
    public void setOpenCircuitVoltage(double openCircuitVoltage) {
        
        if ((openCircuitVoltage >= 0) && (openCircuitVoltage <= 100)) {
            this.openCircuitVoltage = openCircuitVoltage;
        } //end condition
        else {
            this.openCircuitVoltage = 40.0;
        } //end else
    } //end mutator openCircuitVoltage
    
    public void setNominalVoltage(int nominalVoltage) {
        
        if (nominalVoltage == 12 || nominalVoltage == 24) {
            this.nominalVoltage = nominalVoltage;
        } //end condition
        else {
            this.nominalVoltage = 12;
        } //end else
    } //end mutator nominalVoltage
    
    public void setCellType(String cellType) {
        
        String newCellType = cellType.toLowerCase();
        if (newCellType.equals("mono-crystalline") || newCellType.equals("poly-crystalline")) {
            this.cellType = cellType;
        } //end condition
        else {
            cellType = "Mono-crystalline";
        } //end else
    } //end mutator cellType
    
    public double getOpenCircuitVoltage() {
        return openCircuitVoltage;
    } //end accessor openCircuitVoltage
    
    public int getNominalVoltage() {
        return nominalVoltage;
    } //end accessor nominalVoltage
    
    public String getCellType() {
        return cellType;
    } //end accessor cellType
    
    public String toString() {
        
        String result = "SolarPanel: Voc = " + openCircuitVoltage + " V Nom = " + nominalVoltage + " V cellType = " + cellType;
        return result;
    } //end toString method
} //end SolarPanel class
