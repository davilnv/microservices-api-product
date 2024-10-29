package br.com.texsistemas.product.dto;

public record ProductRequest(
        String id,
        String name,
        String description,
        Double price
) {
}
