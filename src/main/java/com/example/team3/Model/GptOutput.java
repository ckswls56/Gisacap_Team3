package com.example.team3.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
