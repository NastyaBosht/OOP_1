public class Build_Materials {
    public double price;
    public String firm;
    public String name;

    public Build_Materials(){
        this.price=0;
        this.firm="";
        this.name="";
    }
    public Build_Materials(double price, String firm, String name){
        this.price = price;
        this.firm=firm;
        this.name=name;
    }

    public void Display(){
        System.out.print("Price = " + this.price + "Firm = " + this.firm + "Name = " + name);
    }
     public  void Search(double price){}

}
