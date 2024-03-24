package com.kevocodes.pnccontrollers.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String ISBN;
    private String title;
}
