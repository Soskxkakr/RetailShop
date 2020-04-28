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
