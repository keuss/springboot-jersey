package com.example.demo.controllers;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthResponse implements Serializable {
    private boolean isAuthenticate = false;
}