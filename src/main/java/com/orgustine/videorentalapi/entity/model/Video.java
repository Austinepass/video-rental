package com.orgustine.videorentalapi.entity.model;

import com.orgustine.videorentalapi.entity.enums.Genre;
import com.orgustine.videorentalapi.entity.enums.Type;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import static com.orgustine.videorentalapi.entity.enums.Type.*;

@Getter
@Setter
public class Video extends BaseModel {

    @Column(name = "title")
    private String title;

    @Column(name = "video_type")
    @Enumerated(EnumType.STRING)
    private Type videoType;

    @Column(name = "video_genre")
    @Enumerated(EnumType.STRING)
    private Genre videoGenre;

    @Column(name = "price")
    private Double price;

  //  private Integer days;

    @Column(name = "year_released")
    private Integer yearReleased;

    @Column(name = "max_age")
    private Integer maxAge;

    public Video(String title, Type videoType, Genre videoGenre) {
        this.title = title;
        this.videoType = videoType;
        this.videoGenre = videoGenre;
    }

    public Integer getMaxAge() {
        if (videoType == CHILDREN) {
            return maxAge;
        }
        return null;
    }

    public Integer getYearReleased() {
        if (videoType == NEW_RELEASE) {
            return yearReleased;
        }
        return null;
    }

    //
//    public Double getPrice() {
//        switch (videoType) {
//            case NEW_RELEASE:
//                price = videoType.getRate() * days - yearReleased;
//                break;
//            case CHILDREN:
//                price = videoType.getRate() * days + maxAge / 2;
//                break;
//            default:
//                price = videoType.getRate() * days;
//                break;
//        }
//        return price;
//    }

}
