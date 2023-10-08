package com.minhnhat.uploadimage.repository;

import com.minhnhat.uploadimage.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long>{
}
