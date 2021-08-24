package com.orgustine.videorentalapi.controller;

import com.orgustine.videorentalapi.entity.model.User;
import com.orgustine.videorentalapi.entity.model.Video;
import com.orgustine.videorentalapi.entity.requestbody.PriceRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.orgustine.videorentalapi.entity.enums.Genre.*;
import static com.orgustine.videorentalapi.entity.enums.Type.*;

@RestController
@RequestMapping("api/v1/videos")
public class VideoController {

    List<Video> videos = Arrays.asList(
            new Video("Die Hard", REGULAR, COMEDY),
            new Video("Taken", NEW_RELEASE, DRAMA),
            new Video("Harvest", NEW_RELEASE, ROMANCE),
            new Video("Viper Zipper", CHILDREN, ACTION),
            new Video("Mr Rice", REGULAR, HORROR)
    );

    @GetMapping("/all")
    List<Video> getAllVideos() {
        return videos;
    }
    @GetMapping("/{id}")
    ResponseEntity<Object> getVideo(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(videos.toArray()[id]);
    }

    @GetMapping("/price")
    String videoPrice(Long id ) {
        //find the video with the id and calculate the price
        User user = new User();
        return "price";
    }

}
