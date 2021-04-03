import java.util.*;

class Parked_CarOwner_Details{
    String ownerName;
    String carModel;
    String carNO;
    String ownerAddress;
    Long owerMobileNo;

    Parked_CarOwner_Details(String ownerName,String carModel,String carNO,String ownerAddress){
        this.ownerName=ownerName;
        this.carModel=carModel;
        this.carNO=carNO;
        this.ownerAddress=ownerAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNO() {
        return carNO;
    }

    public void setCarNO(String carNO) {
        this.carNO = carNO;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

}
class Parked_CarOwnerList{
    ArrayList<Parked_CarOwner_Details> list=new ArrayList<Parked_CarOwner_Details>();

    public void add_new_car(String ownerName,String carModel,String carNO,String ownerAddress){
        list.add(new Parked_CarOwner_Details(ownerName,carModel,carNO,ownerAddress));
    }
    
    public void remove_car(String carNO){
        for(Parked_CarOwner_Details l: list){
            if(l.carNO.equals(carNO)){
                int index= list.indexOf(l);
                list.remove(index);
                System.out.println("Car is successfully removed.");
                break;
            }
        }
    }
 
public void get_parked_car_location(String carNO){
    for(Parked_CarOwner_Details l: list){
        if(l.carNO.equals(carNO)){
            int index= list.indexOf(l);
            System.out.println("Postion of car parked = "+index);
            break;
        }
        else{
            System.out.println("Car Not Found.");
        }
    }
}
}