package ku.cs.kafe.repository;


import ku.cs.kafe.entity.OrderItem;
import ku.cs.kafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//6410406843 Rachata Kaewviset

@Repository
public interface OrderItemRepository
        extends JpaRepository<OrderItem, OrderItemKey> {
}
