package devops.java.runnerz.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startDate,
        LocalDateTime endDate,
        @Positive
        Integer miles,
        Location location
){
    public Run{
        if(!endDate.isAfter(startDate)){
            throw new IllegalArgumentException("End date must be after start date");
        }
    }
}
