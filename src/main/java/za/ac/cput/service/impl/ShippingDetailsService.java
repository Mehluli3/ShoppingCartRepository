package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.repository.IShippingDetailsRepository;
import za.ac.cput.service.IShippingDetailsService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ShippingDetailsService implements IShippingDetailsService {

    @Autowired
    private IShippingDetailsRepository shippingRepository =null;

//    @Autowired
//    private static ShippingDetailsService shippingService = null;
//
//    public static ShippingDetailsService getShippingService() {
//        if (shippingService == null)
//            shippingService = new ShippingDetailsService();
//        return shippingService;
//    }


    @Override
    public ShippingDetails create(ShippingDetails shippingDetails) {
        return this.shippingRepository.save(shippingDetails);
    }

    @Override
    public ShippingDetails read(String s) {
        return this.shippingRepository.findById(s).orElse(null);
    }

    // Requires attention
    @Override
    public ShippingDetails update(ShippingDetails shippingDetails) {
        return this.shippingRepository.save(shippingDetails);
    }

    @Override
    public boolean delete(String s) {
        shippingRepository.deleteById(s);
        return !shippingRepository.existsById(s);
    }

    @Override
    public Set<ShippingDetails> getAll() {
        return this.shippingRepository.findAll().stream().collect(Collectors.toSet());    }

}
