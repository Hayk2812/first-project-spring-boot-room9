package com.digi.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String name;
    private String surname;
    private int year;
    private String email;
    private String password;

    @Override
    public String toString() {
        return name + " " + surname + " " + year + " " + email + " " + password;
    }
}
