/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.pengembalian.VO;

import com.naufal.pengembalian.entity.Pengembalian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author IIISI
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Pengembalian pengembalian;
    private Peminjaman peminjaman;
}
