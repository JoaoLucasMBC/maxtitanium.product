package max.product;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "max-product")
public interface ProductController {
    
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductOut> read(@PathVariable(required = true) String id);

    @PostMapping("/products")
    public ResponseEntity<ProductOut> create(@RequestBody(required = true) ProductIn productIn);

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductOut> update(@PathVariable(required = true) String id, @RequestBody(required = true) ProductIn productIn);

    @DeleteMapping("/products/{id}")
    public ResponseEntity<ProductOut> delete(@PathVariable(required = true) String id);

    @GetMapping("/products")
    public ResponseEntity<List<ProductOut>> list(
        @RequestParam(required = false) Double min_price, 
        @RequestParam(required = false) Double max_price
    );

    @PostMapping("/products/consume")
    public ResponseEntity<ProductOut> consume(@RequestBody(required = true) StockIn stockIn);

    @PostMapping("/products/replenish")
    public ResponseEntity<ProductOut> replenish(@RequestBody(required = true) StockIn stockIn);
}
