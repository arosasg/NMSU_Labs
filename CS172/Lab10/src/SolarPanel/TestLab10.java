// CS172
// TestLab10.java
// LAB 10
// Written by: Alejandro Rosas
// 11/14/18
// test SolarPanel methods
// Input: none
// Output: return values nominalV0ltage, openCircuitVoltage and cellType

package SolarPanel;

public class TestLab10 {

	public static void main(String[] args) {
		
        // create SolarPanel objects
        SolarPanel panelOne = new SolarPanel();
        SolarPanel panelTwo = new SolarPanel(40.0, 24, "Mono-crystalline");
        
        // setting values for panelOne
        panelOne.setOpenCircuitVoltage(20.0);
        panelOne.setNominalVoltage(12);
        panelOne.setCellType("Mono-crystalline");
        
        // printing panelOne
        System.out.println(panelOne);
        
        // changing
        panelOne.setOpenCircuitVoltage(150.0);
        System.out.println(panelOne.getOpenCircuitVoltage());
        
        panelOne.setNominalVoltage(-10);
        System.out.println(panelOne.getNominalVoltage());
        
        // testing accessors of panelTwo
        System.out.println(panelTwo.getOpenCircuitVoltage());
        System.out.println(panelTwo.getNominalVoltage());
        System.out.println(panelTwo.getCellType());
        
        panelTwo.setOpenCircuitVoltage(0);
        System.out.println(panelTwo.getOpenCircuitVoltage());
        
        panelTwo.setCellType("Vinyl Polymer");
        System.out.println(panelTwo.getCellType());
        
        // printing panelTwo
        System.out.println(panelTwo);
        
    } //end main
} //end SolarPanel class

