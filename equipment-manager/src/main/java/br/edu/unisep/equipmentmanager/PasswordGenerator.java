package br.edu.unisep.equipmentmanager;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        var encryptor = new BCryptPasswordEncoder();
        System.out.print(encryptor.encode("admin"));
    }
}
