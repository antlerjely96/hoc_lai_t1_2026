package Composition;

public class House {
    public Room livingRoom;
    public Room bedRoom;

    public House(){
        this.livingRoom = new Room("Living Room");
        this.bedRoom = new Room("Bedroom");
    }
}
