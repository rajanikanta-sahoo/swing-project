package com.shop.services;

import com.shop.domain.Product;
import com.shop.domain.ProductCompany;
import java.util.List;

public interface PurchaseService {

    public boolean saveCompany(String cname, String type) throws Exception;
    
    public List<ProductCompany> getAllCompany() throws Exception;
    
    public List<Product> getComboProducts(ProductCompany company) throws Exception;
    
    public boolean saveProduct(ProductCompany com,String prod,String size, float mrp) throws Exception;
    
}
