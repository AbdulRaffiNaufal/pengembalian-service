/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.pengembalian.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author IIISI
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pengembalian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pengembalianId;
    private Long peminjamanId;
    private String tglDiKembalikan;
    private int terlambat;
    private double denda;
}
