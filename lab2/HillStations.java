public class HillStations{
    public void location(){
        System.out.println("Hill Station is surrounded by scenic mountains and valleys.");
    }
    public void famousFor(){
        System.out.println("Hill Station is famous for its cool climate, and adventurous activities like paragliding, and camping.");
    }
    
    public static void main(String[] args){
        
        HillStations h = new HillStations();
        h.location();
        h.famousFor();

        HillStations m = new Manali();
        m.location();
        m.famousFor();

        HillStations ms = new Mussoorie();
        ms.location();
        ms.famousFor();

        HillStations g = new Gulmarg();
        g.location();
        g.famousFor();
    }

}

class Manali extends HillStations{

    @Override
    public void location(){
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }
    @Override
    public void famousFor(){
        System.out.println("Manali is famous for snowfall and adventure sports like skiing,  trekking and river rafting.");
    }
}

class Mussoorie extends HillStations{

    @Override
    public void location(){
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }
    @Override
    public void famousFor(){
        System.out.println("Mussoorie is famous for Landour, scenic waterfalls and cozy cafes.");
    }
}

class Gulmarg extends HillStations{

    @Override
    public void location(){
        System.out.println("Gulmarg is located in Jammu and Kashmir, India.");
    }
    @Override
    public void famousFor(){
        System.out.println("Gulmarg is famous for its ski resorts, the Gulmarg Gondola, and floral meadows.");
    }
}