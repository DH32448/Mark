package com.example.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Mark {
    private int id;
    private String sno;
    private String cno;
    private BigDecimal score;
    private Date tpost;
    private int tid;

}
