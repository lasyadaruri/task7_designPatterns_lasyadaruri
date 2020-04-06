class Prototype 
{ 
    public static void main (String[] args) 
    { 
        ColorType.getColor("blue").addColor(); 
        ColorType.getColor("purple").addColor(); 
        ColorType.getColor("purple").addColor(); 
        ColorType.getColor("blue").addColor(); 
    } 
} 
