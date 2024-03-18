package com.davidsolli.desafio.services;

import com.davidsolli.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (Order order) {

        double valorDesconto = order.getBasic() - (order.getBasic() * order.getDiscount());

        if (valorDesconto < 100)
            return 20.00;
        if (valorDesconto <= 200)
            return 12.00;

        return 0.00;
    }
}
