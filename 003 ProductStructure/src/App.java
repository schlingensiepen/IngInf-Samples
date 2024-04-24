public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Item auto = new Item(
            "1234", 
            "Auto", 
            "A car");
        Item haube = new Item(
            "1235", 
            "Haube", 
            "A hood");
        
        auto.getContains().add(
            new ItemInstance ("Haube", haube));
        
        Item achse = new Item(
            "1236", 
            "Achse", 
            "An axle");

        auto.getContains().add(
            new ItemInstance ("Vorderachse", achse));

        auto.getContains().add(
            new ItemInstance ("Hinterachse", achse));
        
        
        Item rad = new Item (
            "1237", 
            "Rad", 
            "A wheel");

        achse.getContains().add(
            new ItemInstance ("linkes", rad));
        achse.getContains().add(
            new ItemInstance ("rechtes", rad));
        

        Item steckAchse = new Item(
            "0815", "Steckachse",
            "Stick");            

        achse.getContains().add(
            new ItemInstance ("Steckachse", steckAchse));
    }
}
