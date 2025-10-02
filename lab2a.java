public class lab2a 
{
    public static void main(String[] args) 
    {

        HotelRoom roomA = new HotelRoom(200, "Single", 1,100, true);
    
        HotelRoom roomB = new HotelRoom(201, "Double",0,80, false);

        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90, false);

        System.out.println("Room Number: " + roomA.getRoomNumber() + " Room Type: " + roomA.getRoomType());
        System.out.println("Room Number: " + roomB.getRoomNumber() + " Room Type: " + roomB.getRoomType());
        System.out.println("Room Number: " + roomC.getRoomNumber() + " Room Type: " + roomC.getRoomType() + " Room Status: " + roomC.getRoomStatus() + " Room Rate: " + roomC.getRoomRate());
        
    }
}
