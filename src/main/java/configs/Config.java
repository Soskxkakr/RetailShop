package configs;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class Config {
    private InputStream IS = getClass().getResourceAsStream("/Resource/Config.properties");
    private Properties Prop = new Properties();
    private String ConfigVar;
    
    public Config(){
        try {
            Prop.load(this.IS);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void setConfigVar(String Property){
        this.ConfigVar = Prop.getProperty(Property);
    }
}
