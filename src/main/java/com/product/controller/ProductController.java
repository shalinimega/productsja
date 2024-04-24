package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.exception.IdNotFoundException;
import com.product.exception.TypeNotFoundException;
import com.product.service.ProductService;

//single value stored
@RestController
@RequestMapping("/admin")
public class ProductController {
      @Autowired
      ProductService ps;
      @PostMapping(path="/data")
      public String datapost(@RequestBody Product pp)
      {
    	  return ps.datapost(pp);
      }
      
      
 //Listvaluestored
      @PostMapping(path="/dataList") 
      public String datalistpost(@RequestBody List<Product> aa)throws TypeNotFoundException
      {
    	  return ps.datalistpost(aa);
      }
      
      
      
 //single data show
      @GetMapping(path="/getdata/{a}")
      public Product dataget(@PathVariable int a)
      {
    	  return ps.dataget(a);
      }
      
      
      
 //listof data
      @GetMapping(path="/list")
      public List<Product> datalistget()
      {
  		String url1="http://localhost:8080/admin/list";
    	return ps.datlistget();
      }
      
      
  //all update
      @PutMapping(path="/gstupdate")
      public String gstupdate(@RequestBody Product gg)
      {
    	  return ps.gstupdate(gg);
    	  
      }
      
   //idException type not found exception
      @GetMapping(path="/idexception/{aa}")
      public Product idexception(@PathVariable int aa)throws IdNotFoundException
      {
    	  return ps.idexception(aa);
      }
      
      
      
      //Typenot found exception
      
      
      /*@GetMapping(path="/typeexception/{t}")
      Public String typeexception(@RequestBody product t)throws TypeNotFoundException
      {
    	  return ps.typeexception(t);
      }*/
  
     //cusomequery max
      @GetMapping(path="/maxprice")
      public Product maxprice()
      {
    	  return ps.maxprice();
      }
      // min price
      @GetMapping(path="/minprice")

      public Product minprice()
      {
    	  return ps.minprice();
      }
      
      //product hsn
      @GetMapping(path="/hsnnum/{a}")
      public Product number(@PathVariable int a)
      {
    	  return ps.number(a);
      }
      //service class
      @PostMapping(path="/type/{a}")
  	  public List<Product> gettype(@PathVariable String a)
  	  {
  		return ps.gettype(a);
  	   }
      //service class 
      @PostMapping(path="/type1/{a}/{b}")

      public List<Product> gettype2(@PathVariable String a,@PathVariable int b)
  	  {
  		return ps.gettype2(a,b);
  	   }
           
}
