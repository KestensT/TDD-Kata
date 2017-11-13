package be.cegeka.tdd.kata.domain;

import org.junit.Before;
import org.junit.Test;

import static be.cegeka.tdd.kata.domain.CandyTestBuilder.aCandy;
import static org.assertj.core.api.Assertions.assertThat;

public class CandyTest {

    private Candy candy;

    @Before
    public void setUp() throws Exception {
        candy = aCandy()
                .withName("name")
                .withPrice(5)
                .withWeight(50)
                .withId(1)
                .build();
    }

    @Test
    public void asAUser_getName_shouldReturnName() throws Exception {
        assertThat(candy.getName()).isEqualTo("name");
    }

    @Test
    public void asAUser_getPrice_shouldReturnPrice() throws Exception {
        assertThat(candy.getPrice()).isEqualTo(5);
    }

    @Test
    public void asUser_getWeight_shouldReturnWeight() throws Exception {
        assertThat(candy.getWeight()).isEqualTo(50);
    }

    @Test
    public void asUser_IcanCreateBagOfCandy_containingPiecesOfCandy() throws Exception {
        BagOfCandy bagOfCandy = new BagOfCandy();
        assertThat(bagOfCandy.addCandyToBag(candy).contains(candy));
    }

    @Test
    public void asUser_getTotalPrice_shouldReturnBagOfCandyPrice() throws Exception {
        BagOfCandy bagOfCandy = new BagOfCandy();
        bagOfCandy.addCandyToBag(candy);
        bagOfCandy.addCandyToBag(candy);
        assertThat(bagOfCandy.getTotalPrice()).isEqualTo(10);
    }

    @Test
    public void asUser_getTotalWeight_shouldReturnBagWeight() throws Exception {
        BagOfCandy bagOfCandy = new BagOfCandy();
        bagOfCandy.addCandyToBag(candy);
        bagOfCandy.addCandyToBag(candy);
        bagOfCandy.addCandyToBag(candy);
        assertThat(bagOfCandy.getTotalWeight()).isEqualTo(150);
    }

    @Test
    public void asUser_getTotalCandyAmount_shouldReturnTotalAmountOfCandy() throws Exception {
        BagOfCandy bagOfCandy = new BagOfCandy();
        bagOfCandy.addCandyToBag(candy);
        bagOfCandy.addCandyToBag(candy);
        bagOfCandy.addCandyToBag(candy);
        bagOfCandy.addCandyToBag(candy);
        assertThat(bagOfCandy.getTotalAmountOfCandy()).isEqualTo(4);
    }


}