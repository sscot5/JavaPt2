public class TestRoom {
    public static void main(String[] args) {
        RoomDimension rm1 = new RoomDimension(3, 4);
        System.out.println(rm1.getArea());
        System.out.println(rm1);
        RoomCarpet rm = new RoomCarpet(rm1, 2.5);
        System.out.println(rm);

        System.out.println(rm.getCost());
    }

}
