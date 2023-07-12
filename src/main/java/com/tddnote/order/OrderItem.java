package com.tddnote.order;

import lombok.*;

import javax.persistence.*;

@Embeddable
@Access(AccessType.FIELD)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderItem {

    private String product;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="value", column = @Column(name="price"))
    })
    private Money price;
}
