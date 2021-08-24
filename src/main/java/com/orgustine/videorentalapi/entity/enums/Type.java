package com.orgustine.videorentalapi.entity.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Type {
    REGULAR(8.0),
    CHILDREN(10.0),
    NEW_RELEASE(18.0);
    private Double rate;

    Type(Double rate) {
        this.rate = rate;
    }

}
