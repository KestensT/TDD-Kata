package be.cegeka.tdd.kata.domain;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.function.Supplier;

public class SupplierTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private OrderService orderService;

    @Mock
    private Supplier supplier;

    @Test
    public void orderCandyBags_shouldReturnBagsFromSupplier() throws Exception {
//        when(supplier.orderCandyBags(5)).thenReturn(Arrays.asList());
    }


}