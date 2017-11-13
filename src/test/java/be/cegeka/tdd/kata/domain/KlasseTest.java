package be.cegeka.tdd.kata.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KlasseTest{

        private Klasse customer;

        @Before
        public void setUp() throws Exception {
            customer = new Klasse ("Ralphie", "VanCampenHoudt");
        }

        @Test
        public void getName_shouldReturnName() throws Exception {
            assertThat(customer.getName()).isEqualTo("Ralphie");
        }
}