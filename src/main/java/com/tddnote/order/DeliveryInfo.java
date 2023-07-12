package com.tddnote.order;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DeliveryInfo {

    private String address;
    private String phone;

}