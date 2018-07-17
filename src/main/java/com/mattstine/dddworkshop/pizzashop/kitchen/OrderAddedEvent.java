package com.mattstine.dddworkshop.pizzashop.kitchen;

import com.mattstine.dddworkshop.pizzashop.infrastructure.repository.ports.RepositoryAddEvent;
import lombok.Value;

@Value
final class OrderAddedEvent implements RepositoryAddEvent {
    KitchenOrderRef ref;
    Order.OrderState state;
}
