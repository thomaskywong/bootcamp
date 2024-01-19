package com.vtxlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString (callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder // required @SuperBuilder if the class is being inherited by child class(es)
// @Builder for class without extends or being extended 

public class Staff extends Person {

    private int id;
  
}
