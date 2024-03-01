package com.bootcamp.practise;

import java.time.LocalDate;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor

public class Person 
{
    @NonNull
    private String firstName;

    @NonNull
    private String lastName;
    
    private final LocalDate birthday;

}
