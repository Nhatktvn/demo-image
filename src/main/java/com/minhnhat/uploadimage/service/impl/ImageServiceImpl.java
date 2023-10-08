package com.minhnhat.uploadimage.service.impl;

import com.minhnhat.uploadimage.entity.Image;
import com.minhnhat.uploadimage.repository.ImageRepository;
import com.minhnhat.uploadimage.service.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image getImage(Long id) {
        return imageRepository.findById(id).get();
    }
}
