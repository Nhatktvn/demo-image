package com.minhnhat.uploadimage.service;

import com.minhnhat.uploadimage.entity.Image;

public interface ImageService {
    Image saveImage(Image image);
    Image getImage(Long id);
}
