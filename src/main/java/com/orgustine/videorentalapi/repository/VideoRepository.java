package com.orgustine.videorentalapi.repository;

import com.orgustine.videorentalapi.entity.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface VideoRepository extends JpaRepository<Video, UUID> {
}
