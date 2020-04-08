package configs;

import java.io.InputStream;
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
        } catch (NullPointerException e){
            System.out.println("ERROR : No File in the directory");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void setConfigVar(String Property){
        this.ConfigVar = Prop.getProperty(Property);
    }
}
