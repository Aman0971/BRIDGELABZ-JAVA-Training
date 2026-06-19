package org.Hotel_Management.io;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.Hotel_Management.model.Reservation;

import java.io.File;
import java.util.List;
import java.util.Set;

public class JsonHandler {

    private static final ObjectMapper mapper = new ObjectMapper();

    // JSON Schema Validation
    public static boolean validateJsonSchema(String jsonPath, String schemaPath) {

        try {

            JsonNode jsonNode = mapper.readTree(new File(jsonPath));

            JsonNode schemaNode = mapper.readTree(new File(schemaPath));

            JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);

            JsonSchema schema = factory.getSchema(schemaNode);

            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {

                System.out.println("JSON Schema Validation Passed");

                return true;
            }

            System.out.println("JSON Schema Validation Failed");

            for (ValidationMessage error : errors) {

                System.out.println(error);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    // Read JSON File
    public static List<Reservation> readReservationsFromJson(String filePath) {

        try {
            return mapper.readValue(new File(filePath), new TypeReference<List<Reservation>>() {
            });

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    // Write JSON File
    public static void writeReservationsToJson(String filePath, List<Reservation> reservations) {

        try {

            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), reservations);

            System.out.println("Reservations Written Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
