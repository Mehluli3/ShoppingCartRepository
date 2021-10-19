////package za.ac.cput.repository.impl;
///**
// * ShippingDetailsFactory.java
// * Shipping Details Factory
// * Author: Aderito Zacarias (215278739)
// **/

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import za.ac.cput.entity.ShippingDetails;
//import za.ac.cput.factory.ShippingDetailsFactory;
//
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ShippingDetailsRepositoryTest {
//
//    static ShippingDetailsRepository repository;
//    static ShippingDetails shippingDetailsByRoad, shippingDetailsByAir, shippingDetailsBySea;
//    Set<ShippingDetails> copyRepository;
//
//    @BeforeAll
//    static void beforeAll() {
//        repository = ShippingDetailsRepository.getRepository();
//
//        shippingDetailsByRoad = ShippingDetailsFactory.getShippingDetails("Road", 200);
//        shippingDetailsByAir = ShippingDetailsFactory.getShippingDetails("Air", 400);
//        shippingDetailsBySea = ShippingDetailsFactory.getShippingDetails("Sea", 250);
//
//        assertNotNull(shippingDetailsByAir);
//        assertNotNull(shippingDetailsByRoad);
//        assertNotNull(shippingDetailsBySea);
//
//    }
//
//    @Test
//    void getRepository() {
//        assertNotNull(repository);
//        assertEquals(repository, ShippingDetailsRepository.getRepository());
//        System.out.println(repository);
//    }
//
//    @Test
//    void create() {
//
//        System.out.println("-- CREATE --");
//
//        repository.create(shippingDetailsByAir);
//        repository.create(shippingDetailsByRoad);
//        repository.create(shippingDetailsBySea);
//        copyRepository = repository.getAll();
//
//        assertFalse(copyRepository.isEmpty());
//        assertNotEquals(shippingDetailsByAir, shippingDetailsByRoad);
//        assertNotEquals(shippingDetailsByAir, shippingDetailsBySea);
//        assertNotEquals(shippingDetailsByAir.getShippingId(), shippingDetailsByRoad.getShippingId());
//
//        System.out.println("Objects added");
//    }
//
//    @Test
//    void read() {
//        System.out.println("-- READ --");
//        ShippingDetails shippingDetailsTest = repository.read(shippingDetailsByAir.getShippingId());
//        ShippingDetails shippingDetailsTest2 = repository.read(shippingDetailsByRoad.getShippingId());
//
//        assertEquals(shippingDetailsByAir, shippingDetailsTest);
//        assertEquals(shippingDetailsTest2, shippingDetailsByRoad);
//        assertEquals(shippingDetailsTest.getShippingId(), shippingDetailsByAir.getShippingId());
//        assertEquals(shippingDetailsTest.getShippingCost(), shippingDetailsByAir.getShippingCost());
//        assertNotEquals(shippingDetailsTest.getShippingId(), shippingDetailsTest2.getShippingId());
//        assertNotEquals(shippingDetailsTest, shippingDetailsTest2);
//
//        System.out.println(shippingDetailsTest+ "\n" + shippingDetailsTest2);
//
//    }
//
//    @Test
//    void update() {
//        System.out.println("-- UPDATE --");
//        System.out.println(shippingDetailsBySea.getShippingId());
//        repository.update(shippingDetailsBySea, "river", 300);
//        System.out.println(repository.getAll());
//
//    }
//
//    @Test
//    void delete() {
////        create();
//        System.out.println("-- DELETE --");
//        boolean deleted = repository.delete(shippingDetailsBySea.getShippingId());
//
//        boolean secDeleted = repository.delete(shippingDetailsBySea.getShippingId());
//
//        assertTrue(deleted);
//
//        // file  already removed
//        assertFalse(secDeleted);
//
//        if (deleted)
//            System.out.println("Shipping removed");
//        else
//            System.out.println("Shipping not found");
//    }
//
//
//    @Test
//    void getAll() {
//        System.out.println("-- GET ALL --");
//        assertNotNull(repository.getAll());
//
//        System.out.println(copyRepository.size());
//    }
//}