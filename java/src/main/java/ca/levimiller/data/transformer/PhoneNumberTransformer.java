package ca.levimiller.data.transformer;

import ca.levimiller.data.transformer.qualifiers.PhoneNumber;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneNumberTransformer {

  @PhoneNumber
  default String transform(String phoneNumber) {
    //+1234567890
    return "+" + phoneNumber.replaceAll("[^0-9]", "");
  }
}
