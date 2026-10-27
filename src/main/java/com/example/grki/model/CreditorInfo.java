package com.example.grki.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditorInfo {
    private String type;
    private String code;
    private String office;
}
