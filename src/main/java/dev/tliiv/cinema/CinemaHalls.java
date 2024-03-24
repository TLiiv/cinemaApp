package dev.tliiv.cinema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection ="cinema-halls")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaHalls {
    @Id
    private ObjectId hallId;
    private String hallName;
    private List<Map<String, Object>> seats;
    private List<Object> showTimes;
}

