package com.uncledavecode.orders_service.Controller;

import com.uncledavecode.orders_service.model.Dtos.OrderRequest;
import com.uncledavecode.orders_service.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest ) {
        this.orderService.placeOrder(orderRequest);

        return "Order placed successfully";
    }

}
