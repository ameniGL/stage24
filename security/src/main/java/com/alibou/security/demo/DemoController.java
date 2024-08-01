package com.alibou.security.demo;

import com.alibou.security.Product.ProductService;
import com.alibou.security.user.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

  private final ProductService productService;

  @Value("${excel.file.path}") // Use an application property to specify the file path
  private String excelFilePath;

  public DemoController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public ResponseEntity<List<Product>> getProducts() {
    List<Product> products = productService.readExcelFile(excelFilePath);
    return ResponseEntity.ok(products);
  }
}
