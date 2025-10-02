public class HotelRoom
{
    private int roomNumber;
    private String roomType;
    private int roomStatus;
    private double roomRate;
    private boolean occupied;
    

    public HotelRoom()
    {
        setRoomStatus(0);
        setRoomNumber(0);
        setRoomType("");
        setRoomRate(0.0);
    }

    public boolean isOccupied()
    {
        return occupied;
    }

    public void setOccupied(boolean occupied)
    {
        if (roomStatus == 1 && !this.occupied) 
        {
            this.occupied = true;
            System.out.println("Room successfully booked.");
        }
        else if(roomStatus == 0 )
        {
            System.out.println("Room status is vacant. Not booking.");
            this.occupied = false;
        }
        else
        {
            System.out.println("Room already occupied. Cannot book again.");
        }
        
    }

    public HotelRoom(int roomNumber, String roomType, int roomStatus, double roomRate, boolean occupied)
    {
        setRoomStatus(roomStatus);
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setRoomRate(roomRate);
        setOccupied(occupied);
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public String getRoomType()
    {
        return roomType;
    }
    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    } 


    public int getRoomStatus()
    {
        return roomStatus;
    } 
    public void setRoomStatus(int roomStatus)
    {
        this.roomStatus = roomStatus;
    }

    public double getRoomRate()
    {
        return roomRate;
    } 
    public void setRoomRate(double roomRate)
    {
        this.roomRate = roomRate;
    }
}
