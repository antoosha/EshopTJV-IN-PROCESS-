package korolov.project.business;

import korolov.project.domain.Client;
import korolov.project.domain.Order;

import java.util.Collection;
import java.util.Optional;

public class OrderService extends AbstractCrudService<Client, Order>{
    @Override
    public void create(Order entity) throws EntityStateException {

    }

    @Override
    public Optional<Order> readById(Client id) {
        return Optional.empty();
    }

    @Override
    public Collection<Order> readAll() {
        return null;
    }

    @Override
    public void update(Order entity) throws EntityStateException {

    }

    @Override
    public void deleteById(Client id) {

    }
    //TODO business logic
}
