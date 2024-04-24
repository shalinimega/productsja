package com.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entity.Product;
import com.product.exception.IdNotFoundException;
import com.product.exception.TypeNotFoundException;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;
	
	ProductRepository pr;
	public String datapost(Product pe)
	{
       return pd.datapost(pe);
	}
	
	
	//listdata
	/*public String datalistpost(List<Product> de)
	{
		return pd.datalistpost(de);
	}*/
	
	
	//single data get
	public Product dataget(int bb)
	{
		return pd.dataget(bb);
	}
	
	
	//list value geeting
	public List<Product> datlistget()
	{
		return pd.datlistget();
	}
	
	
	
	
	
	//update  value
	public String gstupdate(Product g)
	{
		return pd.gstupdate(g);
	}
	//Exception
	

	public Product idexception(int a)throws IdNotFoundException
	{
		return pd.idexception(a);
	}
	//typenot exception
	/*public String typeexception(Product ee)throws TypeNotFoundException
	{
		if(typeexception.size()>0) {
			return typeexception;
		}
		else {
			throw new TypeNotFoundException("not prorery value");
		}
		
	}*/
	
	//maxprice
	public Product maxprice()
	{
		return pd.maxprice();
	}
	public Product minprice()
	{
		return pd.minprice();
	}
	public Product number(int a)
	{
		return pd.number(a);
	}
	
	//service
	
	public List<Product> gettype(String x)
	{
		List<Product> ma=datlistget().stream().filter(y->y.getType().equals(x)).collect(Collectors.toList());
		return ma;
	}
	
	// service2
	public List<Product> gettype2(String x,int a)
	{
		List<Product> ma=datlistget().stream().filter(y->y.getName().equals(x)&& y.getYear()==a).collect(Collectors.toList());
		return ma;
	}
   // List of data
	public String  datalistpost(List<Product> aa)throws TypeNotFoundException
	{ 
		List<Product> a=aa.stream().filter(x->!x.getType().equals("vehicle")&& !x.getType().equals("cosmetic")).collect(Collectors.toList());
		if(a.isEmpty())
	    {
		      throw new TypeNotFoundException("not valid error");      

	    }
		else
		{
			   
		     return 	pd.datalistpost(aa);
		}
	
		
	}
	/*public String datlistget(List<Product> aa)
	{
		List<Product> a;
		for(Product a1:aa)
		if(a1.getType().equals("vechicle")|| a1.getType().equals("costemtic"))
		{
			throw new TypeNotException("not valid");
		}
		else
			
	}*/

	
	
	
}
