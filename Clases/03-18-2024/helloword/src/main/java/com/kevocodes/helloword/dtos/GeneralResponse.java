package com.kevocodes.helloword.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralResponse {
    private String message;
    private Object data;
}
