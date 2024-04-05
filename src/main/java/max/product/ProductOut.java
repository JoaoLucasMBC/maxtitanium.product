package max.product;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ProductOut (
    String id,
    String name,
    Double price,
    String description,
    String category,
    String brand,
    Integer stock
) {
    
}
