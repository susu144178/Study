package com.example.demo.controller;


import com.example.demo.dto.ProductDto;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


//@RequiredArgsConstructor
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("addProduct")
    public String addProduct()
    {
        return "addProduct";
    }

    @PostMapping("addProduct")
    public String addImage(MultipartFile file) throws Exception
    {
        productService.save(file);
        return "redirect:/";
    }
}
