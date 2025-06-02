package com.example.passwordgenerator.dto;

public class PasswordGenerationRequest {
    private int length;
    private int complexity;
    private String owner;

    public PasswordGenerationRequest(int length, int complexity, String owner) {
        this.length = length;
        this.complexity = complexity;
        this.owner = owner;
    }

    // Геттеры
    public int getLength() { return length; }
    public int getComplexity() { return complexity; }
    public String getOwner() { return owner; }
}