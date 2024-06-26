package com.pie.kart.cart.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pie.kart.cart.Model.CartItem;

import jakarta.transaction.Transactional;

@Repository
public interface  CartRepository extends JpaRepository<CartItem, Long>  {

    public CartItem findByTitle(String title);

    @Transactional
    public void deleteByProductId(Long productId);
    
}

