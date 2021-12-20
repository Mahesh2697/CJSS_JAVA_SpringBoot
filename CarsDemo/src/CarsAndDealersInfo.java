import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsAndDealersInfo {
    public static void main(String args[]){

        //"-------------Cars_Info------------"//
        CarsDetails cars1Details= new CarsDetails();
        cars1Details.setCarName("MarathiSuzuki");
        cars1Details.setPrice(100000);
        QuantityDetails MarathiSuzukiQuantityDetails = new QuantityDetails();
        MarathiSuzukiQuantityDetails.setQuantity(20);
        cars1Details.setQuantityDetails(MarathiSuzukiQuantityDetails);

        CarsDetails cars2Details= new CarsDetails();
        cars2Details.setCarName("ShiftDesire");
        cars2Details.setPrice(300000);
        QuantityDetails shiftQuantityDetails = new QuantityDetails();
        shiftQuantityDetails.setQuantity(10);
        cars2Details.setQuantityDetails(shiftQuantityDetails);


        CarsDetails cars3Details= new CarsDetails();
        cars3Details.setCarName("Benz");
        cars3Details.setPrice(4000000);
        QuantityDetails BenzQuantityDetails = new QuantityDetails();
        BenzQuantityDetails.setQuantity(3);
        cars3Details.setQuantityDetails(BenzQuantityDetails);



        System.out.println("-------------dealers_Info------------");

        DealerDetails dealerDetails1 = new DealerDetails();
        dealerDetails1.setName("krishna Honda");
        dealerDetails1.setAddress("AmeerPet");
        dealerDetails1.setNumber("7829838330");
        dealerDetails1.setCarsList(Arrays.asList(cars1Details,cars2Details, cars3Details));



        DealerDetails dealerDetails2 = new DealerDetails();
        dealerDetails2.setName("laxmi ShiftDesire");
        dealerDetails2.setAddress("SR Nagar");
        dealerDetails2.setNumber("8739283738");
        dealerDetails2.setCarsList(Arrays.asList(cars1Details,cars2Details));

        DealerDetails dealerDetails3 = new DealerDetails();
        dealerDetails3.setName(" John motor Benz");
        dealerDetails3.setAddress("SR Nagar");
        dealerDetails3.setNumber("8739283738");
        dealerDetails3.setCarsList(Arrays.asList(cars1Details));

        List<DealerDetails> dealers = new ArrayList<>();
        dealers.add(dealerDetails1);
        dealers.add(dealerDetails2);
        dealers.add(dealerDetails3);

        for(DealerDetails dealer: dealers){
            System.out.println("Dealer Name:"+dealer.getName()+","+"Location:"+dealer.getAddress()+","+"PhoneNumber"+dealer.getNumber());
            for (CarsDetails cars: dealer.getCarsList()){
                System.out.println("Car Name:"+cars.getCarName()+","+"Car Price:"+cars.getPrice()+","+"Cars In Stock:"+cars.getQuantityDetails().getQuantity());


            }
        }


    }
}

