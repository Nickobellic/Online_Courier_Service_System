package com.example.test.ocss.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.test.ocss.model.Seller;

import java.util.List;
import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    

    @Query(nativeQuery = true, value="SELECT * FROM sellers")
    Optional<Seller> getAllSellers();
}
