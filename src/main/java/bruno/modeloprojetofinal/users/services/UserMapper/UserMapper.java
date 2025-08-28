package bruno.modeloprojetofinal.users.services.UserMapper;

import bruno.modeloprojetofinal.users.dto.UserCreateDTO;
import bruno.modeloprojetofinal.users.dto.UserResponseDTO;
import bruno.modeloprojetofinal.users.entities.User;

public class UserMapper {

    public static User toEntity(UserCreateDTO dto) {
        return new User(
                dto.name(),
                dto.email()
        );
    }

    public static UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
