import java.util.ArrayList;

public class Santehnic extends Build_Materials {
    public String type;

    public Santehnic(){
        super();
        this.type="";
    }

    public Santehnic( double price, String firm, String name, String type){
        super(price,firm,name);
        this.type=type;
    }

    public void Display(){
        super.Display();
        System.out.println("Type = " + type);
    }

    public void Search(double price){
        super.Search(price);
       if(this.name.equals("washbasins")){
         if(this.price < price){
             Display();
         }
      }
    }

}
