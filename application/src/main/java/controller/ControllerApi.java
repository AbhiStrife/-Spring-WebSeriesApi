package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Series;
import repo.SeriesRepo;

@RestController
public class ControllerApi {
    
    @Autowired
    SeriesRepo seriesRepo;


    @GetMapping("/series")
    public List<Series> allSeries(){
        return seriesRepo.findAll();
    }

    @GetMapping("/series/id/{id}")
    public Series seriesById(@PathVariable Long id){
        return seriesRepo.findById(id).orElseThrow();
    }

    @GetMapping("/series/name/{name}")
    public Series seriesByName(@PathVariable String name){
        return seriesRepo.findByNameSeries(name);
    }

    @PostMapping("/addSeries")
    public Series addSeries(@RequestBody Series seriesDetails){
        return seriesRepo.save(seriesDetails);
    }

    @PutMapping("/update")
    public Series updateSeries(@RequestBody Series seriesDetails){
        return seriesRepo.save(seriesDetails);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSeries(@PathVariable Long id){
        seriesRepo.deleteById(id);
        return "Series Removed! "+id;
    }
    
}
