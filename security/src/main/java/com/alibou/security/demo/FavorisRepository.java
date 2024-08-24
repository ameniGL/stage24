package com.alibou.security.demo;

import com.alibou.security.user.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FavorisRepository extends JpaRepository<Favoris , Long> {
    List<Favoris> findByUserId(Long userId);
    Optional<Favoris> findByUserIdAndProductId(Long userId, Long productId);

}
