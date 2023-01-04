/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.pengembalian.controller;

import com.naufal.pengembalian.VO.ResponseTemplateVO;
import com.naufal.pengembalian.entity.Pengembalian;
import com.naufal.pengembalian.service.PengembalianService;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author IIISI
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {
    
    @Autowired
    private PengembalianService pengembalianService;

    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian) {
        try {
            System.err.println(pengembalian);
            return pengembalianService.savePengembalian(pengembalian);
        } catch (ParseException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @GetMapping("/{id}")
    public ResponseTemplateVO getPengembalian(@PathVariable("id") Long pengembalianId){
        return pengembalianService.getPengembalian(pengembalianId);
    }
    @GetMapping("/")
    public List<Pengembalian> getAllPengembalian(){
        return pengembalianService.getAllPengembalian();
    }
    
    @PutMapping("/")
    public Pengembalian updatePengembalian(@RequestBody Pengembalian pengembalian){
        return pengembalianService.updatePengembalian(pengembalian);
    }
    
    @DeleteMapping("/{id}")
    public void deletePengembalian(@PathVariable("id") Long pengembalianId){
        pengembalianService.deletePengembalian(pengembalianId);
    }
}
