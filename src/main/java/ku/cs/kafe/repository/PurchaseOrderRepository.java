package ku.cs.kafe.repository;


import ku.cs.kafe.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

//6410406843 Rachata Kaewviset
@Repository
public interface PurchaseOrderRepository
        extends JpaRepository<PurchaseOrder, UUID> {
}
