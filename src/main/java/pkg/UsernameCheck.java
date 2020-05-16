/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import configs.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hendika
 */
public class UsernameCheck {
    private ArrayList<Map<String, String>> customerList = new ArrayList<>();
    private Config config = new Config();
    private Serializer convert = new Serializer();
    private ReadFile fileReader = new ReadFile();
    
    public boolean CustomerUserName(String usernameInput){
    try{
        fileReader.clear();
        config.setConfigVar("CUSTOMER_JSON_PATH");
        this.customerList = convert.toArrayList( fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
        for (Map<String, String> customerData : this.customerList) {
                if (customerData.get("Username").equals(usernameInput)) {
                    return true;
                }
              }
    }catch (Exception e){
        e.printStackTrace();
        }
        return false;
    }
    
}
