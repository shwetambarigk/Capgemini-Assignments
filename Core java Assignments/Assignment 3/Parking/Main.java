public class Main {
    public static void main(String[] args) {
        Parked_CarOwnerList list = new Parked_CarOwnerList();
        list.add_new_car("shweta", "xx1", "1234", "abcd");
        list.add_new_car("aarti", "xx2", "1235", "efgh");

        list.get_parked_car_location("1235");
        list.remove_car("1235");
    }
}