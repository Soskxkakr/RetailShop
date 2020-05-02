/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import configs.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import pkg.ReadFile;
import pkg.Serializer;

/**
 *
 * @author Hendika
 */
public class NewMain extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    private JPanel background = new JPanel();
    private JPanel itemsPanel = new JPanel();
    private JPanel electronicPanel = new JPanel();
    private JPanel utensilPanel = new JPanel();
    private JPanel houseHold = new JPanel();
    private Config config = new Config();
    private Map<String, ArrayList<Map<String, String>>> products = new HashMap<>();
    
    public NewMain() {
        try {
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.products = new Serializer().toMap( new ReadFile().getJson( getClass().getResource(config.getConfigVar()).toURI()) ); 
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        setSize(1280, 720);
        for ( String key : products.keySet() ) {
            if ( key.equals("Electronic") ) {
                for ( Map<String, String> productDetail : products.get(key) ) {
                    JPanel electronicItem = new JPanel();
                    javax.swing.JLabel electronicIcon = new javax.swing.JLabel();
                    javax.swing.JLabel electronicName = new javax.swing.JLabel();
                    
                    electronicIcon.setIcon( new ImageIcon( getClass().getResource(productDetail.get("URL")) ) );
                    electronicName.setText( productDetail.get("Name") );
                    electronicItem.add(electronicIcon);
                    electronicItem.add(electronicName);
                    GroupLayout electronicItemLayout = new GroupLayout(electronicItem);
                    electronicItem.setLayout(electronicItemLayout);
                    electronicItemLayout.setHorizontalGroup(
                        electronicItemLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(electronicIcon)
                    );
                    electronicPanel.add(electronicItem);
                    
                }
            }
            if (key.equals("Utensil")) {
                for ( Map<String, String> productDetail : products.get(key) ){
                    System.out.print("sesuatu"+productDetail);
                    JPanel utensilItem = new JPanel();
                    javax.swing.JLabel utensilIcon = new javax.swing.JLabel();
                    javax.swing.JLabel utensilName = new javax.swing.JLabel();
                    
                    utensilIcon.setIcon(new ImageIcon ( getClass().getResource(productDetail.get("URL"))));
                    utensilName.setText(productDetail.get("Name"));
                    utensilItem.add(utensilIcon);
                    utensilItem.add(utensilName);
                    GroupLayout utensilItemLayout = new GroupLayout(utensilItem);
                    utensilItemLayout.setHorizontalGroup(utensilItemLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(utensilIcon));
                    utensilPanel.add(utensilItem);
                }
            } 
            if (key.equals("Household Appliance")) {
                for ( Map<String, String> productDetail : products.get(key) ){
                    JPanel houseHoldItem = new JPanel();
                    javax.swing.JLabel houseHoldIcon = new javax.swing.JLabel();
                    javax.swing.JLabel houseHoldName = new javax.swing.JLabel();
                    
                    houseHoldIcon.setIcon(new ImageIcon ( getClass().getResource(productDetail.get("URL"))));
                    houseHoldName.setText(productDetail.get("Name"));
                    houseHoldItem.add(houseHoldIcon);
                    houseHoldItem.add(houseHoldName);
                    GroupLayout houseHoldItemLayout = new GroupLayout(houseHoldItem);
                    houseHoldItemLayout.setHorizontalGroup(houseHoldItemLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(houseHoldIcon));
                    utensilPanel.add(houseHoldItem);
                }
            }
            if (key.equals("Stationery")) {
                for ( Map<String, String> productDetail : products.get(key) ){
                    JPanel stationeryItem = new JPanel();
                    javax.swing.JLabel stationeryIcon = new javax.swing.JLabel();
                    javax.swing.JLabel stationeryName = new javax.swing.JLabel();
                    
                    stationeryIcon.setIcon(new ImageIcon ( getClass().getResource(productDetail.get("URL"))));
                    stationeryName.setText(productDetail.get("Name"));
                    stationeryItem.add(stationeryIcon);
                    stationeryItem.add(stationeryName);
                    GroupLayout stationeryItemLayout = new GroupLayout(stationeryItem);
                    stationeryItemLayout.setHorizontalGroup(stationeryItemLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(stationeryIcon));
                    utensilPanel.add(stationeryItem);
                }
            }
            if (key.equals("Accessories")) {
                for ( Map<String, String> productDetail : products.get(key) ){
                    System.out.println("sesuatu"+productDetail);
                    JPanel accessoriesItem = new JPanel();
                    javax.swing.JLabel accessoriesIcon = new javax.swing.JLabel();
                    javax.swing.JLabel accessoriesName = new javax.swing.JLabel();
                    
                    accessoriesIcon.setIcon(new ImageIcon ( getClass().getResource(productDetail.get("URL"))));
                    accessoriesName.setText(productDetail.get("Name"));
                    accessoriesItem.add(accessoriesIcon);
                    accessoriesItem.add(accessoriesName);
                    GroupLayout utensilItemLayout = new GroupLayout(accessoriesItem);
                    utensilItemLayout.setHorizontalGroup(utensilItemLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(accessoriesIcon));
                    utensilPanel.add(accessoriesItem);
                }
            }
        }   
        initComponents();
    }
    
    public void initComponents(){
        
    }
    
    
}
class RunThis {
    public static void main(String[] args) {
        NewMain nm = new NewMain();
        nm.setVisible(true);
    }
}
