package com.example.demo_mvc.repository;
//import org.springframework.Data.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo_mvc.models.Produit;
public interface ProduitRepository extends JpaRepository <Produit, Long>{
    
}