package com.example.team3.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class History {
    @Id
    @Column
    private Long histroyId;

    @Column
    private String officerId;

    @Column
    private Long outputId;

    @Column
    private Long diseaseId;

    @Column
    private String care;

    @Column
    private String prevent;

    @Column
    private LocalDateTime createDate;
}
