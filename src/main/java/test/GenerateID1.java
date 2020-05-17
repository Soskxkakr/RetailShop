/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import pkg.GenerateId;
import configs.Config;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import pkg.ReadFile;
import pkg.Serializer;

/**
 *
 * @author Hendika
 */
class GenerateID1 implements GenerateId {
    private Config CONFIG = new Config();
//    private ReadFile RF = new ReadFile();
//    private Serializer converter = new Serializer();
//    private ArrayList<Map<String, String>> customerList = new ArrayList<>();
//    private int IncrementedID;
////sorry bacot GBLKKKKK
//    public void addCustomer (){
//        try { 
//            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
//            System.out.println("Check this: "+this.customerList);
////            this.customerList = converter.toArrayList(RF.getJson( getClass().getResource(CONFIG.getConfigVar()).toURI() ));
//            Map<String, String> addCustomer = new HashMap<>(); 
//            addCustomer.put("ID", "C"+generateId());     // Auto generated ID
//            addCustomer.put("Username", "test");         //
//            addCustomer.put("Password", "test");         // Improve Later
//            addCustomer.put("Name", "test");             //
//            addCustomer.put("ContactNo", "test");        //
//            addCustomer.put("Email", "test");            //
//            this.customerList.add(addCustomer);
//            System.out.println("MMOTHERFUCKER"+addCustomer);
//            System.out.println("KONNICHIWAHAT"+this.customerList);
////            FileWriter file = new FileWriter(RF.getFileName());
////            file.write(this.customerList.toString());
////            file.close();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    @Override
//    public int generateId() {
//        int IncrementedID = 0;
//        try {
//            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
//            this.customerList = RF.getJSONArray( getClass().getResource(CONFIG.getConfigVar()).toURI() );
//             ArrayList CustomerIdInt = new ArrayList();         
//                 for (JSONObject CC : customerList){
//                     String CustomerInfo = CC.get("ID").toString().substring(1);
//                     int CustomerId = Integer.parseInt(CustomerInfo);
//                     CustomerIdInt.add(CustomerId);
//                 }
//                 System.out.println(CustomerIdInt);
//                 IncrementedID = Integer.parseInt( Collections.max(CustomerIdInt).toString() ) + 1;   
//                    System.out.println(IncrementedID);
//         } catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            return IncrementedID;
//        }
//    }
//    @Override
//    public int generateId() {
//        int IncrementedID = 0;
//        try {
//            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
//            this.customerList = converter.toArrayList(RF.getJson(getClass().getResource(CONFIG.getConfigVar()).toURI()));
//             ArrayList CustomerIdInt = new ArrayList();         
//                 for (Map<String, String> CC : customerList){
//                     String CustomerInfo = CC.get("ID").toString().substring(1);
//                     int CustomerId = Integer.parseInt(CustomerInfo);
//                     CustomerIdInt.add(CustomerId);
//                 }
//                 System.out.println(CustomerIdInt);
//                 IncrementedID = Integer.parseInt( Collections.max(CustomerIdInt).toString() ) + 1;   
//                    System.out.println(IncrementedID);
//         } catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            return IncrementedID;
//        }
//    }

    @Override
    public int generateId(ArrayList<Integer> id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
