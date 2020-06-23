package com.project.controller;

import com.project.Status;
import com.project.StatusRepository;
import com.project.dto.StatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BasicController {

    String myData = "omfg fomg";

    @Autowired
    StatusRepository statusRepository;

    @GetMapping(value = "/statuses/{statusId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StatusDTO> statuses(@PathVariable Integer statusId) {
        Optional<Status> myStatus = statusRepository.findById(statusId);

        if(!myStatus.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        Status statusFromOptional = myStatus.get();

        StatusDTO dto = new StatusDTO(
                statusFromOptional.getIdDeStatus(), statusFromOptional.getNumeDeStatus());

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/printStatus",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void printStatusMethod(@RequestBody StatusDTO statusDTO){
        System.out.println(statusDTO);
    }

    @PostMapping("/createHere")
    public void methodToRecieveData(@RequestBody String dataFromRequest){
        System.out.println("we got this data: "+  dataFromRequest);
    }

    @GetMapping("/someData")
    public ResponseEntity<String> someData(){
        String ourData = "some data from the controller";

        return new ResponseEntity<>(myData + ourData, HttpStatus.I_AM_A_TEAPOT);
    }

    @GetMapping("/someData2")
    public ResponseEntity<String> someData2(){
        String ourData = "this is another data";

        return new ResponseEntity<>(myData + ourData, HttpStatus.BAD_GATEWAY);
    }


}
