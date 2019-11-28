package com.shop.services;

import com.shop.domain.Product;
import com.shop.domain.ProductCompany;
import com.shop.repository.ProductCompanyRepository;
import com.shop.repository.ProductRepository;
import com.shop.utils.ProductRenderer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    ProductCompanyRepository productCompanyRepository;
    
    @Autowired
    ProductRepository productRepository; 
    
    @Override
    public boolean saveCompany(String cname, String type) throws Exception{
        
        ProductCompany company = new ProductCompany();
        company.setName(cname);
        company.setType(type);
        company.setBillingType("N/A");
       company = productCompanyRepository.save(company);
        if(company.getId() != null)
        return true;
                else 
            return false;
    }

    @Override
    public List<ProductCompany> getAllCompany() throws Exception {
        return productCompanyRepository.findAll();
    }

    @Override
    public List<Product> getComboProducts(ProductCompany company) throws Exception {
        return productRepository.findByProductCompanyId(company);
    }

}
