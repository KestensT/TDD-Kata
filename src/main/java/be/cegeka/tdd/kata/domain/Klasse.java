package be.cegeka.tdd.kata.domain;

import javax.persistence.*;

    @Entity
    @Table(name = "CUSTOMERS")
    public class Klasse {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CUSTOMER_ID")
        private int id;
        @Column(name = "NAME")
        private String name;
        @Column(name = "LAST_NAME")
        private String lastName;

        public Klasse(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }
