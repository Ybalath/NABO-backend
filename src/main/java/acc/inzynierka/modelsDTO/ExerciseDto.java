package acc.inzynierka.modelsDTO;

import acc.inzynierka.models.Exercise;
import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the {@link Exercise} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExerciseDto implements Serializable {
    private Long id;
    private String question;
    private String expression;
    private String bad_answer1;
    private String bad_answer2;
    private String bad_answer3;
    private String imageUrl;
    private String imageName;
}