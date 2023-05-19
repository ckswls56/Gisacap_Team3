package com.example.team3.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GptOutput {
    @Id
    @Column
    private Long outputId;

    @Column
    private Long inputId;

    @Column
    private Long diease_id;

    @Column
    private boolean gptValid;

    @Column
    private String care;

    @Column
    private String prevent;

}
