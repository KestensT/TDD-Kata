package be.cegeka.tdd.kata.domain;

import java.util.ArrayList;
import java.util.List;

public class BagOfCandy {
    private static int amountOfCandy;
    private static double totalPrice;
    private static double totalWeight;

public ArrayList<Candy> bagOfCandy = new ArrayList<>();

public List addCandyToBag(Candy candy){
    bagOfCandy.add(candy);
    return bagOfCandy;
}

    public double getTotalPrice() {
        for (int i = 0; i < bagOfCandy.size(); i++) {
            totalPrice = totalPrice + bagOfCandy.get(i).getPrice();

        }
    return totalPrice;
    }

    public double getTotalWeight() {
        for (int i = 0; i < bagOfCandy.size(); i++) {
            totalWeight = totalWeight + bagOfCandy.get(i).getWeight();

        }
    return totalWeight;
    }

    public int getTotalAmountOfCandy() {
        for (int i = 0; i < bagOfCandy.size(); i++) {
            amountOfCandy++;

        }
    return amountOfCandy;
    }
}
