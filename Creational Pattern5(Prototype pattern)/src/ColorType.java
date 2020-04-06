import java.util.HashMap;
import java.util.Map;
public class ColorType{ 
		   
	    private static Map<String, Color> colorMap = new HashMap<String, Color>();  
	       
	    static 
	    { 
	        colorMap.put("blue", new Blue()); 
	        colorMap.put("purple", new Purple()); 
	    } 
	       
	    public static Color getColor(String colorName) 
	    { 
	        return(Color)colorMap.get(colorName).clone(); 
	    } 
	} 


