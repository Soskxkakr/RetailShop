package controller;

import model.User;
import pkg.ReadFile;
import pkg.Serializer;
import configs.Config;

import java.util.ArrayList;
import java.util.Map;

import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
public class CustomerService extends OrderService {
    
    public CustomerService(User user) {
        super(user);
    }
    
}
