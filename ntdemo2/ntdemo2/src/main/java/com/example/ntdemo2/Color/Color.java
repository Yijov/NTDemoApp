package com.example.ntdemo2.Color;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Color {

    @Id

    private Long id;
    @Column
    private String name;
}
