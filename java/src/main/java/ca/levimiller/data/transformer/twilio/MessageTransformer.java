package ca.levimiller.data.transformer.twilio;

import ca.levimiller.data.dto.TwilioSmsDto;
import ca.levimiller.data.model.Message;
import ca.levimiller.data.transformer.qualifiers.From;
import ca.levimiller.data.transformer.qualifiers.To;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ContactTransformer.class, MediaTransformer.class})
public interface MessageTransformer {

  @Mapping(source = "messageSid", target = "uid")
  @Mapping(source = ".", target = "toContact", qualifiedBy = To.class)
  @Mapping(source = ".", target = "fromContact", qualifiedBy = From.class)
  @Mapping(source = ".", target = "media")
  Message transform(TwilioSmsDto dto);
}
