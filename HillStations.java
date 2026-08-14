public class HillStations{
    public void location(){
        System.out.println("Hill Station is surrounded by scenic mountains and valleys.");
    }
    public void famous_For(){
        System.out.println("Hill Station is famous for its cool climate, and adventorous activities like paragliding, and camping.");
    }
    
    public static void main(String[] args){
        
        HillStations h = new HillStations();
        h.location();
        h.famous_For();

        Manali m = new Manali();
        m.location();
        m.famous_For();

        Mussorie ms = new Mussorie();
        ms.location();
        ms.famous_For();

        Gulmarg g = new Gulmarg();
        g.location();
        g.famous_For();
    }

}

class Manali extends HillStations{

    @Override
    public void location(){
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }
    @Override
    public void famous_For(){
        System.out.println("Manali is famous for snowfall and adventure sports like skiing,  trekking and river rafting.");
    }
}

class Mussorie extends HillStations{

    @Override
    public void location(){
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }
    @Override
    public void famous_For(){
        System.out.println("Mussoorie is famous for Landour, scenic waterfalls and cozy cafes.");
    }
}

class Gulmarg extends HillStations{

    @Override
    public void location(){
        System.out.println("Gulmarg is located in Jammu and Kashmir, India.");
    }
    @Override
    public void famous_For(){
        System.out.println("Gulmarg is famous for its ski resorts, the Gulmarg Gondola, and floral meadows.");
    }
}