package acc.inzynierka.modelsDTO;

import acc.inzynierka.models.TestQuestion;
import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the {@link TestQuestion} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TestQuestionDto implements Serializable {
    private Long id;
    private String question;
    private String answer;
    private String imageUrl;
    private String imageName;
}