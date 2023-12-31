package com.example.springdatabasicdemo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StorageDto {
    private int id;
    private String name;
    private int capacity;
    private String type;
    private String address;
    private int employees;
    private int space;
    private int car;
    private int mechanization;

    @Override
    public String toString() {
        return "Storage { id=" + id + ", name=" + name + ", capacity=" + capacity + ", type=" + type +
                ", address=" + address + ", employees=" + employees + ", space" + space + ", car=" + car + ", mechanization=" + mechanization +" }";
    }
}
