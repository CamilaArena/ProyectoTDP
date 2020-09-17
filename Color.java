

class Color{

    private int rojo;
    private int azul;
    private int verde;
    
    //Constructor
    public Color(){
	rojo = 150;
        azul = 0;
        verde = 0;
    }
    
    public Color(int r, int a, int v){
        rojo = r;
        azul = a;
        verde = v;
    }
    
    //Setters
    public void setRojo(int val){
        if(val <= 255)
            rojo = val;
        else
            if(val < 0)
                rojo = 0;
            else
                if(val > 255)
                    rojo = 255;
    }
    
       public void setAzul(int val){
        if(val <= 255)
            azul = val;
        else
            if(val < 0)
                azul = 0;
            else
                if(val > 255)
                    azul = 255;
    }
    
       public void setVerde(int val){
        if(val <= 255)
            verde = val;
        else
            if(val < 0)
                verde = 0;
            else
                if(val > 255)
                    verde = 255;
    }
    
    
    //Getters
    public int getRojo(){
        return rojo;
    }
    
     public int getAzul(){
        return azul;
    }
    
     public int getVerde(){
        return verde;
    }
    
    public boolean equals(Color p){
        return rojo == p.getRojo() && azul == p.getAzul() && verde == p.getVerde();
    }
    
    public Color clone(){
        return new Color(rojo, azul, verde);
    }
    
}
