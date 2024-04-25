package com.example.Springcrud.controller;


import com.example.Springcrud.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")

public class CloudVendorAPIService {


    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
 public CloudVendor getCloudVendorDetails(String vendorId){

     return cloudVendor;

 }

@PostMapping
 public String createVendorDetails(@RequestBody CloudVendor cloudVendor){
     this.cloudVendor=cloudVendor;

     return "Cloud Vendor Created sucessfully";


 }



    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;

        return "Cloud Vendor Updated sucessfully";

    }


    @DeleteMapping("{vendorId}")
    public String deleteClVendorDetails(String vendorId){
        this.cloudVendor=null;

        return "Cloud Vendor Deleted sucessfully";

    }





}
