package com.digi.model;

import com.digi.enams.Status;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String surname;
    private int year;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "verification_code")
    private String verificationCode;
    @Column(name = "reset_token")
    private String resetToken;


    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + year + " " + email + " " + password + " " + status + " " + verificationCode + " " + resetToken;
    }
}
