package com.magmik.consuming_rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Quote {
    private String type;
    private Value value;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Getter
    @Setter
    @NoArgsConstructor
    @ToString

//    @JsonRootName(value = "value", namespace = "value")//doesnt work add properties
    public class Value {
        private Long id;
        private String quote;

    }
}


