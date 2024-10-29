package br.com.texsistemas.product.dto;

public record ProductResponse(
        String id,
        String name,
        String description,
        Double price
) {
}
