package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import com.product.exception.IdNotFoundException;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;
	public String datapost(Product pa)
	{
		pr.save(pa);
		return "sucessfully saved";
	}
	
	
	//listdata
	public String datalistpost(List<Product> bb)
	{
		pr.saveAll(bb);
		return "Listof Data sucessful stored";
	}
	
	
	//single data getting
	public Product dataget(int bc)
	{
		return pr.findById(bc).get();
	}
	
	
	//List value
	public List<Product> datlistget()
	{
		return pr.findAll();
	}
	
	
	
	
	
	
	
	//update value
	public String gstupdate(Product g1)
	{
		return "update sucessfuly";
	}
	//Exception
	public Product idexception(int a)throws IdNotFoundException
	{
		return pr.findById(a).orElseThrow(()->new IdNotFoundException("invalid id"));
	}
    //maxprice
	public Product maxprice()
	{
		return pr.maxprice();
	}
	public Product minprice()
	{
		return pr.minprice();
	}
	public Product number(int a)
	{
		return pr.number(a);
	}
	//
	public String detailspost(List<Product> a)
	{
		pr.saveAll(a);
		return "sucessful";
	}
	
	

	


}
