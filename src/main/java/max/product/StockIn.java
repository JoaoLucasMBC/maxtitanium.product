package max.product;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record StockIn(
    String id,
    Integer quantity
) {
    
}
