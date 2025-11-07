package co.edu.uniquindio.poo.quindiofresh.utils.Mappers;

import co.edu.uniquindio.poo.quindiofresh.model.Producto;
import co.edu.uniquindio.poo.quindiofresh.model.DTO.ProductoDTO;

public class ProductoMapper {

    public static ProductoDTO toDTO(Producto producto) {
        if (producto == null) return null;
        return new ProductoDTO(
                producto.getSku(),
                producto.getNombre(),
                producto.getPrecio()
        );
    }

    public static Producto toEntity(ProductoDTO dto) {
        if (dto == null) return null;
        return new Producto(
                dto.getSku(),
                dto.getNombre(),
                dto.getPrecio()
        );
    }

    public static void updateEntityFromDTO(Producto entity, ProductoDTO dto) {
        if (entity == null || dto == null) return;
        entity.setNombre(dto.getNombre());
        entity.setPrecio(dto.getPrecio());
    }
}